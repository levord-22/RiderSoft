package com.RiderSoft;

import java.sql.*;

public class TestTaskMySQL {

    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DATABASE_DIR = "localhost";
    private static final String DATABASE_FILE = "rider_soft";
    private static final String DATABASE_URL = "jdbc:mysql://" + DATABASE_DIR + "/" + DATABASE_FILE;


    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public TestTaskMySQL() throws SQLException, ClassNotFoundException {
        System.out.println("Registering JDBC driver...");
        Class.forName(JDBC_DRIVER);
    }

    public static Connection getConnection() throws SQLException {
        System.out.println("Creating database connection...");
        return DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
    }

    public static void main(String[] args) {
        try(Connection connection = new TestTaskMySQL().getConnection();
            Statement  statement = connection.createStatement()){

            String sql = "SELECT department, SUM(salary) AS 'Total salary' FROM employees GROUP BY department";
            ResultSet resultSet = statement.executeQuery(sql);

            System.out.println("Retrieving data from database...");
            System.out.println("================\n");

            while(resultSet.next()){
                String department = resultSet.getString("department");
                int totalSalary = resultSet.getInt("Total salary");

                System.out.println(department + ": "+  totalSalary);
            }

            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error SQL !");
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC driver not found !");
        }
    }
}

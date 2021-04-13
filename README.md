# RiderSoft
### Задание:

Написать на Java программу которая выполняет запрос SQL из таблицы базы данных и выводит результат на экран.
Для чтения данных программа должна использовать технологию JDBC.
Результат должен выводиться на консоль (GUI не нужен).

В базе данных одна таблица со списком сотрудников. В таблице следующие колонки:

    ID сотрудника
    Имя
    Фамилия
    Отдел
    Зарплата

### Задача: 
вывести на экран список отделов с суммарной зарплатой сотрудников отдела. Например:

* Development: 20000
* Sales: 30000
* Management: 30000

### Оформление

Результатом выполнения задания является файл .java с исходным кодом программы.
Файлы базы данных, файлы конфигурации сборки приложения и скомпилированные классы не нужны.
Тестовые данные

База данных любая по выбору. Например MySQL или PostgreSQL или SQLite.

#### Таблица EMPLOYEES
|EMPLOYEE_ID| 	FIRST_NAME| 	LAST_NAME| 	DEPARTMENT| 	SALARY|
|:----:|:----:|:----------:|:----:|:----------:|
|1|  	           John| 	     Smith|     	Development| 	5000|
|2|	           Nick| 	     Johnson|  	Development| 	6000|
|3| 	           Mary| 	     Johnson|  	Sales| 	      4000|
|4|              Cristopher|  Robin|    	Sales| 	      4000|
|5| 	           Harry| 	     Gates| 	    Management| 	  8000|

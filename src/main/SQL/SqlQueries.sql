- Write a query to select all records from a table employees 

Select * from Employees;

- Write a query to select all employees from the employees table who earn more than 50,000.

Select * from Employees where salary > 50000;

- Write a query to find the top 10 highest-paid employees.

Select * from Employees ORDER BY SALARY DESC LIMIT 10;

- Write a query to count the total number of employees in the employees table.

SELECT COUNT(*) from EMPLOYEES;

- Find the average salary of employees in the employees table.
SELECT AVG(SALARY) FROM EMPLOYEES;

- Find the maximum and minimum salary in the employees table.
SELECT MAX(SALARY) FROM EMPLOYEES;

SELECT MIN(SALARY) FROM EMPLOYEES;

- Write a query to find the average salary per department in the employees table.
SELECT DEPARTMENT, AVG(SALARY) FROM EMPLOYEE GROUP BY DEPARTMENT;

- Write a query to find departments with an average salary greater than 60,000.
SELECT department, AVG(SALARY) from employee group by department HAVING AVG(Salary) > 60,000;

- Write a query to find all employees with their department names using INNER JOIN.
Select employees.name, employees.department from employees INNER JOIN department  ON employee.department_id = department.id;

- Write a query to find all employees and their departments, even if they do not belong to any department.
Select employees.name, employees.department from Employees LEFT JOIN department  ON employee.department_id = department.id;

- Write a query to find employees whose salary is greater than the average salary of all employees.
SELECT * FROM EMPLOYEES WHERE SALARY > (SELECT AVG(SALARY) FROM EMPLOYEES);

- Write a query to find all employees and their managers. The employees table has an employee_id and manager_id(which references the employee_id).
SELECT e1.name AS employee, e2.name AS manager FROM employees e1 LEFT JOIN employees e2 ON e1.manager_id = e2.employee_id; 

- Write a query to find all unique job titles from the employees table.
Select distinct job from EMPLOYEES;

- Write a query to fetch the second page of results (assuming each page has 10 records).
SELECT * FROM employees LIMIT 10 OFFSET 10;

- Write a query to concatenate the first and last names of employees.
SELECT CONCAT(first_name, ' ', last_name) AS full_name FROM employees;

- Write a query to find employees whose name starts with "A".
SELECT * FROM employees WHERE name LIKE 'A%';

- Write a query to find all employees hired in 2020.
Select * from employees where YEAR(hire_date) = 2020;

- Write a query to update an employee’s salary.
UPDATE employees SET salary = 60000 WHERE employee_id = 5;

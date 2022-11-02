-- 1. List all the employees' first and last name with their salary in employees table
SELECT first_name,last_name,salary
FROM employees;

-- 2. how many employees have salary less than 5000?
SELECT COUNT(*)
FROM employees where salary<5000;
-- 3. how many employees have salary between 6000 and 7000?
SELECT COUNT(*)
FROM employees
WHERE salary BETWEEN 6000 AND 7000;
-- 4. List all the different region_ids in countries table
SELECT DISTINCT region_id
FROM countries;
-- 5. display the salary of the employee Grant Douglas (lastName: Grant, firstName: Douglas)
SELECT salary
FROM employees
WHERE last_name = 'Grant' AND first_name = 'Douglas';
-- 6. display the maximum salary in employees table
SELECT MAX(salary)
FROM employees;
-- 7. display all informations of the employee who has the highest salary in employees table
SELECT *
FROM employees
WHERE salary = (SELECT MAX(salary) FROM employees);
-- 8. display the the second maximum salary from the employees table
SELECT MAX(salary)
FROM employees
WHERE salary < (SELECT MAX(salary) FROM employees);
-- 9. display all informations of the employee who has the second highest salary
SELECT *
FROM employees
WHERE salary = (SELECT MAX(salary)
                FROM employees
                WHERE salary < (SELECT MAX(salary) FROM employees));
-- 10. display the the minimum salary in employees table
SELECT MIN(salary)
FROM employees;
-- 11. display all informations of the employee who has the minimum salary in employees table
SELECT *
FROM employees
WHERE salary = (SELECT MIN(salary) FROM employees);
-- 12. display the second minimum salary from the employees table
SELECT MIN(salary)
FROM employees
WHERE salary > (SELECT MIN(salary) FROM employees);
-- 13. display all informations of the employee who has the second minimum salary
SELECT *
FROM employees
WHERE salary = (SELECT MIN(salary)
                FROM employees
                WHERE salary > (SELECT MIN(salary) FROM employees));
-- 14. display the average salary of the employees;
SELECT AVG(salary)
FROM employees;
-- 15. list all the employees who are making above the average salary;
SELECT *
FROM employees
WHERE salary > (SELECT AVG(salary)
                FROM employees);
-- 16. list all the employees who are making less than the average salary
SELECT *
FROM employees
WHERE salary < (SELECT AVG(salary)
                FROM employees);
-- 17. count the total numbers of the departments in departments table
SELECT COUNT(*) FROM departments;
-- 18. sort the start_date in ascending order in job_history's table
SELECT * FROM job_history
ORDER BY start_date;
-- 19. sort the start_date in descending order in job_history's table
SELECT * FROM job_history
ORDER BY start_date DESC;
-- 20. list all the employees whose first name starts with 'A'
SELECT *
FROM employees
WHERE first_name LIKE 'A%';
-- 21. list all the employees whose job_ID contains 'IT'
SELECT *
FROM employees
WHERE job_id LIKE '%IT%';
-- 22. list all the employees whose department id in 50, 80, 100
SELECT*
FROM employees
WHERE department_id IN (50,80,100);


--TASK 2

-- 1. Show all job_id and average salary who work as any of these jobs IT_PROG, SA_REP, FI_ACCOUNT, AD_VP
SELECT job_id,AVG(salary)
FROM employees
GROUP BY job_id
HAVING job_id IN ('IT_PROG','SA_REP','FI_ACCOUNT','AD_VP');

-- 2. Show all records whose last name contains 2 lowercase 'a's
SELECT *
FROM employees
WHERE last_name LIKE '%a%a%';
--
-- 3. Display max salary for each department
SELECT MAX(Salary),department_id
FROM employees
GROUP BY department_id;
-- 4. Display total salary for each department except department_id 50, and where total salary >30000
SELECT department_id, SUM(salary)
FROM employees
GROUP BY department_id
HAVING SUM(salary) > 30000 AND department_id != 50;
-- 5. Write a SQL query that returns first and last name any employees who started job between 1-JAN-2000 and 3-SEP-2007 from the hr database
SELECT first_name,last_name
FROM employees
WHERE hire_date BETWEEN '1-JAN-2000' AND '3-SEP-2007';

-- 6. Display country_id, country name, region id, region name from hr database
SELECT country_id, country_name,c.region_id,region_name
FROM countries c JOIN regions r
                      ON c.region_id = r.region_id;
-- 7. Display All cities, country names from hr database
SELECT city,country_name
FROM locations JOIN countries c
                    ON locations.country_id = c.country_id;

-- 8. display the first name, last name, department number, and department name, for all employees for departments 80 or 40.
SELECT first_name,last_name,e.department_id,department_name
FROM employees e JOIN departments d
                      ON e.department_id = d.department_id
WHERE e.department_id IN (40,80);
-- 9. Display employees' first name, Lastname department id and all departments including those where do not have any employee.
SELECT first_name,last_name,e.department_id,d.department_id,department_name
FROM employees e RIGHT JOIN departments d
                            on e.department_id = d.department_id;
-- 10. Display the first name, last name, department number, and name, for all employees who have or have not any department
SELECT first_name,last_name,e.department_id,d.department_id,department_name
FROM employees e LEFT JOIN departments d
                           on e.department_id = d.department_id;

-- 11. Display all employee and their manager's names
--employee name , manager name
select e1.first_name||' '||e1.last_name as employee_name, e2.first_name||' '||e2.last_name as manager_name
from employees e1
         left join employees e2
                   on e1.manager_id = e2.employee_id;

SELECT first_name,salary,
       CASE
           WHEN salary <7000 THEN 'UNDER PAID'
           WHEN salary >7000 THEN 'PAID WELL'
           ELSE 'UNPAID'
           END as category
FROM employees;





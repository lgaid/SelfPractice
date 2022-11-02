CREATE TABLE address(

                        address_id Integer PRIMARY KEY,
                        address VARCHAR(50) NOT NULL,
                        phone Integer NOT NULL

);


INSERT INTO address (address_id, address, phone) VALUES (5,  '1913 Hanoi Way'  ,  28303384);
INSERT INTO address (address_id, address, phone) VALUES (7,  '692 Joliet Street'  ,  44847719);
INSERT INTO address (address_id, address, phone) VALUES (8,  '1566 Inegl Manor'  ,  70581400);
INSERT INTO address (address_id, address, phone) VALUES (10,  '1795 Santiago '  ,  86045262);
INSERT INTO address (address_id, address, phone) VALUES (11,  '900 Santiago '  ,  16571220);


CREATE TABLE customer(

                         customer_id Integer PRIMARY KEY,
                         first_name VARCHAR(50) NOT NULL,
                         last_name VARCHAR(50)NOT NULL,
                         address_id Integer REFERENCES address(address_id)

);


INSERT INTO customer (customer_id, first_name, last_name, address_id) VALUES (1, 'Mary' ,  'Smith',  5);
INSERT INTO customer (customer_id, first_name, last_name, address_id) VALUES (2,  'Patricia' ,  'Johnson' ,  NULl);
INSERT INTO customer (customer_id, first_name, last_name, address_id) VALUES (3,  'Linda' ,  'Williams' ,  7);
INSERT INTO customer (customer_id, first_name, last_name, address_id) VALUES (4, 'Barbara' ,  'Jones' , 8);
INSERT INTO customer (customer_id, first_name, last_name, address_id) VALUES (5,  'Elizabeth' ,  'Brown' ,  NULL);


commit work;


SELECT * FROM scrumteam;

--ADDING NEW COLUMN
ALTER TABLE scrumteam ADD salary Integer;

UPDATE ScrumTeam
SET salary = 120000
WHERE Emp_ID = 1;


UPDATE ScrumTeam
SET salary = 150000
WHERE Emp_ID = 2;


UPDATE ScrumTeam
SET salary = 90000
WHERE Emp_ID = 4;


--rename the column
ALTER TABLE scrumteam RENAME COLUMN salary TO annual_salary;

SELECT * FROM scrumteam;

--delete/drop column
ALTER TABLE scrumteam DROP COLUMN annual_salary;

--how to change table name
ALTER TABLE scrumteam RENAME TO agileteam;

SELECT * FROM agileteam;

TRUNCATE TABLE agileteam;

DROP TABLE agileteam;


CREATE TABLE address(

                        address_id Integer PRIMARY KEY,
                        address VARCHAR(50) NOT NULL,
                        phone Integer NOT NULL

);


INSERT INTO address (address_id, address, phone) VALUES (5,  '1913 Hanoi Way'  ,  28303384);
INSERT INTO address (address_id, address, phone) VALUES (7,  '692 Joliet Street'  ,  44847719);
INSERT INTO address (address_id, address, phone) VALUES (8,  '1566 Inegl Manor'  ,  70581400);
INSERT INTO address (address_id, address, phone) VALUES (10,  '1795 Santiago '  ,  86045262);
INSERT INTO address (address_id, address, phone) VALUES (11,  '900 Santiago '  ,  16571220);


CREATE TABLE customer(

                         customer_id Integer PRIMARY KEY,
                         first_name VARCHAR(50) NOT NULL,
                         last_name VARCHAR(50)NOT NULL,
                         address_id Integer REFERENCES address(address_id)

);


INSERT INTO customer (customer_id, first_name, last_name, address_id) VALUES (1, 'Mary' ,  'Smith',  5);
INSERT INTO customer (customer_id, first_name, last_name, address_id) VALUES (2,  'Patricia' ,  'Johnson' ,  NULl);
INSERT INTO customer (customer_id, first_name, last_name, address_id) VALUES (3,  'Linda' ,  'Williams' ,  7);
INSERT INTO customer (customer_id, first_name, last_name, address_id) VALUES (4, 'Barbara' ,  'Jones' , 8);
INSERT INTO customer (customer_id, first_name, last_name, address_id) VALUES (5,  'Elizabeth' ,  'Brown' ,  NULL);


SELECT * FROM  customer;
SELECT * FROM address;

SELECT first_name,last_name,address,phone
FROM customer INNER JOIN address
                         ON customer.address_id = address.address_id;

SELECT first_name,last_name,address,phone
FROM customer LEFT JOIN address
                        ON customer.address_id = address.address_id;

SELECT first_name,last_name,address,phone
FROM customer RIGHT JOIN address
                         ON customer.address_id = address.address_id;

SELECT first_name,last_name,address,phone
FROM customer FULL OUTER JOIN address
                              ON customer.address_id = address.address_id;


--get me first_name,lastname,department name,city,country_name for all employees

SELECT * FROM employees;

SELECT * FROM departments;

--display firstname,lastname,department name

SELECT first_name,last_name,department_id
FROM employees;

--display firstname,lastname,department name

SELECT first_name,last_name,e.department_id,department_name
FROM employees e LEFT JOIN departments d
                           ON e.department_id = d.department_id;

--get me first_name,last_name,department_name,city for all employees

SELECT * FROM departments;

SELECT * FROM locations;

SELECT first_name,last_name,department_name,city
FROM employees JOIN departments d
                    on employees.department_id = d.department_id
               JOIN locations l
                    on d.location_id = l.location_id;

--get me first_name,lastname,department name,city,country_name for all employees

SELECT first_name,last_name,department_name,city,country_name
FROM employees JOIN departments d
                    on employees.department_id = d.department_id
               JOIN locations l
                    on d.location_id = l.location_id
               JOIN countries c
                    on l.country_id = c.country_id;


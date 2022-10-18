create table Developers(
                           Id_Number Integer primary key,
                           Names varchar(30),
                           Salary Integer
);

create table Testers(
                        Id_Number Integer primary key,
                        Names varchar(30),
                        Salary Integer
);

insert into developers values (1, 'Mike', 155000);
insert into developers values (2, 'John', 142000);
insert into developers values (3, 'Steven', 850000);
insert into developers values (4, 'Maria', 120000);
insert into testers values (1, 'Steven', 110000);
insert into testers values(2, 'Adam', 105000);
insert into testers values (3, 'Lex', 100000);


SELECT * FROM testers;
SELECT * FROM developers;


SELECT names FROM developers
UNION
SELECT names FROM testers;

SELECT names FROM developers
EXCEPT
SELECT names FROM testers;

SELECT names FROM developers
INTERSECT
SELECT names FROM testers;



CREATE TABLE Towns (
                       id SERIAL UNIQUE NOT NULL,
                       code VARCHAR(10) NOT NULL, -- not unique
                       article TEXT,
                       name TEXT NOT NULL -- not unique
);


insert into towns (
    code, article, name
)
select
    left(md5(i::text), 10),
    md5(random()::text),
    md5(random()::text)
from generate_series(1, 1000000) s(i);


SELECT COUNT(*)
FROM towns;

SELECT * FROM towns;

--BREAK UNTIL 12:05

EXPLAIN ANALYSE
SELECT *
FROM towns
WHERE name = '0d6442eb71fa171cef891133c55b7d50';
--43ms
EXPLAIN ANALYSE
SELECT *
FROM Towns
WHERE id =1232;

--0.04ms

CREATE INDEX idx_towns_name ON towns(name);

--how to drop index
DROP INDEX IF EXISTS idx_towns_name;

--how to check available indexes in database
SELECT
    tablename,
    indexname,
    indexdef
FROM
    pg_indexes
WHERE
        schemaname = 'public'
ORDER BY
    tablename,
    indexname;

CREATE OR REPLACE FUNCTION get_jobId_count_by_name(job_name varchar)
    returns int
    language plpgsql
AS
    $$
    DECLARE
jobId_count integer;
BEGIN
SELECT COUNT(*)
INTO jobId_count
FROM employees
WHERE job_id = job_name;

RETURN jobId_count;
END
    $$;

select get_jobId_count_by_name('SA_REP');


DROP FUNCTION get_jobId_count_by_name(job_name varchar);

CREATE OR REPLACE FUNCTION get_employees_managed_by_id(mngr_id integer)
    returns table
        (
            employee_firstname varchar,
            employee_lastname varchar
        )
    language plpgsql
AS
$$

BEGIN
RETURN QUERY
SELECT first_name,last_name
FROM employees
WHERE manager_id = mngr_id;
END
$$;

SELECT * FROM get_employees_managed_by_id(103);


CREATE TABLE ScrumTeam(
                          Emp_ID Integer PRIMARY KEY,
                          FirstName varchar(30) NOT NULL,
                          LastName varchar(30),
                          JobTitle varchar(20)
);


INSERT INTO ScrumTeam (Emp_ID, FirstName, LastName, JobTitle)
VALUES (1,'Severus','Snape','Tester');

INSERT INTO ScrumTeam VALUES (2,'Harold','Finch','Developer');

INSERT INTO ScrumTeam VALUES (3,'Phoebe','Buffay','ScrumMaster');

INSERT INTO ScrumTeam VALUES (4,'Michael','Scofield','PO');

SELECT * FROM scrumteam;

--write a procedure that will accept 2 params, emp_id, job_title , it will update that employee job title
--based on what we provide

CREATE OR REPLACE PROCEDURE update_jobTitle_by_id(empId integer, job_title varchar)
    language plpgsql
AS
    $$
BEGIN
UPDATE scrumteam
SET jobtitle = job_title
WHERE emp_id = empId;

END
    $$;

call update_jobTitle_by_id(4,'Spring Developer');

Select * FRom scrumteam;


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

SELECT employee_id,first_name,last_name,manager_id
FROM employees;

--self join
SELECT e1.employee_id, e1.first_name,e1.last_name,e1.manager_id,e2.employee_id,e2.first_name,e2.last_name
FROM employees e1 LEFT JOIN employees e2
                            ON e1.manager_id = e2.employee_id;


DROP TABLE IF EXISTS mentors;
CREATE TABLE mentors(
                        id INT GENERATED ALWAYS AS IDENTITY,
                        first_name varchar(40) not null,
                        last_name varchar(40) not null ,
                        primary key(id)
);

DROP TABLE IF EXISTS mentor_audit;
CREATE TABLE mentor_audit(
                             id INT GENERATED ALWAYS AS IDENTITY,
                             mentor_id INT not null,
                             last_name varchar(40) not null ,
                             changed_on timestamp(6) not null,
                             primary key(id)
);


insert into mentors(first_name, last_name) values ('Harold','Finch');
insert into mentors(first_name, last_name) values ('Severus','Snape');

SELECT * FROM mentors;
SELECT * FROM mentor_audit;


DROP TABLE IF EXISTS mentors;
CREATE TABLE mentors(
                        id INT GENERATED ALWAYS AS IDENTITY,
                        first_name varchar(40) not null,
                        last_name varchar(40) not null ,
                        primary key(id)
);

DROP TABLE IF EXISTS mentor_audit;
CREATE TABLE mentor_audit(
                             id INT GENERATED ALWAYS AS IDENTITY,
                             mentor_id INT not null,
                             last_name varchar(40) not null ,
                             changed_on timestamp(6) not null,
                             primary key(id)
);


insert into mentors(first_name, last_name) values ('Harold','Finch');
insert into mentors(first_name, last_name) values ('Severus','Snape');

SELECT * FROM mentors;
SELECT * FROM mentor_audit;

CREATE OR REPLACE FUNCTION log_last_name_changes()
    returns trigger
    language plpgsql
AS
    $$
BEGIN
        IF NEW.last_name <> OLD.last_name THEN
                INSERT INTO mentor_audit (mentor_id, last_name, changed_on) VALUES
                (OLD.id,OLD.last_name,now());
end if;
RETURN NEW;
end
$$;

CREATE TRIGGER last_name_change
    BEFORE UPDATE
    ON mentors
    FOR EACH ROW
    EXECUTE FUNCTION log_last_name_changes();

UPDATE mentors
SET last_name = 'XYZ'
WHERE id = 2;




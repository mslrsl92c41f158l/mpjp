-- Salary: maggiore, minore, somma, media
SELECT MAX(SALARY), MIN(SALARY), SUM(SALARY), avg(SALARY)
FROM EMPLOYEES;


-- Come sopra, ma per ogni job_id
SELECT MAX(SALARY), MIN(SALARY), SUM(SALARY), avg(SALARY)
FROM EMPLOYEES
group by JOB_ID;


-- Quanti dipendenti per ogni job_id
SELECT JOB_ID, COUNT(employee_ID)
FROM employees
group by JOB_ID;

-- Quanti sono gli IT_PROG
select count(employee_id)
from employees
where JOB_ID LIKE 'it_prog';


-- Quanti sono i manager
SELECT COUNT(distinct MANAGER_ID)
FROM EMPLOYEES;


-- Nome dei dipendenti che non sono manager
SELECT FIRST_NAME, LAST_NAME
FROM EMPLOYEES
WHERE EMPLOYEE_ID NOT IN( 
SELECT distinct MANAGER_ID 
FROM EMPLOYEES 
WHERE MANAGER_ID IS NOT NULL);


-- Qual è la differenza tra il salario maggiore e il minore
SELECT MAX(SALARY) AS MASSIMO, MIN(SALARY) AS MINIMO, (MAX(SALARY) - MIN(SALARY))
FROM EMPLOYEES;

-- Come sopra, ma per ogni job_id, non considerando dove non c’è differenza
SELECT MAX(SALARY) AS MASSIMO, MIN(SALARY) AS MINIMO, (MAX(SALARY) - MIN(SALARY)) AS DIFFERENZA
FROM EMPLOYEES
group by JOB_ID
HAVING MAX(SALARY) != MIN(SALARY);

-- Qual è il salario minimo (con i dipendenti raggruppati per manager), non considerare chi non ha manager, né i gruppi con salario minimo inferiore a 6.000€
select min(salary)
from employees
group by MANAGER_ID
having MANAGER_ID is NOT null and min(salary)>6000;
-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-- pAG. 2
-- Indirizzi completi, tra locations e countries NAME
SELECT STREET_ADDRESS, country_name
from locations join countries
using (country_id);


-- Employees 
-- Nome di tutti i dipendenti e nome del loro department
select first_name, last_name, department_name
FROM employees join departments
USING (DEPARTMENT_ID);

-- Come sopra, ma solo per chi è basato a Toronto
SELECT First_name, last_name, department_name
FROM employees JOIN departments
USING (DEPARTMENT_ID)
WHERE LOCATION_ID = 1800;

-- Chi è stato assunto dopo David Lee
select first_name, last_name, hire_date
FROM EMPLOYEES 
WHERE HIRE_DATE > ( SELECT HIRE_DATE
FROM EMPLOYEES WHERE last_NAME = 'lee');



-- Chi è stato assunto prima del proprio manager

SELECT e.first_name, e.last_name, e.hire_date
from employees e join employees m
on (e.manager_id = m.employee_id)
where e.hire_date > m.hire_date;


-- Chi ha lo stesso manager di Lisa Ozer
SELECT first_name, last_name 
from employees 
where manager_id = ( select manager_id from employees where LAST_NAME = 'ozer');



-- Chi lavora in un department in cui c’è almeno un employee con una ‘u’ nel cognome
SELECT LAST_NAME, FIRST_NAME
FROM EMPLOYEES 
where department_id
in ( select distinct department_id from employees where last_name LIKE '%U%');


-- Chi lavora nel department Shipping
 select LAST_NAME, FIRST_NAME
from employees join departments
using ( department_id)
where DEPARTMENT_NAME = 'shipping';



-- Chi ha come manager Steven King
SELECT LAST_NAME, FIRST_NAME
FROM EMPLOYEES
where manager_id in (select EMPLOYEE_ID from employees where LAST_NAME = 'king' and first_name = 'Steven');




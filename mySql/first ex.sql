select*from me.employees;

SELECT first_name, LAST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE FROM employees
order by last_name, FIRST_NAME;

SELECT * FROM employees where first_name = 'David' or first_name = 'Peter';

SELECT * FROM employees where DEPARTMENT_ID in (30, 50);
SELECT * FROM employees where DEPARTMENT_ID = 60;
SELECT * FROM employees where SALARY> 10000;

SELECT * FROM employees where (salary < 4000 or salary > 15000 ) and department_id = 50 or department_id = 80;


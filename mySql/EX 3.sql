SELECT LAST_NAME, SALARY, TRUNCATE(salary +(salary*8.5)/100, 2) as increment, TRUNCATE(abs(salary*8.5/100), 2) as delta
FROM employees;

SELECT HIRE_DATE, DATEDIFF ( CURDATE(), hire_date) as differenza
FROM employees;

SELECT ifnull(COMMISSION_PCT, 'NO VALUE') AS COMMISSION
FROM EMPLOYEES;

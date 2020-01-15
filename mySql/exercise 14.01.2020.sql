-- nr. 1
SELECT e.LAST_NAME, e.FIRST_NAME, d.DEPARTMENT_NAME
from employees e JOIN DEPARTMENTS d
using (DEPARTMENT_ID);

-- nr. 2
SELECT e.LAST_NAME, e.FIRST_NAME, J.JOB_TITLE
from employees e JOIN JOBS J
USING (JOB_ID);

-- nr. 3
SELECT e.LAST_NAME, e.FIRST_NAME
from employees e join jobs j
using (job_id)
where (e.SALARY = j.MIN_SALARY) or (e.SALARY=j.MAX_SALARY);

-- nr.4 
select LAST_NAME, FIRST_NAME, country_id
from employees join departments
using (department_id) join locations
using (location_id)
where country_ID = 'UK';

-- nr. 5
SELECT d.DEPARTMENT_NAME, LAST_NAME, FIRST_NAME
FROM departments d join employees 
on(d.MANAGER_ID = EMPLOYEE_ID);

-- pag. 2
-- nr. 6
SELECT D.DEPARTMENT_NAME, e.LAST_NAME, e.FIRST_NAME
from DEPARTMENTS D LEFT OUTER JOIN employees e
ON(D.MANAGER_ID = EMPLOYEE_ID);

-- nr. 7 
SELECT DEPARTMENT_NAME
from DEPARTMENTS 
where MANAGER_ID is NULL;

-- nr. 8
SELECT concat (e.LAST_NAME, ' ',  e.FIRST_NAME) as employees, concat (m.last_name, ' ' , m.first_name) as manager
from employees e left outer join employees m
on (e.manager_id = m.employee_id);




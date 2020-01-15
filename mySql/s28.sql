-- left outer join
select first_name, department_name
from employees left outer join departments
using(department_id);

select first_name, last_name, department_name
from employees right outer join departments
using(department_id)
where department_id between 110 and 120;

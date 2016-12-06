select department_id, count(department_id) 근무자수
from employees
group by department_id
having count(department_id) <=5 and department_id is not null
order by department_id asc
/

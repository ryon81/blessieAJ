select e.first_name ||' ' || e.last_name || '의 매니저는 ' || m.first_name ||' '|| m.last_name || '입니다. '
from employees e, employees m
where e.employee_id = m.manager_id
/

select e.first_name ||' ' || e.last_name || '�� �Ŵ����� ' || m.first_name ||' '|| m.last_name || '�Դϴ�. '
from employees e, employees m
where e.employee_id = m.manager_id
/

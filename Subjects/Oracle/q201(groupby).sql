select department_id, count(department_id) �ٹ��ڼ�
from employees
group by department_id
having count(department_id) <=5 and department_id is not null
order by department_id asc
/

select employee.ename || '�� �Ŵ����� ' || manager.ename || '�Դϴ�. '
from emp employee, emp manager
where employee.mgr = manager.empno

/

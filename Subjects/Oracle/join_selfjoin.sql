select employee.ename || '의 매니저는 ' || manager.ename || '입니다. '
from emp employee, emp manager
where employee.mgr = manager.empno

/

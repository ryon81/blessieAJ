select ename, deptno
from emp
where deptno=(select deptno from dept where loc='DALLAS')

/

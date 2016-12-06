select ename, deptno
from emp
where deptno=(select deptno from emp where ename='SCOTT')

/

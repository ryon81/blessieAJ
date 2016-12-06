select ename, sal
from emp
where deptno=(select deptno from dept where dname='SALES')

/

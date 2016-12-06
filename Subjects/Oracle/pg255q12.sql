select ename, sal
from emp
where sal > all (select sal
from emp
where job='SALESMAN')
and deptno <> 20
/

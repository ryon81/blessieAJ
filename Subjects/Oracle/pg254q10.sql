select ename, sal, job
from emp
where sal > any (select sal
from emp
where job='SALESMAN')
and job <> 'SALESMAN'
/

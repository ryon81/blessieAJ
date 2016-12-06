select ename, sal, job
from emp
where sal > all (select sal
from emp
where job='SALESMAN'
)
/

select deptno, count(*), count(comm)
from emp
group by deptno
/

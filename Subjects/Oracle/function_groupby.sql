select deptno, avg(sal)
from emp
group by deptno
order by deptno asc
/

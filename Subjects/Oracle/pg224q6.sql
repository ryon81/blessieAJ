select e.ename, d.deptno, d.dname
from emp e, dept d
where e.deptno (+) = d.deptno
order by d.deptno
/

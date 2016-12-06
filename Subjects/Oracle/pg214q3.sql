select e.ename, dname
from emp e, dept d
where e.deptno = d.deptno
and job='MANAGER'
/

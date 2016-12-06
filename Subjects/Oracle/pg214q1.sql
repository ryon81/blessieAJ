select e.ename, e.sal
from emp e, dept d
where e.deptno = d.deptno
and loc='NEW YORK'
/

select e.ename, e.hiredate
from emp e, dept d
where e.deptno = d.deptno
and dname='ACCOUNTING'
/

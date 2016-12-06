select deptno, dname, loc
from dept
where deptno in (select deptno from emp where job='MANAGER')
/

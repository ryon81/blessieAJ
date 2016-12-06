select empno, ename, job, mgr, hiredate, sal, comm, deptno
from emp
where mgr=(select mgr from emp where ename='SCOTT')
/

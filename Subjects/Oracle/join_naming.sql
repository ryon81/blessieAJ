select E.ENAME, D.DNAME, E.DEPTNO, D.DEPTNO
from EMP E, DEPT D
where E.DEPTNO = D.DEPTNO
and E.ENAME='SCOTT'
/
select ename, deptno, decode(deptno, 10, 'ACCOUNTING', 20,'RESEARCH',30,'SALES',40,'OPERATIONS') as DNAME
from emp
/

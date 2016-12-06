insert all
into emp_hr values (empno, ename, hiredate)
into emp_mgr values (empno, ename, mgr)
select empno, ename, hiredate, mgr
from emp
where deptno = 20 
/

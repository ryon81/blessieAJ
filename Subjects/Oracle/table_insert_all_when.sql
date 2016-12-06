insert all
when hiredate > '1982/01/01' then
into EMP_HR02 values(empno, ename, hiredate)
when sal > 2000 then
into emp_sal values(empno, ename, sal)
select empno, ename, hiredate, sal from emp
/

select empno, ename, sal, deptno
from emp
where sal in (select max(sal)
from emp
group by deptno)
/

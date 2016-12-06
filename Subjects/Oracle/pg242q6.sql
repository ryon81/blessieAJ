select ename, sal
from emp
where mgr=(select empno from emp where ename='KING')

/

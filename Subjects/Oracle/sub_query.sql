select ename, sal
from emp
where sal=(select max(sal) from emp)
/

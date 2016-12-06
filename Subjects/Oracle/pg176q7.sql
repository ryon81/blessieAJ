select empno, ename, nvl(to_char(mgr),'C E O') MANAGER
from emp
where mgr is null
/

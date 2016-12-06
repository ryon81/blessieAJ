select work.ename, work.job
from emp work, emp manager
where manager.empno = work.mgr
and manager.ename='KING'
/

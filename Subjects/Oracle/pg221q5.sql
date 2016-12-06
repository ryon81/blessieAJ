select work.ename, friend.ename
from emp work, emp friend
where work.deptno = friend.deptno
and work.ename='SCOTT'
and friend.ename<>'SCOTT'

/

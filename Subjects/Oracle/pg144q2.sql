select empno, ename, job
from emp
where lower(job) = 'manager'
/

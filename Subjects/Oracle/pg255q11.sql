select ename, job
from emp
where job = any (select job
from emp
where ename='SMITH')
and ename <> 'SMITH'
/

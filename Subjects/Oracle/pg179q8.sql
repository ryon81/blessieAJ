select empno, ename, job, sal,
decode(job,'SALESMAN',SAL*1.10,'MANAGER', sal*1.15,'CLERK',sal*1.20,sal) UpSAL
from emp
/

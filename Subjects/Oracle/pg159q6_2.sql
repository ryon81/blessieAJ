select sysdate-hiredate 근무일수, round((sysdate-hiredate)/365) 근속년수
from emp
/

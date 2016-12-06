select ename, deptno, sal,
case when sal >= 3000 then '임원' 
     when sal >= 2000 then '관리자'
     when sal < 2000 then '사원'
end as 직급
from emp

/

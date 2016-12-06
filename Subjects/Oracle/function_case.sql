select ename, deptno, 
case when deptno=10 then 'ACCOUNTING' 
     when deptno=20 then 'RESEARCH'
     when deptno=30 then 'SALES'
     when deptno=40 then 'OPERATIONS'
end as DNAME
from emp

/

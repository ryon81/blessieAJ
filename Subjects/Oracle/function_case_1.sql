select ename, deptno, sal,
case when sal >= 3000 then '�ӿ�' 
     when sal >= 2000 then '������'
     when sal < 2000 then '���'
end as ����
from emp

/

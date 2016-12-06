update sam02
set sal=sal+1000
where deptno=(select deptno from dept where loc='DALLAS')
/

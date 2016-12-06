declare
 vemp emp%rowtype;
 vdname varchar2(14)
begin

 dbms_output.put_line('사번 / 이름 / 부서명');
 dbms_output.put_line('------------------------------');
 
 select * into vemp
 from emp
 where ename='SCOTT';
 
 if (vemp.deptno =10) then 
 vdname :='ACCOUNTING';
 elsif (vemp.deptno =20) then
 vdname :='RESEARCH';
 elsif (vemp.deptno =30) then
 vdname :='SALES';
 elsif (vemp.deptno =40) then
 vdname :='OPERATION';
 end if; 
 
 DBMS_output.put_line(vemp.empno||' / '||vemp.ename||' / ' ||vdname);
 
 end;
 /
 

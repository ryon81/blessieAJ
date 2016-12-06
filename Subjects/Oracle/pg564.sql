declare
 vemp emp%rowtype;
 annsal number(7,2);
begin
 
 select * into vemp
 from emp
 where ename='SCOTT' ;
 
 if (vemp.comm is null) then 
 annsal := vemp.sal*12;
 else
 annsal := vemp.sal*12 + vemp.sal;
 
 end if;
 
 dbms_output.put_line('사번 / 이름 / 연봉');
 dbms_output.put_line('------------------------------');
 DBMS_output.put_line(vemp.empno||' / '||vemp.ename||' / ' ||annsal);
 
 end;
 /
 

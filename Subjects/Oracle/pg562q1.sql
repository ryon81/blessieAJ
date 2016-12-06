declare
 vemp emp%rowtype;
 annsal number(7,2);
begin
 dbms_output.put_line('사번 / 이름 / 연봉');
 dbms_output.put_line('------------------------------');
 
 select * into vemp
 from emp
 where ename='SCOTT' ;
 
 if (vemp.comm is null) then vemp.comm :=0;
 end if;
 
 annsal :=vemp.sal*12 + vemp.comm;
 
 DBMS_output.put_line(vemp.empno||' / '||vemp.ename||' / ' ||annsal);
 
 end;
 /
 

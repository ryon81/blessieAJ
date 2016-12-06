declare
VDEPT DEPT%ROWTYPE;

begin 
dbms_output.put_line('부서 번호 / 부서명 / 지역명');
dbms_output.put_line('---------------------------------------');

 for CNT in 1..4 loop
  select * into VDEPT from DEPT where DEPTNO=10*CNT;
  dbms_output.put_line(VDEPT.DEPTNO ||' / ' ||VDEPT.DNAME||' / '||VDEPT.LOC);
 end loop;
 
 end;
 
 
 
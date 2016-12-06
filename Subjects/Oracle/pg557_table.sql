declare
    type ename_table_type is table of emp.ename%type index by binary_integer;
    type job_table_type is table of emp.job%type index by binary_integer;
    type empno_table_type is table of emp.empno%type index by binary_integer;
    
    ename_table ename_table_type;
    job_table job_table_type;
    empno_table empno_table_type;
    
    i binary_integer := 0;
begin
    for K in (select ename, job, empno from emp) loop
    i := i + 1;
    ename_table(i) := k.ename;
    job_table(i) := k.job;
    empno_table(i) := k.empno;
    end loop;
    
    for J in 1..i loop
       dbms_output.put_line(rpad (empno_table (j),8)
       || ' / ' ||rpad(ename_table(j),12) 
       || ' / ' ||rpad (job_table (j),9)
       );
    end loop;
end;
   
    

 

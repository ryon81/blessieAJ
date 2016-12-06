declare
s number := 0;
begin
    for K in 1..10 loop
    s:=s+K; 
    end loop;
    dbms_output.put_line(s);            
end;

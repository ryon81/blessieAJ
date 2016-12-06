declare
n number := 0;
s number := 0;

begin 
 while n < 10 loop
  n := n + 1;
  s := s + n;
       
 end loop;
 dbms_output.put_line(s);
end;
 
 
 
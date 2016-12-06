declare
m number := 0;
n number := 1;

begin
    loop      
        
        m := m + n;                               
        if (n >= 10) then
            exit;
            end if;
        n := n + 1;  
            
    end loop;
    
    dbms_output.put_line(m);
                
end;
        

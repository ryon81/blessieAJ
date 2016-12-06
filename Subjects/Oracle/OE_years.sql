select customer_id, cust_first_name, to_char(date_of_birth,'yyyy'), round((sysdate-date_of_birth)/365) ����, 
case     when round((sysdate-date_of_birth)/365) >= 60 then '��Ÿ'
           when round((sysdate-date_of_birth)/365) >= 50 then '50��'
           when round((sysdate-date_of_birth)/365) >= 40 then '40��'
           when round((sysdate-date_of_birth)/365) >= 30 then '30��'
           when round((sysdate-date_of_birth)/365) >= 20 then '20��'
           when round((sysdate-date_of_birth)/365) >= 10 then '10��'
     else '��Ÿ'
end as ���ɴ�
from customers

/

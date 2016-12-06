select customer_id, cust_first_name, to_char(date_of_birth,'yyyy'), round((sysdate-date_of_birth)/365) 연령, 
case     when round((sysdate-date_of_birth)/365) >= 60 then '기타'
           when round((sysdate-date_of_birth)/365) >= 50 then '50대'
           when round((sysdate-date_of_birth)/365) >= 40 then '40대'
           when round((sysdate-date_of_birth)/365) >= 30 then '30대'
           when round((sysdate-date_of_birth)/365) >= 20 then '20대'
           when round((sysdate-date_of_birth)/365) >= 10 then '10대'
     else '기타'
end as 연령대
from customers

/

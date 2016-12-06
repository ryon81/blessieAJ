select customer_id, cust_first_name, to_char(date_of_birth,'yyyy') 출생년도, round((sysdate-date_of_birth)/365) 연령, 
case when round((sysdate-date_of_birth)/365) >=10 and round((sysdate-date_of_birth)/365) <=19 then ' 10대 '
when round((sysdate-date_of_birth)/365) >=20 and round((sysdate-date_of_birth)/365) <=29 then ' 20대 '
when round((sysdate-date_of_birth)/365) >=30 and round((sysdate-date_of_birth)/365) <=39 then ' 30대 '
when round((sysdate-date_of_birth)/365) >=40 and round((sysdate-date_of_birth)/365) <=49 then ' 40대 '
when round((sysdate-date_of_birth)/365) >=50 and round((sysdate-date_of_birth)/365) <=59 then ' 50대 '
else ' 기타 '
end 연령대
from customers
/

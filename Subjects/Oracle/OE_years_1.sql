select customer_id, cust_first_name, to_char(date_of_birth,'yyyy') ����⵵, round((sysdate-date_of_birth)/365) ����, 
case when round((sysdate-date_of_birth)/365) >=10 and round((sysdate-date_of_birth)/365) <=19 then ' 10�� '
when round((sysdate-date_of_birth)/365) >=20 and round((sysdate-date_of_birth)/365) <=29 then ' 20�� '
when round((sysdate-date_of_birth)/365) >=30 and round((sysdate-date_of_birth)/365) <=39 then ' 30�� '
when round((sysdate-date_of_birth)/365) >=40 and round((sysdate-date_of_birth)/365) <=49 then ' 40�� '
when round((sysdate-date_of_birth)/365) >=50 and round((sysdate-date_of_birth)/365) <=59 then ' 50�� '
else ' ��Ÿ '
end ���ɴ�
from customers
/

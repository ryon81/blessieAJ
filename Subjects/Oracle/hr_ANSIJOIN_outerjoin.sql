select emp.FIRST_NAME, emp.LAST_NAME, emp.EMAIL, JOB_ID, job_title, department_ID, dep.department_name, loc.city
from employees emp left outer join jobs job using (job_id)
left outer join departments dep using (department_id)
left outer join locations loc using (location_id)
/

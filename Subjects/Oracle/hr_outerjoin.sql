select emp.FIRST_NAME, emp.LAST_NAME, emp.EMAIL, emp.JOB_ID, job.job_title,dep.department_ID, dep.department_name, loc.city
from employees emp, jobs job, departments dep, locations loc
where emp.job_id=job.job_id
and emp.department_id  = dep.department_id (+)
and dep.location_id = loc.location_id (+)
/

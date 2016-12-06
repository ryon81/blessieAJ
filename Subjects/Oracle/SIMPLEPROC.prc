select * from emp;

select * from emp01;

create table emp01 as select * from emp;

set linesize 200;
set pagesize 20;

delete from emp01
where 
empno = 1111;

UPDATE emp01 set empno=2222 where empno=1111;

rollback;

select * from salgrade

select e.ename, d.dname, s.grade
from emp e, dept d, salgrade s
where e.deptno = d.deptno
and e.sal between s. losal and s.hisal




create view emp_sal_grade01 (사번, 사원명, 부서명, 급여등급)
as
select e.empno, e.ename, d.dname, s.salgrade
from empno e, dept d, salgrade s
where e.deptno=d.deptno
and e.sal between s.losal and s.hisal
;



create table TEST1 (id number(4), nm varchar2(10));

drop table test1;

select * from test1;

INSERT into test1 values (3, '세종대왕');

commit;


create or replace procedure simpleProc(i_id in number, v_id out number, v_nm out varchar)
is 
id number;
nm varchar(20);
begin 
select id, nm
into v_id, v_nm
from test1
where id = i_id;
end simpleProc; 


VARIABLE var_id number(4);
VARIABLE var_nm VARCHAR2(10);


EXECUTE simpleProc (1, :var_id,:var_nm);

print var_id;
 

select name, text from user_source;

drop procedure simpleProc;

select * from emp01;


create or replace procedure findName(i_empno in number, v_empno out number, v_ename out varchar, v_job out varchar, v_mgr out number, v_hiredate out varchar, v_sal out number, v_comm out number, v_deptno out number)
is 
empno number;
ename varchar2(10);
job varchar2(9);
mgr number;
hiredate date;
sal number(7,2);
comm number(7,2);
deptno number(2);
begin 
select *
into v_empno, v_ename, v_job, v_mgr, v_hiredate, v_sal, v_comm, v_deptno
from emp01
where empno = i_empno;
end findName; 

desc emp01;

VARIABLE v_empno number(4);
VARIABLE v_ename varchar2(10);
VARIABLE v_job varchar2(9);
VARIABLE v_mgr number;
VARIABLE v_hiredate date;
VARIABLE v_sal number(7,2);
VARIABLE v_comm number(7,2);
VARIABLE v_deptno number(2);

execute findName (7788,:v_empno,:v_ename,:v_job, :v_mgr, :v_hiredate, :v_sal, :v_comm, :v_deptno)

select * from emp01 where empno=7788;


create or replace procedure findTable(i_table in varchar, v_empno out number, v_ename out varchar, v_job out varchar, v_mgr out number, v_hiredate out varchar, v_sal out number, v_comm out number, v_deptno out number)
is 
empno number;
ename varchar2(10);
job varchar2(9);
mgr number;
hiredate date;
sal number(7,2);
comm number(7,2);
deptno number(2);
begin 
select *
into v_empno, v_ename, v_job, v_mgr, v_hiredate, v_sal, v_comm, v_deptno
from emp01
end findTable; 
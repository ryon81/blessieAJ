drop table emp01;

create table emp01
as select * from emp;

select * from emp01;

create or replace procedure
    DEL_ENAME(VENAME EMP01.ENAME%TYPE)
IS
begin
    DELETE FROM EMP01 where ENAME=VENAME;
end;
/

@PROC02

select * from EMP01;

execute DEL_ENAME ('SMITH');
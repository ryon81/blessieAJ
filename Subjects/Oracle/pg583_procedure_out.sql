CREATE OR REPLACE PROCEDURE SEL_EMPNO
(      VEMPNO IN EMP.EMPNO%TYPE,
       VENAME OUT EMP.ENAME%TYPE,
       VSAL OUT EMP.SAL%TYPE,
       VJOB OUT EMP.JOB%TYPE 
)
IS
BEGIN
     SELECT ENAME, SAL, JOB INTO VENAME, VSAL, VJOB
     FROM EMP
     WHERE EMPNO=VEMPNO;
END;
/

VARIABLE VAR_ENAME VARCHAR2(15);
VARIABLE VAR_SAL NUMBER;
VARIABLE VAR_JOB VARCHAR2(9);

EXECUTE SEL_EMPNO(7788, :VAR_ENAME, :VAR_SAL, :VAR_JOB);

PRINT VAR_ENAME;

SELECT * FROM EMP;
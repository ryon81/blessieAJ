CREATE OR REPLACE FUNCTION 
    AVG_MNGSAL(VJOB IN EMP.JOB%TYPE)
    RETURN NUMBER
IS
    VSAL NUMBER(7,2);
BEGIN
    SELECT AVG(SAL) INTO VSAL
    FROM EMP
    WHERE JOB = VJOB
    ;
        
    RETURN VSAL;
END;


VARIABLE VAR_RES NUMBER;

EXECUTE :VAR_RES :=AVG_MNGSAL('MANAGER');

SELECT SAL,CAL_BONUS(7788)
FROM EMP
WHERE EMPNO=7788;



SELECT JOB, AVG(SAL)
FROM EMP
WHERE JOB='MANAGER'
GROUP BY JOB;
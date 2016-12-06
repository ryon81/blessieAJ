CREATE OR REPLACE FUNCTION 
    CAL_BONUS(VEMPNO IN EMP.EMPNO%TYPE)
    RETURN NUMBER
IS
    VSAL NUMBER(7,2);
BEGIN
    SELECT SAL INTO VSAL
    FROM EMP
    WHERE EMPNO = VEMPNO;
    
    RETURN (VSAL * 200);
END;

VARIABLE VAR_RES NUMBER;

EXECUTE :VAR_RES :=CAL_BONUS(7788);

SELECT SAL,CAL_BONUS(7788)
FROM EMP
WHERE EMPNO=7788;
Create or replace view sal_top5_view (Ranking, Empno,ename, sal)
As
Select rownum, empno, ename, sal
From (Select empno, ename, sal
From emp
Order by sal desc)
Where rownum <=3
/

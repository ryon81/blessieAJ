create table member
(
	id VARCHAR2(15),
	password VARCHAR2(10),
	name VARCHAR2(15),
	age NUMBER,
	gender VARCHAR2(5),
	email VARCHAR2(30),
	PRIMARY KEY(id)
)

select * from member

desc member

drop table member

alter table member add regdate date 

insert into member values('aaa','1234','������','35','male','a@naver.com',sysdate)
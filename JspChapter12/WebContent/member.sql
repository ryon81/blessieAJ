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

insert into member values('aaa','1234','Àü¿µ¹Î','35','male','a@naver.com',sysdate)

create table member
(
	id number(30) primary key,
	email VARCHAR2(255) unique,
	password varchar2(100),
	name VARCHAR2(100),
	regdate date	
)

create sequence id_num;

insert into member values (id_num.nextval, 'madvirus@madvirus.net', '1234', 'cbk', sysdate);

select sequence_name from user_sequences;

MainForMemberDao.java

Member.java

MainForMemberDao.java

appCtx.xml

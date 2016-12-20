create table board
(
board_num number,
board_name varchar2(20),
board_pass varchar2(15),
board_subject varchar2(50),
board_content varchar2(2000),
board_file varchar2(50),
board_re_ref number,
board_re_lev number,
board_re_seq number,
board_readcount number,
board_date date,
PRIMARY KEY(board_num)
);

select * from board

desc board

create table board01
as select * from board

select * from board01

drop table board

update board set BOARD_READCOUNT = BOARD_READCOUNT+1 where BOARD_NUM = 8


select * from board where BOARD_NUM = 13

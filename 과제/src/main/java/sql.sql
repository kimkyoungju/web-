drop database if exists boardin;
create database boardin;
use boardin;

create table board(
num int primary key auto_increment,
title varchar(100),
writer varchar(100),
content varchar(100),
pw varchar(100),
day datetime  default now(),
view int default 0




);
insert into board (title,writer,content,pw) values('1','1','1','1');
select  title,writer,content,day,view from board where num = 2;
select  title,writer,content,day,view from board where num = 1;
select* from board;



drop database dice;
create database dice;
drop table idol;
use dice;
create table idol(
	b_nom int primary key auto_increment,
    b_name varchar(5)
	
);
select *from idol;
insert into idol values(null,'아이유'),(null,'박효신'),(null,'마마무');

drop table board1;
create table board1(
	nom int primary key auto_increment,
	b_nom int ,
    title varchar(20),
    writr varchar(5),
    content varchar(100),
    foreign key (b_nom)references idol(b_nom)
	
);
select *from board1;

drop table content;

create table content (
	c_name int,
    writr varchar(5),
    content varchar(100),
    time_ datetime,
    foreign key (c_name) references idol(b_nom)
);
select * from content;
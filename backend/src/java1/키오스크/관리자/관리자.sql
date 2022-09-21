drop database if exists naver_db;
create database naver_db;
use naver_db;
drop table if exists member; 
create table member(
mem_id char(8) not null primary key, -- 만약에 null이면 오류 null을 안준다 
mem_name varchar(10) not null,
mem_number tinyint not null,
addr char(2) not null,
phone1 char(3) null,
phone2 char(8) null,
height tinyint unsigned null, -- tinyint : -128~127 unsigned(0~127) : 음수 제거 
debut_date date null 

);
select *from member;
drop table if exists buy;
create table buy(
	num int auto_increment primary key not null,
	mem_id char(8) not null,
	prod_name char(6) not null,
	group_name char(4)null,
	price	int unsigned not null,
	amount smallint unsigned not null ,-- unsigned 1부터 시작 
	foreign key (mem_id) references member(mem_id)

);
insert into member values('TWC','트와이스',9,'서울','02','1111111',167,'2015-10-19'); 
-- 동일한 아이디로 회원가입한다 [아이디 충돌 pk <--> 식별키 ( 식별용도 고유한 값)]
insert into member values('TWC','트와이스',9,'서울','02','1111111',167,'2015-10-19'); 
 -- twc회원이 지갑을 구매한다
 insert into buy values (null,'TWC','지갑','패션',30,2);
---------------------------------------------------


/*
drop database if exists mammothcafe;
create database mammothcafe;
use mammothcafe;
drop table if exists cafe;

create table cafe(
	menu tinyint primary key auto_increment,
	coffee_name varchar(5) 
);
select *from cafe;

drop table if exists menu;
create table menu(
	mammoth int primary key auto_increment, -- 제품 번호 
    choice_name varchar(10), -- 제품명
	price int,  			-- 가격  
 	mcomment varchar(1000), -- 소개
    amount smallint, 		-- 재고
    mno tinyint,				-- 카테고리 이름
    foreign key (mno) references cafe(menu)
);
select * from menu;


drop table if exists orderby;
create table morder(
	mammoth tinyint primary key auto_increment,			-- 제품 번호
    modate datetime		-- 주문날짜
    -- foreign key (mammoth) references menu(mno)
	-- order_name int, 	-- 제품이름
	-- total_amount int, -- 구매 수량 	

);
drop table real_order;
create table real_order( -- 주문 상세
	moeno int auto_increment primary key,-- 주문상세번호	
    total_amount int,-- 수량 
    mammoth tinyint,-- 주문번호
	order_name int,-- 이름
    foreign key (mammoth) references morder( mammoth),
    foreign key (order_name) references menu(mammoth)
    num int primary key auto_increment,
    real_table int,
    total_num int,
	foreign key (real_table) references orderby( mammoth)

); 


*/

------------------------------------------

-- 매머드 카페 키오스크 
drop database if exists mmth;
create database mmth;
use mmth;
create table menu(
	mno tinyint auto_increment primary key ,	-- 메뉴번호 [ 자동번호 ] PK
	mname varchar(10) 							-- 메뉴이름
);
create table product(
	pno int auto_increment primary key , 		-- 제품 번호 [ 자동번호 ] PK
	pname varchar(50), 							-- 제품명
    pprice int , 								-- 제품가격
    pcomment varchar(1000),						-- 제품소개
    pamount smallint,							-- 제품재고 
    mno tinyint , 								-- 메뉴 이름 [ 대체 -> 이름 번호 ] 
    foreign key( mno ) references menu( mno ) 
);

create table porder(
	pono int auto_increment	primary key,	 		-- 주문 번호 [ 자동번호 ] PK
    podate datetime 								-- 주문 날짜/시간
);
create table porder_detail( 
	podeno int auto_increment primary key ,			-- 주문 상세 번호 PK
    poamount int,									-- 제품 수량 
    pono 	int	,									-- 주문 번호 
    pno		int ,									-- 제품 이름 [ 대체 -> 제품 번호 ] 
    foreign key( pono ) references porder( pono ),	-- 주문 번호를 	FK로 설정
    foreign key( pno ) references product( pno )	-- 제품 번호를 	FK로 설정
);


insert into menu values (null,'커피');
select * from menu;

insert into product values( null,'아이스아메리카노',2000,'시원한커피',20,1);
select * from product;

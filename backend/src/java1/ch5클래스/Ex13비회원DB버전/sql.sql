create database boardtest;

use boardtest;

create table board(
	-- 테이블명약자_필드명
    b_no int primary key auto_increment ,
    -- auto_increment : 자동번호 부여(1번부터 부여)
    b_title varchar(100) ,  -- 최대 100글자
    b_content varchar(500) , -- 최대 500글자
    b_writer varchar(10), -- 최대 10글자
    b_password varchar(4) ,  -- int 20억까지
    b_view int
);

-- 4. 테이블 확인alter
select * from board;

-- 5.테이블에 레코드 추가하는 방법
	-- 1.모든 필드를 추가하는법[필드생략가능]
		-- insert into 테이블명 values(값1,값2 ...);
    -- 2. 특정필드 추가하는 경우[필드명 표기필수]
		-- insert into 테이블명 (필드명1, 필드명2 ..);
        
insert into board( b_title , b_content , b_writer , b_password , b_view)values('제목변수','내용변수','유재석','1234',0);

-- 6.테이블에 모든 레코드 확인
select *from board;

-- 7.개수
	-- count(필드명)	:  
    
select count(*)from board;
	-- 레코드 하나의 하나필드에 게시물 수 표시
    
-- 8.특정 조건이 있는 게시물 조회
select * from board where b_no = 1; -- 번호가 1번인 게시물 조회
select * from board where b_writer = 1;
select * from board where b_writer = 유재석;


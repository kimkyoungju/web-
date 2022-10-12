drop database if exists jspweb;
create database jspweb;
use jspweb;
create table member(

	mno int auto_increment primary key,
    mid	varchar(50),
    mpassword varchar(50), 
	mname  varchar(50),
    mphone varchar(15),
    memail varchar(100),
    maddress varchar(100),
    mdate  datetime default now(),   -- 가입일
	mpoint int default 0       -- 포인트
    
);
 -- default 레코드 추가시 기본으로 들어가는 값 설정
    --  mdate  datetime default now() : 현재 시스템 (db)의 자동날짜
  -- insert 문법
	-- 특정 필드만 삽입
select * from member;

-- 로그인 [ 해당 테이블에 동일한 아디이와 패스워드가 존재하는 검색]
	-- select 
	-- select  * from 테이블명 where 아이디 =?  and 비밀번호=?

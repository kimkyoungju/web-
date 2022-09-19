drop database market_db;
drop database if exists market_db;
-- 2. Db 생성
create database market_db;
-- 3 테이블 생성
use market_db; -- use db명 : 해당 db사용 [선택]
drop table if exists member;
create table member(
mem_id char(8) not null primary key,
-- char (길이) : 길이만큼 문자 저장 char(8) : 최대 8글자 저장
-- not null : 공백 저장 불가능 [ 만일 공백아ㅣ 있으며 저장 실패]
-- primary key: *( 기본키 ) 식별키 [ 필드] , 필드내 데이터 중복 불가능 (주민등록번호, 학번 , 회원번호, 사번등)
mem_name varchar(10) not null,
-- varchar(길이 ) : 가변길이  vs char (길이): 고정길이
	-- 가변길이 : 저장된 만큼 메모리 할당,varchar(8)에서 'ABC' 저장시 5칸 메모리 자동 제거 
	-- 고정길이 : 선언된 길이만큼 고정 메모리 할당, char(8)에서 'ABC' 저장시 8칸 메모리 고정 [ 3칸 : ABc : 5칸 : 빈공간]
mem_number int not null, -- 정수를 저장하는 인원수 [공백 불가능]
	-- int : +- 20억까지 저장가능
addr char(2) not null,  -- 최대 2 
phone1 char(3),
phone2 char(8),
height smallint,
-- smallint : +- 3만정도 저장가능
debut_date date
-- date : 날짜 
); 
-- create table 테이블명( 필드명1 자료형 속성, 필드명2 자료형 속성);
select * from member;
-- 구매 테이블 만들기
drop table if exists buy;
create table buy(
num int auto_increment not null primary key, -- 1. 순번[ pk, 자동번호 : auto_increment]
-- auto_increment : 자동번호					--2. 회원 아이디 [member 테이블의 필드와 이름이 같다
										
mem_id char(8)  not null,					-- 3 제품이르
prod_name char(6) not null,                 -- 4 분류
group_name  char(4),
price int not null,
amount smallint not null,
foreign key(mem_id) references member(mem_id) -- 7.member 테이블의 mem_id (px) 필드와 연결 (관계  
-- 참조 ㅣ 다른것을 참조 [ 본다/연결/가져오기 등] 한다
-- foreign key (외래키 ) references 테이블명(기본키)


); 
select * from buy;

/*

관계 : 서로 더른 테이블끼리 연결
membr 테이블 			buy테이블
	mem_id[pk필드]		mem_id[fk필드]
 만일 '트와이스' 가 제품 구매할 경울
  -- 1. member 테이블의 mem_id가 '트와이스'존재한다는 가정하에
  -- 2. 트와이스가 제품 구매시 buy 테이블의 mem_id가 '트와이스' 추가
  -- 트와이스가 제품 구매 
만일 '트와이스'가 제품 3개 구매할경우		1대 다 
	
    membr 테이블 [primary key		buy테이블[foreign key
		mem_id :트와이스				mem_id :트와이스	
									mem_id :트와이스	
									mem_id :트와이스	


*/
INSERT INTO member VALUES('TWC', '트와이스', 9, '서울', '02', '11111111', 167, '2015.10.19');
INSERT INTO member VALUES('BLK', '블랙핑크', 4, '경남', '055', '22222222', 163, '2016.08.08');
INSERT INTO member VALUES('WMN', '여자친구', 6, '경기', '031', '33333333', 166, '2015.01.15');
INSERT INTO member VALUES('OMY', '오마이걸', 7, '서울', NULL, NULL, 160, '2015.04.21');
INSERT INTO member VALUES('GRL', '소녀시대', 8, '서울', '02', '44444444', 168, '2007.08.02');
INSERT INTO member VALUES('ITZ', '잇지', 5, '경남', NULL, NULL, 167, '2019.02.12');
INSERT INTO member VALUES('RED', '레드벨벳', 4, '경북', '054', '55555555', 161, '2014.08.01');
INSERT INTO member VALUES('APN', '에이핑크', 6, '경기', '031', '77777777', 164, '2011.02.10');
INSERT INTO member VALUES('SPC', '우주소녀', 13, '서울', '02', '88888888', 162, '2016.02.25');
INSERT INTO member VALUES('MMU', '마마무', 4, '전남', '061', '99999999', 165, '2014.06.19');

INSERT INTO buy VALUES(NULL, 'BLK', '지갑', NULL, 30, 2);
INSERT INTO buy VALUES(NULL, 'BLK', '맥북프로', '디지털', 1000, 1);
INSERT INTO buy VALUES(NULL, 'APN', '아이폰', '디지털', 200, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '아이폰', '디지털', 200, 5);
INSERT INTO buy VALUES(NULL, 'BLK', '청바지', '패션', 50, 3);
INSERT INTO buy VALUES(NULL, 'MMU', '에어팟', '디지털', 80, 10);
INSERT INTO buy VALUES(NULL, 'GRL', '혼공SQL', '서적', 15, 5);
INSERT INTO buy VALUES(NULL, 'APN', '혼공SQL', '서적', 15, 2);
INSERT INTO buy VALUES(NULL, 'APN', '청바지', '패션', 50, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '지갑', NULL, 30, 1);
INSERT INTO buy VALUES(NULL, 'APN', '혼공SQL', '서적', 15, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '지갑', NULL, 30, 4);

-- 1. db 선택
use market_db;
-- 2. select ~from
select * from member;
	-- select : 테이블에서 데이터를 검색할떄 사용되는 예약어
    -- * : 와일드 카드 모든것 의미 == 모든 필드
    -- from : 테이블 가져온다는 의미
    -- member : 조회할 테이블명 
select mem_name from member; -- 2-1 특정 필드 검색 [ 회원테이블에서 회원명 검색]
select addr , debut_date , mem_name from member; -- 2-2 특정 필드 검색 [ 회원 테이블 에서 주소 , 데뷔 일자, 회원명 검색]
	-- 2-3 별칭 [ 결과(쿼리)의 필드명 바꾸기 ]
		-- 1. 필드명 as 벼칭명 2. 필드명 별칭명 3. 필드명 as'별칭 명' 4.필드명 as 별칭_명
select addr as 주소, debut_date as '데뷔일자', mem_name as 회원_명 from member;
	-- 3. select ~from ~ where : 특정한 조건만 조회하기
    -- select 필드명 from 테이블명 where 조건식 
select * from member where mem_name = '블랙핑크'; -- 3-1 회원명이 블랙핑크인 모든 레코드 검색
select *from member where mem_number = 4;		-- 3-2 회원의 인원수가 4인 레코드 검색 
select mem_id , mem_name from member where height <=162;
							-- 이면서 
select mem_name, height, mem_number from member where height >=165 and mem_number >6;
							-- 이거나
select mem_name,  height, mem_number from member where height >=165 or mem_number>6;	
	-- 3-6 and <-------> between ~ and
select mem_name,  height, mem_number from member where height between 163 and 165;
select mem_name,  height, mem_number from member where height>= 163 and height <=165;
	-- 3 - 7 or <--------> in : 하나라도 포함된						[주소가 경기 혹은 ㅈ전남 혹은 경남 검색]
select mem_name,  addr from member where addr = '경기' or addr = '전남' or addr = '경남' ;
select mem_name,  addr from member where addr in('경기' ,'전남' ,'경남') ;
	-- 3-8 like : 패턴 검색 [일부 글자 검색]
		-- % : 모든 문자 대응 vs __ : _바 갯수 만큼 문자 대응
        -- 김% : 김으로 시작하는 모든 글자 vs김_ : 김으로 시작하는 2글자 
        -- %김% : 김이 포함된 문자 		vs _김_ : 2번째 글자가 '김'인 3글자
        -- %김 : 김으로 끝나는 모든 글자 	vs _김: 김으로 끝나는 2글자 
select * from member where mem_name = '우주소녀'; -- 회원명이 '우주소녀' 검색
select * from member where mem_name like '우%'; -- 회원명이 '우' 시작하는 레코드 검색
select * from member where mem_name like '__핑크' ; -- 회원명이 4글자 이면서  ' 핌크' 로 끝나는 레코드 검색
 
 -- 125 order by :정렬 [모든 명령어 마지막에 작성]						[오름/내림]	오름차순이 기본값		
	-- select * from 테이블명 order by 기준필드 asc / desc; 
select mem_id , mem_name , debut_date from member order by debut_date;	-- 검색 결과를 데뷔일자 기준으로 오름차순
select mem_id, mem_name, debut_date from member order by debut_date desc;  -- 내림 차순으로  
	-- select * from 테이블명 where 조건식 order by 기준필드 asc/desc;
select mem_id , mem_name , debut_date , height from member where height >=164 order by height desc;
select mem_id , mem_name , debut_date , height from member order by height desc where height >=164; -- 오류 where이 끝에 있어서
	-- select *from 테이블명 order by 기준필드1 desc , 기준필드2 adc ; 다수정렬
select mem_id , mem_name, debut_date , height from member where height >=164 order by height desc , debut_date asc; 
-- 키가 동일한경우 날짜 오름차순 정렬을 두번 = 앞전 정렬이 중복이 되었있을떄 중복된 데이터끼리 정렬    

-- 2 . limit  : 출력 개수 제한
	-- limit 시작(0), 개수 : 시작부터 개수만큼 레코드 결과 제한
select *from member limit 3;	-- 전체중 앞에서 3개 레코드만  출력 
select * from member limit 0,3 ; 
select mem_name, height from member order by height desc ;
-- 결과 : 소녀시대 , 잇지 , 트와이스 , 여자친구 , 마마무 , 에이핑크 ~ 오마이걸 
--       0		1		2		3		4		5		~~	10
select mem_name, height from member order by height desc limit 3, 2;

-- 3. distinct : 결과에서 중복 데이터 제거
select addr from member; 			-- 동일한 주소가 존재
select distinct addr from member;	-- 중복 제거

-- 4. group by 절 : 특정 필드 그룹 

select mem_id, amount from buy order by mem_id; -- 회원 아이디 기준으로 정렬 
	-- 집계 함수 [ 미리 만들어진 동작/ 코드 ]
	-- 1. sum (필드명) : 해당 필드의 데이터 총합
    
select sum(amount) from buy;					-- 수량의 총합계
select avg(amount) from buy;					-- 수량의 평균
select min(amount) from buy;					-- 최소값
select max(amount) from buy;					-- 최대값
select count(amount) from buy; 					-- 수량의 레코드수 [null제외]
select count(*) from buy; 						-- 모든 레코드 개수[null포함]
select count(distinct amount) from buy;			-- 레코드 개수 중복제거]

-- 특정 집계 [~~별 합계 , ~~끼리 합계등]
select mem_id, sum(amount) as 수량합계 from buy group by mem_id; 						-- 회원 아디이 별 수량 합계 
select mem_id as 회원_아이디, sum(price*amount) as 총_구매금액 from buy group by mem_id;	-- 회원아이디 별 가격* 수량 
select mem_id , avg(amount) as 수량평균 from buy group by mem_id; 						-- 회원아이디 별 수량 평균
select mem_id , count( phone1 ) as 연락처 from member group by mem_id;				-- 회원 아이디 별 연락처가 있는 회원수  [null제외]수 
select mem_id , count(*) as 회원수 from member group by mem_id;						-- 회원 아이디 별 회원수 

-- 5. having 절 : 그룹 조건
		-- where 일반조건(그룹전) vs having 그룹 조건(그룹후)
select mem_id as 회원_아이디 , sum(price* amount) as 총구매금액
from buy 
where sum (price *amount ) >1000 	-- 오류 발생 : sum( ) : 집계함수 이르모 그룹후에 조건 사용가능
group by mem_id;

select mem_id as 회원_아이디 , sum(price* amount) as 총구매금액
from buy 
group by mem_id
having sum(price *amount ) >1000 	-- 해결 : sum( ) : 집계함수 이르모 그룹후에 조건 사용가능
order by 총구매금액 desc
limit 1;

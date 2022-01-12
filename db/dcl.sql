show databases;

-- webdb 생성
Create database webdb;

-- user 생성 , 비밀번호 생성
create user 'webdb'@'localhost' identified by 'webdb';

-- 권한 부여
grant all privileges on webdb.* to 'webdb'@'localhost';

-- 후 새롭게 커넥션 만들고 접속

--db 테이블 생성후

show tables;

desc emaillist;

-- create
insert into emaillist  values (null,'둘','리','dooly@gmail.com');
insert into emaillist  values (null,'루','피','dooly@gmail.com');

-- read (칼럼은 명시해주자! 메모리아끼자)
select no, first_name, last_name, email from emaillist order by no desc;

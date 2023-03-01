drop database if exists department_db;
create database department_db;
use department_db;


create table department(
	department_id int auto_increment,
	department_name varchar(50),
	department_number int,
	constraint ps_department_id_pk primary key (department_id)
);
insert into department(department_id, department_name, department_number) values (1, 'computer science',20);
insert into department(department_id, department_name, department_number) values (2, 'mathematics',1);
insert into department(department_id, department_name, department_number) values (3, 'physics',2);
commit;
select * from department;



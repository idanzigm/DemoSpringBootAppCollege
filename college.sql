drop table if exists college cascade; 
drop table if exists student cascade; 
drop table if exists course cascade; 
drop table if exists registry cascade; 

create table college (
	college_id serial primary key,
	college_name varchar(50) unique
); 

create table student (
	student_id serial primary key, 
	first_name varchar(20), 
	last_name varchar(20)
); 

create table course (
	course_id serial primary key, 
	course_name varchar(20), 
	description varchar(500), 
	college_name varchar(50),
	foreign key (college_name) references college(college_name) on delete set null
);

create table registry (
	student_id int,  
	course_id int, 
	foreign key (student_id) references student(student_id) on delete set null,
	foreign key (course_id) references course(course_id) on delete set null
);



insert into college(college_name) values('College of Maths and Science'); 
insert into college(college_name) values('College of Arts and Humanities'); 
insert into college(college_name) values('College of Literature'); 
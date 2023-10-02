INSERT INTO student (first_name, last_name) VALUES ('John', 'Doe');
INSERT INTO student (first_name, last_name) VALUES ('Alice', 'Smith');
INSERT INTO student (first_name, last_name) VALUES ('Bob', 'Johnson');
INSERT INTO student (first_name, last_name) VALUES ('Jason', 'Mraz');
INSERT INTO student (first_name, last_name) VALUES ('Hilary', 'Duff');
INSERT INTO student (first_name, last_name) VALUES ('Eliot', 'Gray');
INSERT INTO student (first_name, last_name) VALUES ('Hannah', 'Montana');
INSERT INTO student (first_name, last_name) VALUES ('Grace', 'Flower');
INSERT INTO student (first_name, last_name) VALUES ('George', 'Orwell');

insert into college(college_name) values('College of Maths and Science');
insert into college(college_name) values('College of Arts and Humanities');
insert into college(college_name) values('College of Business and Economics');

insert into course(course_name, description, college_id) values('Calculus', 'Derivatives, Integration, and Infinite Series', 1);
insert into course(course_name, description, college_id) values('Discrete Mathematics', 'Proofs and Data Structures', 1);
insert into course(course_name, description, college_id) values('Works of Shakespeare', 'Critical readings of Othello and King Lear', 2);
insert into course(course_name, description, college_id) values('Normative Ethics', 'Deontology, Consequentialism, and Virtue Ethics', 2);
insert into course(course_name, description, college_id) values('Epistemology', 'Modern Foundationalism, Coherentism, and Infinitism', 2);
insert into course(course_name, description, college_id) values('Microeconomics for Business Owners', 'Efficiency, Competition, and the Supply Chain', 3);
insert into course(course_name, description, college_id) values('Macroeconomics', 'Keynesianism, Modern Monetary Theory, and Austrian Economics', 3);
insert into course(course_name, description, college_id) values('Calculus', 'Derivatives, Integration, and Infinite Series', 1);


--Calculus
INSERT INTO college_courses (courses_course_id, college_college_id) VALUES (1, 1);
--Discrete Math
INSERT INTO college_courses (courses_course_id, college_college_id) VALUES (2, 1);
--Works of Shakespeare
INSERT INTO college_courses (courses_course_id, college_college_id) VALUES (3, 2);
--Normative Ethics
INSERT INTO college_courses (courses_course_id, college_college_id) VALUES (4, 2);
--Epistemology
INSERT INTO college_courses (courses_course_id, college_college_id) VALUES (5, 2);
--Microeconomics
INSERT INTO college_courses (courses_course_id, college_college_id) VALUES (6, 3);
--Macroeconomics
INSERT INTO college_courses (courses_course_id, college_college_id) VALUES (7, 3);
--Calculus
INSERT INTO college_courses (courses_course_id, college_college_id) VALUES (8, 1);

--John Doe
INSERT INTO course_students (students_student_id, course_course_id) VALUES (1, 1);
INSERT INTO course_students (students_student_id, course_course_id) VALUES (1, 2);
INSERT INTO course_students (students_student_id, course_course_id) VALUES (1, 6);
--Alice Smith
INSERT INTO course_students (students_student_id, course_course_id) VALUES (2, 3);
INSERT INTO course_students (students_student_id, course_course_id) VALUES (2, 4);
INSERT INTO course_students (students_student_id, course_course_id) VALUES (2, 5);
--Bob Johnson
INSERT INTO course_students (students_student_id, course_course_id) VALUES (3, 1);
INSERT INTO course_students (students_student_id, course_course_id) VALUES (3, 4);
INSERT INTO course_students (students_student_id, course_course_id) VALUES (3, 7);
--Jason Mraz
INSERT INTO course_students (students_student_id, course_course_id) VALUES (4, 5);
INSERT INTO course_students (students_student_id, course_course_id) VALUES (4, 2);
--Hilary Duff
INSERT INTO course_students (students_student_id, course_course_id) VALUES (5, 3);
INSERT INTO course_students (students_student_id, course_course_id) VALUES (5, 6);
INSERT INTO course_students (students_student_id, course_course_id) VALUES (5, 7);
--Eliot Gray
INSERT INTO course_students (students_student_id, course_course_id) VALUES (6, 1);
INSERT INTO course_students (students_student_id, course_course_id) VALUES (6, 2);
INSERT INTO course_students (students_student_id, course_course_id) VALUES (6, 4);
--Hannah Montana
INSERT INTO course_students (students_student_id, course_course_id) VALUES (7, 8);
INSERT INTO course_students (students_student_id, course_course_id) VALUES (7, 2);
INSERT INTO course_students (students_student_id, course_course_id) VALUES (7, 3);
--Grace Flower
INSERT INTO course_students (students_student_id, course_course_id) VALUES (8, 8);
INSERT INTO course_students (students_student_id, course_course_id) VALUES (8, 4);
INSERT INTO course_students (students_student_id, course_course_id) VALUES (8, 7);
--George Orwell
INSERT INTO course_students (students_student_id, course_course_id) VALUES (9, 8);
INSERT INTO course_students (students_student_id, course_course_id) VALUES (9, 3);

--Calculus
INSERT INTO student_courses (courses_course_id, student_student_id) VALUES (1, 1);
INSERT INTO student_courses (courses_course_id, student_student_id) VALUES (1, 3);
INSERT INTO student_courses (courses_course_id, student_student_id) VALUES (1, 6);
--Discrete Math
INSERT INTO student_courses (courses_course_id, student_student_id) VALUES (2, 1);
INSERT INTO student_courses (courses_course_id, student_student_id) VALUES (2, 4);
INSERT INTO student_courses (courses_course_id, student_student_id) VALUES (2, 6);
INSERT INTO student_courses (courses_course_id, student_student_id) VALUES (2, 7);
--Works of Shakespeare
INSERT INTO student_courses (courses_course_id, student_student_id) VALUES (3, 2);
INSERT INTO student_courses (courses_course_id, student_student_id) VALUES (3, 5);
INSERT INTO student_courses (courses_course_id, student_student_id) VALUES (3, 7);
INSERT INTO student_courses (courses_course_id, student_student_id) VALUES (3, 9);
--Normative Ethics
INSERT INTO student_courses (courses_course_id, student_student_id) VALUES (4, 2);
INSERT INTO student_courses (courses_course_id, student_student_id) VALUES (4, 3);
INSERT INTO student_courses (courses_course_id, student_student_id) VALUES (4, 6);
INSERT INTO student_courses (courses_course_id, student_student_id) VALUES (4, 8);
--Epistemology
INSERT INTO student_courses (courses_course_id, student_student_id) VALUES (5, 2);
INSERT INTO student_courses (courses_course_id, student_student_id) VALUES (5, 4);
--Microeconomics
INSERT INTO student_courses (courses_course_id, student_student_id) VALUES (6, 1);
INSERT INTO student_courses (courses_course_id, student_student_id) VALUES (6, 5);
--Macroeconomics
INSERT INTO student_courses (courses_course_id, student_student_id) VALUES (7, 3);
INSERT INTO student_courses (courses_course_id, student_student_id) VALUES (7, 5);
INSERT INTO student_courses (courses_course_id, student_student_id) VALUES (7, 8);
--Calculus
INSERT INTO student_courses (courses_course_id, student_student_id) VALUES (8, 7);
INSERT INTO student_courses (courses_course_id, student_student_id) VALUES (8, 8);
INSERT INTO student_courses (courses_course_id, student_student_id) VALUES (8, 9);

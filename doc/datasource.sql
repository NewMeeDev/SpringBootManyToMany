DB-Structure created by JPA-Hibernate-DDL
=========================================
DB-NAME:	many_to_many
DBMS:		MySql


use many_to_many;

-- einen User für Springboot anlegen
create user 'springuser'@'%' identified by '#EBIT2022'; -- Creates the user

-- dem Springboot User alle Rechte auf die gerade angelegte DB geben
grant all on many_to_many.* to 'springuser'@'%';


select * from book;
select * from student;
select * from student_book;
create table user(user_id varchar(20) primary key,password varchar(20))
drop table user;
create table expense(expense_id int auto_increment, expense_date date,expense_description varchar(20),expense_type varchar(25),
expense_amount decimal,primary key(expense_id))

create table user_expense(user_id varchar(20),expense_id int
FOREIGN KEY (user_id) REFERENCES user(user_id),
FOREIGN KEY (expense_id) REFERENCES expense(expense_id)
)
INSERT INTO "PUBLIC"."EXPENSE"("EXPENSE_ID","EXPENSE_DATE","EXPENSE_DESCRIPTION","EXPENSE_TYPE","EXPENSE_AMOUNT") 
VALUES ('2019-02-01','pencil','stationary',10);

INSERT INTO "PUBLIC"."EXPENSE"("EXPENSE_DATE","EXPENSE_DESCRIPTION","EXPENSE_TYPE","EXPENSE_AMOUNT") 
VALUES ('2019-02-01','pencil','stationary',10);
SELECT u.expense_id,u.expense_date,u.expense_Description,u.expense_type FROM expense u left outer join user_expense e
on u.expense_id=e.expense_id where e.user_id='user_123';
set serveroutput on;

DECLARE
A varchar2(20);
BEGIN
   select dept_name into A from department where budget = 70000;
   dbms_output.put_line(A);
END;

-----------------------------

DECLARE
B number(12,2);
BEGIN
   select budget into B from department where dept_name = 'Music';
   if B > 5000 then
        dbms_output.put_line('Good');
   else
       dbms_output.put_line('bad');
   end if;
END;

----------------------------

Declare
name varchar2(20);
counter number(2):=5;
BEGIN
  select dept_name into name from department where budget=70000;
  while counter>0
  loop
       dbms_output.put_line(name);
       counter:=counter-1;
  end loop;
END;

------------------------------------

create or replace procedure s1 as
temp varchar2(10);
begin
    select name into temp from instructor where id ='10101';
    dbms_output.put_line(temp);
end;

------------------------------------------- 

create or replace function avg_sal(n string) return number is
res number(5);
begin
 select avg(salary) into res from instructor where dept_name = n;
return(res);
end;

select id, name from instructor where salary > avg_sal('Physics');

----------------------------------


drop table myaudit;

create table myaudit(
history  number(5),
primary key (history)
);


CREATE OR REPLACE TRIGGER trg_after_insert_user
AFTER INSERT
  on department
DECLARE
num number(5);
BEGIN
  select COUNT(BUILDING) into num from DEPARTMENT;
  insert into MYAUDIT VALUES (num);
  --IF(counter>0) THEN
    --INSERT INTO USER_REMINDERS VALUES (:NEW.USER_ID,reminder_text,sysdate+3,'PENDING');
  --END IF;
END;



insert into DEPARTMENT values('Data Science','Packard', 60000);


-------------------------------------------------------






/* use place; */
/* show tables; */

/* desc employee; */
/* select fname, case
when role="manager" then "He is good"
when role="Sleepmaster" then "He is bad"
else "Normal guy"
end as remarks
from employee; */

/* update employee set salary = case 
WHEN role="Manager" THEN salary+6969
WHEN role="Sleepmaster" THEN salary/2
else salary-1
end;
select * from employee; */

/* update employee set dept=11 where salary=100; */
/* update employee set dept=12 where salary=20; */
/* update employee set dept=15 where salary=60;
alter table employee add column dept int; */


/* insert into employee values(1,"Ash","A","Manager",100);
insert into employee values(2,"Pikachu","P","Clerk",40);
insert into employee values(3,"Snorlax","S","Sleepmaster",20);
insert into employee values(4,"Evee","E","Officer",60);
insert into employee values(5,"Misty","M","Manager",100);

update employee set lname="A" where empid=1;  */

/* select count(*) from employee group by role; */


/* create table employee( 
    empid int primary key, 
    fname varchar(30) not null, 
    lname varchar(30), 
    role varchar(30),
    salary int not null); */


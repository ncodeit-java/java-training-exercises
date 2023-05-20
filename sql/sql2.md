### :camel: SQL examples
---

#### Task1: Select the department name of the company which is assigned to the employee whose employee id is grater 103

```
select deptname from empdept where deptid in (select department from employee where empid>103)

```

#### Task2: Select the name of the employee who is working under Abhishek.

```
select empname from employee where empheadid =(select empid from employee where empname='abhishek') 

```

#### Task3: Select the name of the employee who is department head of HR

```
select empname from employee where empid =(select depthead from empdept where deptname='hr')

```

#### Task4: Select the name of the employee head who is permanent.

```
select empname from employee where empid in(select empheadid from employee) and empid in(select empid from empsalary where ispermanent='yes')

```

#### Task5: Select the name and email of the Dept Head who is not Permanent.

```
select empname, emaildid from employee where empid in(select depthead from empdept ) and empid in(select empid from empsalary where ispermanent='no')

```

#### Task6: Select the employee whose department off is monday

```
select * from employee where department in(select deptid from empdept where dept_off='monday')

```

#### Task7: select the indian clients details.

```
select * from clienttable where cid in(select cid from country where cname='india')

```

#### Task8: List the number of department of employees in each project.

```
select count(empid) as employee, projectid from empproject group by projectid

```

#### Task9: select the details of all employee working in development department.

```
select * from employee where department in(select deptid from empdept where deptname='development')

```
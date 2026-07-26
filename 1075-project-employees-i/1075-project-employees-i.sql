# Write your MySQL query statement below
select Project.project_id,round(avg(Employee.experience_years),2) as average_years
from Employee
inner join Project
on Project.employee_id = Employee.employee_id
group by project_id;
-- order by project_id DESC;
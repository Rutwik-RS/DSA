CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
        set N=N-1;
  RETURN (
      # Write your MySQL query statement below.
        select DISTINCT(e.salary) from Employee e
        order by e.salary desc
        limit N,1
  );
END
/* Write your PL/SQL query statement below */

SELECT D.NAME  AS Department ,
       E.NAME  AS Employee,
       E.Salary
FROM Employee E  
JOIN Department D
ON E.departmentId = D.ID
WHERE (E.DepartmentId,E.Salary) IN (
SELECT DepartmentId, MAX(Salary) 
FROM Employee
GROUP BY DepartmentId
);


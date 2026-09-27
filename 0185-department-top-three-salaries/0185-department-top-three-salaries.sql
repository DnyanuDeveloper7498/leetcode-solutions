/* Write your PL/SQL query statement below */
SELECT D.name AS  Department,
       E.name AS  Employee,
       E.salary AS Salary
FROM Employee E 
JOIN Department D 
ON D.id=E.departmentId 
WHERE (
    SELECT COUNT(DISTINCT E2.salary)
    FROM Employee E2
    WHERE E2.departmentId =E.departmentId 
    AND E2.salary>E.salary
)<3;
-- # Write your MySQL query statement below
-- select * from Users 
-- where mail REGEXP '^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode[.]com';

SELECT *
FROM Users
WHERE mail REGEXP '^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode[.]com$';
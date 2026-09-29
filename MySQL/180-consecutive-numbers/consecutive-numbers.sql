# Write your MySQL query statement below

SELECT DISTINCT num AS ConsecutiveNums 
FROM (
    SELECT num,
    LAG(num, 1) OVER (ORDER BY id) AS n1,
    LAG(num, 2) OVER (ORDER BY id) AS n2
    FROM logs
) `table`
WHERE (num = n1) AND (num = n2);
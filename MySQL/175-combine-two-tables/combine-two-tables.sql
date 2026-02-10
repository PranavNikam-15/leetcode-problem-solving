# Write your MySQL query statement below

SELECT 
    P.firstName, 
    P.lastName, 
    A.city, 
    A.state
FROM 
    (SELECT personId, firstName, lastName FROM Person) P
LEFT JOIN 
    (SELECT personId, city, state FROM Address) A
USING (personId);

/*

SELECT 
    P.firstName, 
    P.lastName, 
    A.city, 
    A.state 
FROM Person P 
LEFT JOIN Address A 
ON P.personId = A.personId;

*/


/*

SELECT 
    P.firstName, 
    P.lastName, 
    A.city, 
    A.state
FROM Person P
LEFT JOIN Address A USING (personId);

*/
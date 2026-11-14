<h2><a href="https://leetcode.com/problems/swap-sex-of-employees/">Swap Sex of Employees</a></h2>
<img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' />
<hr>

<p>Table: <code>Salary</code></p>

<pre>
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| id          | int     |
| name        | varchar |
| sex         | ENUM    |
| salary      | int     |
+-------------+---------+
In SQL, id is the primary key column for this table.
The sex column is ENUM value of type ('m', 'f').
Each row of this table contains information about an employee.
</pre>

<p>&nbsp;</p>

<p>Write a solution to swap all <code>'f'</code> and <code>'m'</code> values (i.e., change all <code>'f'</code> values to <code>'m'</code> and vice versa) with a single update statement and no intermediate temporary tables.</p>

<p>Note that you must write a single update statement, and do not write any select statement for this problem.</p>

<p>The result format is in the following example.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong>
Salary table:
+----+------+-----+--------+
| id | name | sex | salary |
+----+------+-----+--------+
| 1  | A    | m   | 2500   |
| 2  | B    | f   | 1500   |
| 3  | C    | m   | 5500   |
| 4  | D    | f   | 500    |
+----+------+-----+--------+

<strong>Output:</strong>
+----+------+-----+--------+
| id | name | sex | salary |
+----+------+-----+--------+
| 1  | A    | f   | 2500   |
| 2  | B    | m   | 1500   |
| 3  | C    | f   | 5500   |
| 4  | D    | m   | 500    |
+----+------+-----+--------+

<strong>Explanation:</strong>
All 'm' values are changed to 'f' and all 'f' values are changed to 'm' using a single UPDATE statement.
The salary and other columns remain unchanged.
</pre>

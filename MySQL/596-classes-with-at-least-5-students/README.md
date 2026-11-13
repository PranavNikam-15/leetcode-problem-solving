<h2><a href="https://leetcode.com/problems/classes-with-at-least-5-students/">Classes With at Least 5 Students</a></h2>
<img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' />
<hr>

<p>Table: <code>Courses</code></p>

<pre>
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| student     | varchar |
| class       | varchar |
+-------------+---------+
In SQL, (student, class) is the primary key column for this table.
Each row of this table indicates the name of a student and the class in which they are enrolled.
</pre>

<p>&nbsp;</p>

<p>Write a solution to find all the classes that have at least five students.</p>

<p>Return the result table in <strong>any order</strong>.</p>

<p>The result format is in the following example.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong>
Courses table:
+---------+----------+
| student | class    |
+---------+----------+
| A       | Math     |
| B       | English  |
| C       | Math     |
| D       | Biology  |
| E       | Math     |
| F       | Computer |
| G       | Math     |
| H       | Math     |
| I       | Math     |
+---------+----------+

<strong>Output:</strong>
+-------+
| class |
+-------+
| Math  |
+-------+

<strong>Explanation:</strong>
- Math has 6 students, so it is included.
- English has 1 student.
- Biology has 1 student.
- Computer has 1 student.

Only Math has at least 5 students.
</pre>

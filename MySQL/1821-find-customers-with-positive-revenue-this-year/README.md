<h2><a href="https://leetcode.com/problems/find-customers-with-positive-revenue-this-year/">1821. Find Customers With Positive Revenue This Year</a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr>

<p>Table: <code>Customers</code></p>

<pre>
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| customer_id | int     |
| year        | int     |
| revenue     | int     |
+-------------+---------+
(customer_id, year) is the primary key of this table.
This table contains the revenue of customers in different years.
</pre>

<p>&nbsp;</p>

<p>Write a solution to find the customers who have positive revenue in the year <code>2021</code>.</p>

<p>Return the result table in <strong>any order</strong>.</p>

<p>The result format is in the following example.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong>
Customers table:
+-------------+------+---------+
| customer_id | year | revenue |
+-------------+------+---------+
| 1           | 2021 | 100     |
| 2           | 2021 | -50     |
| 3           | 2021 | 0       |
| 4           | 2021 | 200     |
| 5           | 2022 | 300     |
+-------------+------+---------+

<strong>Output:</strong>
+-------------+
| customer_id |
+-------------+
| 1           |
| 4           |
+-------------+

<strong>Explanation:</strong>
Customers 1 and 4 have positive revenue in the year 2021.
Customer 2 has negative revenue, customer 3 has zero revenue, and customer 5 has revenue in a different year.
Therefore, only customers 1 and 4 are returned.
</pre>

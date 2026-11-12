<h2><a href="https://leetcode.com/problems/biggest-single-number/">Biggest Single Number</a></h2>
<img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' />
<hr>

<p>Table: <code>MyNumbers</code></p>

<pre>
+-------------+
| Column Name |
+-------------+
| num         |
+-------------+
This table may contain duplicates.
Each row of this table contains an integer.
</pre>

<p>&nbsp;</p>

<p>A <strong>single number</strong> is a number that appears only once in the <code>MyNumbers</code> table.</p>

<p>Find the largest single number. If there is no single number, report <code>NULL</code>.</p>

<p>Return the result table in the following format.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong>
MyNumbers table:
+-----+
| num |
+-----+
| 8   |
| 8   |
| 3   |
| 3   |
| 1   |
| 4   |
| 5   |
+-----+

<strong>Output:</strong>
+-----+
| num |
+-----+
| 5   |
+-----+

<strong>Explanation:</strong>
The single numbers are 1, 4, and 5.
The largest single number is 5.
</pre>

<p>&nbsp;</p>

<p><strong class="example">Example 2:</strong></p>

<pre>
<strong>Input:</strong>
MyNumbers table:
+-----+
| num |
+-----+
| 8   |
| 8   |
| 3   |
| 3   |
| 1   |
| 1   |
+-----+

<strong>Output:</strong>
+------+
| num  |
+------+
| NULL |
+------+

<strong>Explanation:</strong>
There are no single numbers in the table.
Therefore, the result is NULL.
</pre>

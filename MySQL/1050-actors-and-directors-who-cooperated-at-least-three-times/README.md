<h2><a href="https://leetcode.com/problems/actors-and-directors-who-cooperated-at-least-three-times/">Actors and Directors Who Cooperated At Least Three Times</a></h2>
<img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' />
<hr>

<p>Table: <code>ActorDirector</code></p>

<pre>
+-------------+---------+
| Column Name | Type    |
+-------------+---------+
| actor_id    | int     |
| director_id | int     |
| timestamp   | int     |
+-------------+---------+
In SQL, (actor_id, director_id) is the primary key for this table.
Each row contains information about an actor and a director who collaborated on a movie.
</pre>

<p>&nbsp;</p>

<p>Write a solution to find all the pairs of actors and directors who have collaborated at least three times.</p>

<p>Return the result table in <strong>any order</strong>.</p>

<p>The result format is in the following example.</p>

<p>&nbsp;</p>

<p><strong class="example">Example 1:</strong></p>

<pre>
<strong>Input:</strong>
ActorDirector table:
+-------------+-------------+-------------+
| actor_id    | director_id | timestamp   |
+-------------+-------------+-------------+
| 1           | 1           | 0           |
| 1           | 1           | 1           |
| 1           | 1           | 2           |
| 1           | 2           | 3           |
| 1           | 2           | 4           |
+-------------+-------------+-------------+

<strong>Output:</strong>
+-------------+-------------+
| actor_id    | director_id |
+-------------+-------------+
| 1           | 1           |
+-------------+-------------+

<strong>Explanation:</strong>
The actor with ID 1 and the director with ID 1 have collaborated three times.
The actor with ID 1 and the director with ID 2 have collaborated only twice.
Therefore, only the pair (1, 1) is returned.
</pre>

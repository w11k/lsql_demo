--loadPersonById
SELECT *
FROM person
WHERE id = /*=*/ 1 /**/;

--loadAverageAgeByLastName
SELECT
  last_name,
  avg(age) AS age /*: integer*/
FROM person
  WHERE last_name = /*=*/ 'Power' /**/
GROUP BY last_name;

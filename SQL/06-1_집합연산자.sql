--집합연산자
-- UNION(합집합 중복X), UNION ALL(합집합 중복O), INTERSECT(교집합), MINUS(차집합)
-- 위 아래 column 개수가 정확히 일치해야 합니다.
SELECT
employee_id, first_name
FROM employees
WHERE hire_date LIKE '04%'
UNION
SELECT
employee_id, first_name
FROM employees
WHERE department_id = 20;
SELECT
employee_id, first_name
FROM employees
WHERE hire_date LIKE '04%'
UNION ALL
SELECT
employee_id, first_name
FROM employees
WHERE department_id = 20;

SELECT
employee_id, first_name
FROM employees
WHERE hire_date LIKE '04%'
INTERSECT
SELECT
employee_id, first_name
FROM employees
WHERE department_id = 20;

SELECT
employee_id, first_name
FROM employees
WHERE hire_date LIKE '04%'
MINUS
SELECT
employee_id, first_name
FROM employees
WHERE department_id = 20;

SELECT
employee_id, first_name
FROM employees
WHERE department_id = 20
MINUS
SELECT
employee_id, first_name
FROM employees
WHERE hire_date LIKE '04%';
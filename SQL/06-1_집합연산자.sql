--���տ�����
-- UNION(������ �ߺ�X), UNION ALL(������ �ߺ�O), INTERSECT(������), MINUS(������)
-- �� �Ʒ� column ������ ��Ȯ�� ��ġ�ؾ� �մϴ�.
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
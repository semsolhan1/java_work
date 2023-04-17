--���� 1.
---EMPLOYEES ���̺��, DEPARTMENTS ���̺��� DEPARTMENT_ID�� ����Ǿ� �ֽ��ϴ�.
---EMPLOYEES, DEPARTMENTS ���̺��� ������� �̿��ؼ�
--���� INNER , LEFT OUTER, RIGHT OUTER, FULL OUTER ���� �ϼ���. (�޶����� ���� ���� Ȯ��)
SELECT
*
FROM employees e
JOIN departments d
ON e.department_id  = d.department_id; --106��

SELECT
*
FROM employees e LEFT JOIN departments d
ON e.department_id  = d.department_id;--107��

SELECT
*
FROM employees e RIGHT JOIN departments d
ON e.department_id  = d.department_id;--122��

SELECT
*
FROM employees e FULL JOIN departments d
ON e.department_id  = d.department_id; --123��

--���� 2.
---EMPLOYEES, DEPARTMENTS ���̺��� INNER JOIN�ϼ���
--����)employee_id�� 200�� ����� �̸�, department_id�� ����ϼ���
--����)�̸� �÷��� first_name�� last_name�� ���ļ� ����մϴ�

SELECT
e.department_name, CONCAT(CONCAT(e.first_name, ' '), e.last_name)
FROM employees e JOIN departments d
ON e.department_id = d.department_id
WHERE employee_id = 200;--1��
--���� 3.
---EMPLOYEES, JOBS���̺��� INNER JOIN�ϼ���
--����) ��� ����� �̸��� �������̵�, ���� Ÿ��Ʋ�� ����ϰ�, �̸� �������� �������� ����
--HINT) � �÷����� ���� ����� �ִ��� Ȯ��
SELECT
*
FROM employees;

SELECT
*
FROM jobs;

SELECT
CONCAT(CONCAT(e.first_name, ' '), e.last_name) AS �̸�,
j.job_title, j.job_id
FROM employees e INNER JOIN jobs j
ON e.job_id = j.job_id
ORDER BY �̸� ASC;--107��

--���� 4.
----JOBS���̺�� JOB_HISTORY���̺��� LEFT_OUTER JOIN �ϼ���.

SELECT
*
FROM jobs;

SELECT
*
FROM job_history;

SELECT
*
FROM jobs j LEFT JOIN job_history h
ON j.job_id = h.job_id; --21��

--���� 5.
----Steven King�� �μ����� ����ϼ���.

SELECT
*
FROM employees;

SELECT
*
FROM departments;

SELECT
CONCAT(CONCAT(e.first_name, ' '), e.last_name) AS �̸�,
d.department_name
FROM employees e INNER JOIN departments d
ON e.department_id = d.department_id
WHERE CONCAT(CONCAT(e.first_name, ' '), e.last_name) = 'Steven King'; --1��

--���� 6.
----EMPLOYEES ���̺�� DEPARTMENTS ���̺��� Cartesian Product(Cross join)ó���ϼ���
SELECT
*
FROM employees e CROSS JOIN departments d;--2889��

SELECT
COUNT(*)
FROM employees e CROSS JOIN departments d;--���� Ȯ��

/*
���� 7.
--EMPLOYEES ���̺�� DEPARTMENTS ���̺��� �μ���ȣ�� �����ϰ� SA_MAN ������� �����ȣ, �̸�, 
�޿�, �μ���, �ٹ����� ����ϼ���. (Alias�� ���)
*/
SELECT
e.employee_id, e.first_name, e.salary, d.department_name, l.city
FROM employees e JOIN departments d
ON e.department_id = d.department_id
JOIN locations l
ON d.location_id = l.location_id
WHERE e.job_id = 'SA_MAN';--5��

/*
���� 8.
-- employees, jobs ���̺��� ���� �����ϰ� job_title�� 'Stock Manager', 'Stock Clerk'�� ���� ������
����ϼ���.
*/

SELECT
*
FROM employees e JOIN jobs j
ON e.job_id = j.job_id
--WHERE job_title = 'Stock Manager' 
--OR job_title = 'Stock Clerk';
WHERE job_title IN('Stock Manager', 'Stock Clerk');

/*
���� 9.
-- departments ���̺��� ������ ���� �μ��� ã�� ����ϼ���. LEFT OUTER JOIN ���
*/
SELECT
d.department_name
FROM departments d LEFT JOIN employees e
ON d.department_id = e.department_id
WHERE e.employee_id IS null;
/*
���� 10. 
-join�� �̿��ؼ� ����� �̸��� �� ����� �Ŵ��� �̸��� ����ϼ���
��Ʈ) EMPLOYEES ���̺�� EMPLOYEES ���̺��� �����ϼ���.
*/

SELECT
e1.first_name, e2.first_name AS manager_name
FROM employees e1 JOIN employees e2
ON e1.manager_id = e2.employee_id;

/*
���� 11. 
--6. EMPLOYEES ���̺��� left join�Ͽ� ������(�Ŵ���)��, �Ŵ����� �̸�, �Ŵ����� �޿� ���� ����ϼ���
--�Ŵ��� ���̵� ���� ����� �����ϰ� �޿��� �������� ����ϼ���
*/

SELECT
e1.employee_id, e1.first_name, e1.manager_id,
e2.first_name, e2.salary
FROM employees e1 LEFT JOIN employees e2
ON e1.manager_id = e2.employee_id
WHERE e1.manager_id IS NOT null
ORDER BY e1.salary DESC;

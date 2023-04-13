
--�׷��Լ� AVG, MAX, MIN, SUM, COUT
SELECT
AVG(salary),
MAX(salary),
MIN(salary),
SUM(salary),
COUNT(salary)
FROM employees;

SELECT COUNT(*) FROM employees;-- �� �� �������� ��
SELECT COUNT(first_name) FROM employees;
SELECT COUNT(commission_pct) FROM employees;-- null�� �ƴ� ���� ��
SELECT COUNT(manager_id) FROM employees; -- null�� �ƴ� ���� ��

--�μ����� �׷�ȭ, �׷��Լ��� ���
SELECT 
    department_id,
    AVG(salary)
FROM employees
GROUP BY department_id;

-- ������ ��
--�׷� �Լ��� �Ϲ� �÷��� ���ÿ� �׳� ����� ���� �����ϴ�.
SELECT 
    department_id,
    AVG(salary)
FROM employees;

-- GROUP BY���� ����� �� GROUP���� ������ ������ �ٸ� �÷��� ��ȸ�� �� �����ϴ�.
SELECT 
    job_id,
    department_id,
    AVG(salary)
FROM employees
GROUP BY department_id; -- ����

--GROUP BY�� 2�� �̻� ���
SELECT 
    job_id,
    department_id,
    AVG(salary)
FROM employees
GROUP BY department_id, job_id
ORDER BY department_id;

--GROUP BY�� ���� �׷�ȭ�� �� �� ������ �� ��� HAVING�� ���.
SELECT 
    department_id,
    AVG(salary)
FROM employees
GROUP BY department_id
HAVING SUM(salary) > 100000;

SELECT
    job_id,
    COUNT(*)
FROM employees
GROUP BY job_id
HAVING COUNT(*) >= 5;

-- �μ� ���̵� 50 �̻��� �͵��� �׷�ȭ ��Ű��, �׷� ���� ����� 5000 �̻� ��ȸ
SELECT                          --3.
    department_id,              --3.
    AVG(salary) AS ���         --3.
FROM employees                  --1.
WHERE department_id >= 50       --2.
GROUP BY department_id          --2.
HAVING AVG(salary) >= 5000      --2.
ORDER BY department_id DESC;    --4. sql�� ������� 
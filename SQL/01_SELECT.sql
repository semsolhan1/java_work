-- ����Ŭ�� �ּ��Դϴ�.

/*
������ �ּ��Դϴ�.
ȣȣȣȣ~
*/
--SELECT �÷��� (���� �� ����) FROM ���̺� �̸�
SELECT
    *
FROM
    employees;

SELECT
    employee_id,
    first_name,
    last_name
FROM
    employees;

SELECT
    email,
    phone_number,
    hire_date
FROM
    employees;

--�÷��� ��ȸ�ϴ� ��ġ���� * / + - ������ �����մϴ�.
SELECT
    employee_id,
    first_name,
    last_name,
    salary,
    salary + salary*0.1
FROM 
    employees;
    
-- NULL ���� Ȯ�� (���� 0�̳� �����̶��� �ٸ� �����Դϴ�.)
SELECT department_id, commission_pct
FROM employees;

--alias(�÷���, ���̺���� �̸��� �����ؼ� ��ȸ�մϴ�.
SELECT
    first_name AS �̸�,
    last_name AS ��,
    salary AS �޿�
FROM employees;

--����Ŭ�� Ȭ����ǥ�� ���ڸ� ǥ���ϰ�, ���ڿ� �ȿ� Ȭ����ǥ��
--ǥ���ϰ� �ʹٸ� ''�� �� �� �������� ���� �˴ϴ�.
--������ �����ϰ� �ʹٸ� || �� ����մϴ�.

SELECT
    first_name || ' ' || last_name || '''s salary is' || salary
    AS �޿�����
FROM employees;

--DISTINCT (�ߺ� ���� ����)

SELECT department_id FROM employees;
SELECT DISTINCT department_id FROM employees;

--ROWNUM, ROWID
--(**�ο��: ������ ���� ��ȯ�Ǵ� �� ��ȣ�� ���)
--(�ο���̵�: �����ͺ��̽� ���� ���� �ּҸ� ��ȯ

SELECT ROWNUM, ROWID, employee_id
FROM employees;

SELECT
    salary,
    first_name
FROM employees;


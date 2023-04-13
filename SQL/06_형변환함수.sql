--�� ��ȯ�Լ� TO_CHAR, TO_NUMBER, TO_DATE

--��¥�� ���ڷ� TO_CHAR(��, ����)
SELECT TO_CHAR(sysdate) FROM dual;
SELECT TO_CHAR(sysdate, 'YYYY-MM-DD HH:MI:SS') FROM dual;
SELECT TO_CHAR(sysdate, 'YY-MM-DD DAY HH24:MI:ss') FROM dual;

--����ϰ� ���� ���ڸ� ""�� ���� �����մϴ�.
SELECT first_name, TO_CHAR(hire_date, 'YYYY"��" MM"��" DD"��"')
FROM employees;
    
--���ڸ� ���ڷ� TO_CHAR(��, ����)
SELECT TO_CHAR(20000, '99999') FROM dual;
--�־��� �ڸ����� ���ڸ� ��� ǥ���� �� ��� ��� #���� ǥ��˴ϴ�.
SELECT TO_CHAR(20000, '9999') FROM dual;
SELECT TO_CHAR(20000.29, '99999.9') FROM dual;
SELECT TO_CHAR(20000, '99,999') FROM dual;

SELECT 
TO_CHAR(salary, 'L99,999') AS salary
FROM employees;

--���ڸ� ���ڷ� TO_NUMBER(��, ����)
SELECT '2000' + 2000 AS salary FROM dual; -- �ڵ�����ȯ(���� -> ����)
SELECT TO_NUMBER('2000') + 2000 FROM dual; -- ����� �� ��ȯ
SELECT '$3,300' + 2000 FROM dual;--����
SELECT TO_NUMBER('$3,300', '$9,999') + 2000 FROM dual;--���� ���� �ڸ��� 9�� ǥ��

--���ڸ� ��¥�� ��ȯ�ϴ� �Լ� TO_DATE(��, ����)
SELECT TO_DATE('2023-04-13') FROM dual;
SELECT sysdate - TO_DATE('2021-03-26') FROM dual;
SELECT TO_DATE('2020/12/25', 'YY-MM-DD') FROM dual;
--�־��� ���ڿ��� ��� ��ȯ�ؾ� �մϴ�.
SELECT TO_DATE('2020-03-31 12:23:50', 'YY-MM-DD HH:MI:SS') FROM dual;
-- xxxx�� xx�� xx�� ���ڿ� �������� ��ȯ�� ������,
-- ��ȸ�÷����� dateInfo��� �ϰڽ��ϴ�.
SELECT TO_CHAR(TO_DATE('20050102',
'YYYYMMDD'),
'YYYY"��" MM"��" DD"��"')
AS dateInfo
FROM dual;

-- NULL���� �Լ� NVL(�÷�, ��ȯ�� Ÿ�ٰ�)
SELECT null FROM dual;
SELECT NVL(null,0) FROM dual;

SELECT 
    first_name,
    NVL(commission_pct, 0) AS comm_pct
FROM employees;

--NULL���� �Լ� NVL2(�÷�, null�� �ƴ� ��� ��, null�� ����� ��)
SELECT
    NVL2('abc', '�ξƴ�', '����')
FROM dual;

SELECT 
    first_name,
    NVL2(commission_pct, 'true', 'false')
FROM employees;

SELECT 
    first_name,
    commission_pct,
    NVL2(commission_pct, salary + (salary * commission_pct), salary) AS real_salary
FROM employees;

--DECODE(�ø� Ȥ�� ǥ����, �׸�1, ���1, �׸�2, ���2 ....... default)
SELECT
    DECODE('F', 'A', 'A�Դϴ�.', 'B', 'B�Դϴ�.', 'C', 'C�Դϴ�.', '�𸣰ڴµ���?')
FROM dual;

SELECT
    job_id,
    salary,
    DECODE(
        job_id,
        'IT_PROG', salary*1.1,
        'FI_MGR', salary*1.2,
        'AD_VP', salary*1.3
    ) AS result
FROM employees;

--CASE WHEN THEN END
SELECT
    first_name,
    job_id,
    salary,
    (CASE job_id
    WHEN 'IT_FROG' THEN salary*1.1
    WHEN 'FI_MFR' THEN salary*1.2
    WHEN 'AD_VP' THEN salary*1.3
    WHEN 'FI_ACCOUNT' THEN salary*1.4
    ELSE salary
    END) AS result
FROM employees;

--���� 1.
--�������ڸ� �������� EMPLOYEE���̺��� �Ի�����(hire_date)�� �����ؼ� �ټӳ���� 17�� �̻���
--����� ������ ���� ������ ����� ����ϵ��� ������ �ۼ��� ������. 
--���� 1) �ټӳ���� ���� ��� ������� ����� �������� �մϴ�
SELECT
employee_id AS �����ȣ,
CONCAT(CONCAT(first_name, ' '), last_name),
hire_date AS �Ի�����,
TO_CHAR((sysdate - hire_date) / 365, 99) AS �ټӳ��
FROM employees
WHERE (sysdate-hire_date) / 365 >= 17
ORDER BY �ټӳ�� DESC;
--���� 2.
--EMPLOYEE ���̺��� manager_id�÷��� Ȯ���Ͽ� first_name, manager_id, ������ ����մϴ�.
--100�̶�� �������, 
--120�̶�� �����ӡ�
--121�̶�� ���븮��
--122��� �����塯
--�������� ���ӿ��� ���� ����մϴ�.
--���� 1) manager_id�� 100�� ������� ������θ� ��ȸ�մϴ�
SELECT
    first_name,
    manager_id,
    DECODE(
    manager_id,
    100, '���',
    120, '����',
    121, '�븮',
    122, '����',
    '�ӿ�'
) AS ����
FROM employees
WHERE department_id = 50;
-------------------------------------------------------------------
SELECT
    salary,
    employee_id,
    first_name,
    DECODE(
        TRUNC(salary / 1000),
        0, 'E',
        1, 'D',
        2, 'C',
        3, 'B',
        'A'
    ) AS GRADE
    
FROM employees
ORDER BY salary DESC;

SELECT
    salary,
    employee_id,
    first_name,
    (CASE
        WHEN salary BETWEEN 0 AND 999 THEN 'E'
        WHEN salary BETWEEN 1000 AND 1999 THEN 'D'
        WHEN salary BETWEEN 2000 AND 2999 THEN 'C'
        WHEN salary BETWEEN 3000 AND 3999 THEN 'B'
        ELSE 'A'
    END) AS grade
    
FROM employees
ORDER BY salary DESC;


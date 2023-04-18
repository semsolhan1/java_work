
/*
#��������

- ���������� ������� () �ȿ� �����.
������������ �������� 1�� ���Ͽ��� �մϴ�.
- �������� ������ ����� ����� �ϳ� �ݵ�� ���� �մϴ�.
- �ؼ��� ���� ���������� ���� ���� �ؼ��ϸ� �˴ϴ�.
*/

-- 'Nancy'�� �޿����� �޿��� ���� ����� �˻��ϴ� ����
SELECT
salary
FROM
employees
WHERE first_name = 'Nancy';

SELECT * FROM employees
WHERE salary > (SELECT salary 
                FROM employees 
                WHERE first_name = 'Nancy');
                
--employee_id�� 103���� ����� job_id�� ������ ����� �˻��ϴ� ����.
SELECT
job_id
FROM employees
WHERE employee_id = 103;

SELECT
*
FROM employees
WHERE job_id =(SELECT
job_id
FROM employees
WHERE employee_id = 103
);

--���������� ���������� �����ϴ� ���� �������� ���� �� �����ڸ� ����� �� ����.
--�̷� ��쿡�� ������ �����ڸ� ����ؾ� �Ѵ�.
SELECT
*
FROM employees
WHERE job_id = (SELECT job_id
FROM employees
WHERE job_id = 'IT_PROG'
); --����

--������ ������
--IN: ����� � ���� ������ Ȯ���Ѵ�.
SELECT
*
FROM employees
WHERE job_id IN (SELECT job_id
FROM employees
WHERE job_id = 'IT_PROG'
);

--first_name�� David�� ��� �� ���� ���� ������ �޿��� ū ����� ��ȸ
SELECT
*
FROM employees
WHERE first_name = 'David';

--ANY: ���� ���������� ���� ���ϵ� ������ ���� ���մϴ�.
--�ϳ��� �����ϸ� �˴ϴ�.
SELECT
*
FROM employees
WHERE salary > ANY (SELECT salary
                    FROM employees
                    WHERE first_name = 'David');
                    
--ALL: ���� ���������� ���� ���ϵ� ���� ��� ���ؼ�
--��� �����ؾ� �մϴ�

SELECT
*
FROM employees
WHERE salary > ALL (SELECT salary
                    FROM employees
                    WHERE first_name = 'David');
                    
-------------------------------------------------------------

--��Į�� ��������
--SELECT ������ ���������� ���� ��. LEFT OUTER JOIN�� ������ ���.
SELECT
    e.first_name, d.department_name
FROM employees e
LEFT JOIN departments d
ON e.department_id = d.department_id
ORDER BY first_name ASC;

SELECT
e.first_name, (
SELECT
department_name
FROM departments d
WHERE d.department_id = e.department_id
) AS department_name
FROM employees e
ORDER BY first_name ASC;

/*
- ��Į�� ���������� ���κ��� �������
: �Լ�ó�� �� ���ڵ�� ��Ȯ�� �ϳ��� ������ ������ ��.

-������ ��Į�� ������������ ���� ���
: ��ȸ�� �����Ͱ� ��뷮�� ���, �ش� �����Ͱ�
����, ���� ���� ����� ���
*/

--�� �μ��� �Ŵ��� �̸�
--LEFT JOIN
SELECT
d.*,
e.first_name
FROM departments d 
LEFT JOIN employees e
ON d.manager_id = e.employee_id
ORDER BY d.manager_id ASC;

--��Į��
SELECT
    d.*,
    (
    SELECT
    first_name
    FROM employees e
    WHERE e.employee_id = d.manager_id
    ) AS manager_name
FROM departments d
ORDER BY d.manager_id ASC;

--�� �μ��� ����� �̱�
SELECT department_id, COUNT(*) FROM employees
GROUP BY department_id;

SELECT
d.*,
(
SELECT
COUNT(*)
FROM employees e
WHERE e.department_id = d.department_id
GROUP BY department_id
) AS �����
FROM departments d;

------------------------------------------------------------------

--�ζ��� �� (FROM ������ ���������� ���� ��.)
--������ ���س��� ��ȸ �ڷḦ ������ �����ؼ� ������ ���� ���.

--salary�� ������ �����ϸ鼭 �ٷ� ROWNUM�� ���̸�
--ROWNUM�� ������ ���� �ʴ� ��Ȳ�� �߻��մϴ�.
--����: ROWNUM�� ���� �ٰ� ������ ����Ǳ� ����. ORDER BY�� �׻� �������� ����.
--�ذ�: ������ �̸� ����� �ڷῡ ROWNUM�� �ٿ��� �ٽ� ��ȸ�ϴ� ���� ���� �� ���ƿ�.
SELECT ROWNUM AS rn, employee_id, first_name, salary
FROM employees
ORDER BY salary DESC;


--ROWNUM�� ���̰� ���� ������ �����ؼ� ��ȸ�Ϸ��� �ϴµ�,
--���� ������ �Ұ��� �ϰ�, ������ �� ���� ������ �߻��ϴ���.
--����: WHERE������ ���� �����ϰ� ���� ROWNUM�� SELECT �Ǳ� ������.
--�ذ�: ROWNUM���� �ٿ� ���� �ٽ� �� �� �ڷḦ SELECT �ؼ� ������ �����ؾ� �ǰڱ���.
SELECT ROWNUM AS rn, tbl.*
FROM
    (
    SELECT employee_id, first_name, salary
    FROM employees
    ORDER BY salary DESC
    ) tbl
    WHERE rn > 10 AND rn <= 20;--����

/*
���� ���� SELECT ������ �ʿ��� ���̺� ����(�ζ��� ��)�� ����.
�ٱ��� SELECT ������ ROWNUM�� �ٿ��� �ٽ� ��ȸ
���� �ٱ��� SELECT �������� �̹� �پ��ִ� ROWNUM�� ������ �����ؼ� ��ȸ.

**SQL�� ���� ����
FROM -> WHERE -> GROUP BY -> HAVING -> SELECT -> ORDER BY
*/
SELECT * FROM
    (
    SELECT ROWNUM AS rn, tbl.*
    FROM
        (
        SELECT employee_id, first_name, salary
        FROM employees
        ORDER BY salary DESC
        ) tbl
    )
WHERE rn > 10 AND rn <= 20;

SELECT * FROM
    (
    SELECT
        TO_CHAR(TO_DATE(test, 'YY/MM/DD'), 'MMDD') AS mm, name
    FROM
        (
        SELECT 'ȫ�浿' AS name, '20230418' AS test FROM dual UNION ALL
        SELECT '��ö��', '20230401' FROM dual UNION ALL
        SELECT '�ڿ���', '20230201' FROM dual UNION ALL
        SELECT '��ǻ�', '20230501' FROM dual UNION ALL
        SELECT '�ڶѶ�', '20230601' FROM dual UNION ALL
        SELECT '���׽�Ʈ', '20230701' FROM dual
        )
    )
WHERE mm = '0418';










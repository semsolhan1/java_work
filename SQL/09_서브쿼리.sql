
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


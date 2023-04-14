
-- �̳�(����) ����
SELECT 
*
FROM info i
INNER JOIN auth a
ON i.auth_id = a.auth_id;

--����Ŭ ���� (�� ��� ���մϴ�.)
SELECT
*
FROM info i, auth a
WHERE i.auth_id = a.auth_id;

--auth_id �÷��� �׳� ���� ��ȣ�ϴ� ��� ��ϴ�. �� ������ ���� ���̺� ��� 
--�����ϱ� �����Դϴ�. �̷� ����, �÷��� ���̺� �̸��� ���̴���, ��Ī�� ���ż� 
--Ȯ���ϰ� ������ ���ּ���.
SELECT
a.auth_id, i.title, i.content, a.name
FROM info i
INNER JOIN auth a
ON i.auth_id = a.auth_id;

--�ʿ��� �����͸� ��ȸ�ϰڴ�! ��� �Ѵٸ�
--WHERE ������ ���� �Ϲ� ������ �ɾ� �ֽø� �˴ϴ�.

SELECT
a.auth_id, i.title, i.content, a.name
FROM info i
INNER JOIN auth a
ON i.auth_id = a.auth_id
WHERE a.name = '�̼���';

--�ƿ���(�ܺ�) ����
SELECT
*
FROM info i LEFT OUTER JOIN auth a --������ LEFT�� info i �� ������ �ȴ�.
ON i.auth_id = a.auth_id;

--���� ���̺�� ���� ���̺� �����͸� ��� �о� �ߺ��� �����ʹ� �����Ǵ� �ܺ� ����.
SELECT *
FROM info i FULL JOIN auth a
ON i.auth_id = a.auth_id;

--CROSS JOIN�� JOIN������ �������� �ʱ� ������
--�ܼ��� ��� �÷��� ���� JOIN�� �����մϴ�.
--�����δ� ���� ������� �ʽ��ϴ�.
SELECT * FROM info
CROSS JOIN auth
ORDER BY id ASC;

--���� �� ���̺� ���� -> Ű �� �� ã�Ƽ� ������ �����ؼ� ���ø� �˴ϴ�.
SELECT
*
FROM employees e
LEFT JOIN departments d ON e.department_id = d.department_id
LEFT JOIN locations loc ON d.location_id = loc.location_id;

/*
-���̺� ��Ī a, i�� �̿��Ͽ� LEFT OUTER JOIN ���.
-info, auth ���̺� ���
-job �÷��� scientist�� ����� id, title, content, job�� ���.
*/

SELECT 
i.id, i.title, i.content, a.job
FROM auth a LEFT OUTER JOIN info i
ON i.auth_id = a.auth_id
WHERE job = 'scientist';

--���� �����̶� ���� ���̺� ������ ������ ���մϴ�.
--���� ���̺� �÷��� ���� ������ �����ϴ� ���� ��Ī ���� ������ �� ����մϴ�.

SELECT
e.employee_id, e.first_name, a.employee_id, a.first_name AS �Ŵ���
FROM employees e LEFT  JOIN employees a
ON a.employee_id = e.manager_id
ORDER BY e.employee_id ASC;

SELECT
e1.employee_id, e1.first_name, e1.manager_id,
e2.first_name, e2.employee_id
FROM employees e1
JOIN employees e2
ON e1.manager_id = e2.employee_id;


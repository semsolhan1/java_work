
--����Ŀ�� ���� Ȯ��
SHOW AUTOCOMMIT;
--����Ŀ�� ��
SET AUTOCOMMIT ON;
--����Ŀ�� ����
SET AUTOCOMMIT OFF;

DELETE FROM emps WHERE employee_id = 304;

SELECT * FROM emps;

INSERT INTO emps
    (employee_id, last_name, email, hire_date, job_id)
VALUES
    (304, 'lee', 'lee1234@gmail.com', sysdate, 1800);

--�������� ��� ������ ��������� ��� (���),
--���� Ŀ�� �ܰ�� ȸ��(���ư���) �� Ʈ����� ����
ROLLBACK;

--���̺�����Ʈ ����.
--�ѹ��� ����Ʈ�� ���� �̸��� �ٿ��� ����.
--ANSI ǥ�� ������ �ƴϱ� ������ �׷��� ���������� ����.

SAVEPOINT insert_park;


INSERT INTO emps
    (employee_id, last_name, email, hire_date, job_id)
VALUES
    (305, 'park', 'park4321@gmail.com', sysdate, 1800);
    
ROLLBACK TO SAVEPOINT insert_park;




--�������� ��� ������ ��������� ���������� �����ϸ鼭 Ʈ����� ����
--Ŀ���� ���Ŀ��� ��� ����� ����ϴ��� �ǵ��� �� �����ϴ�.
COMMIT;













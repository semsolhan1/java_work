
/*
- NUMBER(2) -> ������ 2�ڸ����� ������ �� �ִ� ������ Ÿ��.
- NUMBER(5, 2) -> ������, �Ǽ��θ� ��ģ �� �ڸ��� 5�ڸ�, �Ҽ��� 2�ڸ�(�ݿø� �ڵ�)
- NUMBER -> ��ȣ�� ������ �� (38, 0)���� �ڵ� �����˴ϴ�.(�Ǽ�ǥ�� �ȵ�)
- VARCHAR2(byte) -> ��ȣ �ȿ� ���� ���ڿ��� �ִ� ���̸� ����. (4000byte����)
- CLOB -> ��뷮 �ؽ�Ʈ ������ Ÿ��(�ִ� 4Gbyte)
- BLOB -> ������ ��뷮 ��ü (�̹���, ���� ���� �� ���)
- DATE -> BC 4712�� 1�� 1�� ~ AD 9999�� 12�� 31�ϱ��� ���� ����
- ��, ��, �� ���� ����.
*/

CREATE TABLE dept2(
    dept_no NUMBER(2),
    dept_name VARCHAR2(14),
    loca VARCHAR2(15),
    dept_date DATE,
    dept_bonus NUMBER(10)
);

ROLLBACK;

DESC dept2;
SELECT * FROM dept2;

--NUMBER�� VARCHAR2 Ÿ���� ���̸� Ȯ��
INSERT INTO dept2
VALUES(30, '�濵����', '����', sysdate, 2000000000);

-- �÷� �߰�
ALTER TABLE dept2
ADD (dept_count NUMBER(3));

--���̸� ����
ALTER TABLE dept2
RENAME COLUMN dept_count TO emp_count;

--�� �Ӽ� ����
--���� �����ϰ��� �ϴ� �÷��� �����Ͱ� �̹� �����Ѵٸ� �׿� �´� Ÿ������
--������ �ּž� �մϴ�. ���� �ʴ� Ÿ�����δ� ������ �Ұ����մϴ�.
ALTER TABLE dept2
MODIFY (dept_name NUMBER(20));--����

DESC dept2;

--�� ����
ALTER TABLE dept2
DROP COLUMN dept_bonus;

SELECT * FROM dept2;

--���̺� �̸� ����
ALTER TABLE dept2
RENAME TO dept3;

--���̺� ���� (������ ���ܵΰ� ���� �����͸� ��� ����)
TRUNCATE TABLE dept3;

SELECT * FROM dept3;

DROP TABLE dept3;

ROLLBACK;















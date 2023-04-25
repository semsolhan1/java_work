
/*
trigger�� ���̺� ������ ���·ν�, INSERT, UPDATE, DELETE �۾��� ����� ��
Ư�� �ڵ尡 �۵��ǵ��� �ϴ� �����Դϴ�.
VIEW���� ������ �Ұ����մϴ�.

Ʈ���Ÿ� ���� �� ���� �����ϰ� F5��ư���� �κ� �����ؾ� �մϴ�.
�׷��� ������ �ϳ��� �������� �νĵǾ� ���� ���� ���� �ʽ��ϴ�.
*/

CREATE TABlE tbl_test(
    id NUMBER(10),
    text VARCHAR2(20)
);

CREATE OR REPLACE TRIGGER trg_test
    AFTER DELETE OR UPDATE -- Ʈ������ �߻� ����. (���� or ���� ���Ŀ� ����)
    ON tbl_test -- Ʈ���Ÿ� ������ ���̺�
    FOR EACH ROW -- �� �࿡ ��� ����. (���� ����. ���� �� �� ���� ����)
-- DECLARE�� ���� ����
BEGIN
    DBMS_OUTPUT.put_line('Ʈ���Ű� ������!'); -- �����ϰ��� �ϴ� �ڵ带 begin ~ end�� ����
END;

INSERT INTO tbl_test VALUES(1, '��ö��'); -- ���� X
UPDATE tbl_test SET text = '��ǻ�' WHERE id = 1;
DELETE FROM tbl_test WHERE id = 1;

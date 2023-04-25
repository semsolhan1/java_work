
/*
AFTER Ʈ���� - INSERT, UPDATE, DELETE �۾� ���Ŀ� �����ϴ� Ʈ���Ÿ� �ǹ��մϴ�.
BEFORE Ʈ���� - INSERT, UPDATE, DELETE �۾� ������ �����ϴ� Ʈ���Ÿ� �ǹ��մϴ�.

:OLD = ���� �� ���� �� (INSERT: �Է� �� �ڷ�, UPDATE: ���� �� �ڷ�, DELETE: ������ ��)
:NEW = ���� �� ���� �� (INSERT: �Է� �� �ڷ�, UPDATE: ���� �� �ڷ�)

���̺� UPDATE�� DELETE�� �õ��ϸ� ����, �Ǵ� ������ �����͸�
������ ���̺� ������ ���� �������� Ʈ���Ÿ� ���� ����մϴ�.
*/

CREATE TABLE tbl_user(
    id VARCHAR2(20) PRIMARY KEY,
    name VARCHAR2(20),
    address VARCHAR2(30)
);

CREATE TABLE tbl_user_backup(
    id VARCHAR2(20) PRIMARY KEY,
    name VARCHAR2(20),
    address VARCHAR2(30),
    update_date DATE DEFAULT sysdate, -- ���� �ð�
    m_type VARCHAR2(10), -- ���� Ÿ��
    m_user VARCHAR2(20) -- ������ �����
);

-- AFTER Ʈ����
CREATE OR REPLACE TRIGGER trg_user_backup
    AFTER UPDATE OR DELETE
    ON tbl_user
    FOR EACH ROW
DECLARE -- ����� ������ �����ϴ� ��
    v_type VARCHAR2(10);
BEGIN
    IF UPDATING THEN -- UPDATING�� �ý��� ��ü���� ���¿� ���� ������ �����ϴ� ��Ʈ�� ����.
        v_type := '����';
    ELSIF DELETING THEN
        v_type := '����';
    END IF;
    
    -- ������ ���� ���� �ۼ�.
    INSERT INTO tbl_user_backup
    VALUES(:OLD.id, :OLD.name, :OLD.address, sysdate, v_type, USER());
    
    
END;
INSERT INTO tbl_user VALUES ('test01', 'kim', '����');
INSERT INTO tbl_user VALUES ('test02', 'lee', '���');
INSERT INTO tbl_user VALUES ('test03', 'hong', '�λ�');

SELECT * FROM tbl_user; 

SELECT * FROM tbl_user_backup;

UPDATE tbl_user SET address='��õ' WHERE id='test01';

DELETE FROM tbl_user WHERE id = 'test02';

-- BEFORE Ʈ����
CREATE OR REPLACE TRIGGER trg_user_insert
    BEFORE INSERT
    ON tbl_user
    FOR EACH ROW
BEGIN
    :NEW.name := SUBSTR(:NEW.name, 1, 1) || '**';
END;

INSERT INTO tbl_user VALUES('test04', '�޷���', '����');

SELECT * FROM tbl_user;

-------------------------------------------------------------------------------




















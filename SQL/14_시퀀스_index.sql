
-- ������ (���������� �����ϴ� ���� ����� �ִ� ��ü)

-- ������ ����
CREATE SEQUENCE dept3_seq 
    START WITH 1 -- ���۰� (�⺻���� ������ �� �ּҰ�, ������ �� �ִ밪)
    INCREMENT BY 1 -- ������ (����� ����, ������ ����, �⺻�� 1)
    MAXVALUE 10 -- �ִ밪(�⺻���� ���� 1027, ������ �� -1)
    MINVALUE 1 -- �ּҰ�(�⺻�� ������ �� 1, ������ �� -1028)
    NOCACHE -- ĳ�ø޸� ��� ���� (CACHE) 
    NOCYCLE; -- ��ȯ ���� (NOCYCLE�� �⺻, ��ȯ��Ű���� CYCLE)


DROP TABLE dept3;

CREATE TABLE dept3 (
    dept_no NUMBER(2) PRIMARY KEY,
    dept_name VARCHAR2(14),
    loca VARCHAR2(13),
    dept_date DATE
);

-- ������ ����ϱ� (NEXTVAL, CURRVAL)
INSERT INTO dept3
VALUES(dept3_seq.NEXTVAL, 'test', 'test', sysdate);

SELECT * FROM dept3;

SELECT dept3_seq.CURRVAL FROM dual;

-- ������ ���� (���� ���� ����)
-- START WITH�� ������ �Ұ����մϴ�.
ALTER SEQUENCE dept3_seq MAXVALUE 9999; -- �ִ밪 ����
ALTER SEQUENCE dept3_seq INCREMENT BY -1; -- ������ ����
ALTER SEQUENCE dept3_seq MINVALUE 0; -- �ּҰ� ����

-- ������ ���� �ٽ� ó������ ������ ���
SELECT dept3_seq.CURRVAL FROM dual;
ALTER SEQUENCE dept3_seq INCREMENT BY -29;
SELECT dept3_seq.NEXTVAL FROM dual;
ALTER SEQUENCE dept3_seq INCREMENT BY 1;

DROP SEQUENCE dept3_seq;

--------------------------------------------------------------------------------

/*
- index
index�� primary key, unique ���� ���ǿ��� �ڵ����� �����ǰ�,
��ȸ�� ������ �� �ִ� hint ������ �մϴ�.
index�� ��ȸ�� ������ ������, �������ϰ� ���� �ε����� �����ؼ�
����ϸ� ������ ���� ���ϸ� ����ų �� �ֽ��ϴ�.
���� �ʿ��� ���� index�� ����ϴ� ���� �ٶ����մϴ�.
*/

SELECT * FROM employees WHERE salary = 12008;

-- �ε��� �߰�
CREATE INDEX emp_salary_idx ON employees(salary); 

DROP INDEX emp_salary_idx;


-- �������� �ε����� ����ϴ� hint ���
CREATE SEQUENCE board_seq
    START WITH 1
    INCREMENT BY 1
    NOCACHE
    NOCYCLE;
    
CREATE TABLE tbl_board(
    bno NUMBER(10) PRIMARY KEY,
    writer VARCHAR2(20)
);

INSERT INTO tbl_board
VALUES(board_seq.NEXTVAL, 'test');

INSERT INTO tbl_board
VALUES(board_seq.NEXTVAL, 'admin');

INSERT INTO tbl_board
VALUES(board_seq.NEXTVAL, 'hong');

INSERT INTO tbl_board
VALUES(board_seq.NEXTVAL, 'kim');

INSERT INTO tbl_board
VALUES(board_seq.NEXTVAL, 'test');

INSERT INTO tbl_board
VALUES(board_seq.NEXTVAL, 'test');

INSERT INTO tbl_board
VALUES(board_seq.NEXTVAL, 'admin');

INSERT INTO tbl_board
VALUES(board_seq.NEXTVAL, 'hong');

INSERT INTO tbl_board
VALUES(board_seq.NEXTVAL, 'kim');

SELECT * FROM tbl_board;

COMMIT;

-- �ε��� �̸� ����
ALTER INDEX SYS_C007043
RENAME TO tbl_board_idx;

SELECT * FROM    
    (
    SELECT ROWNUM AS rn, a.*
    FROM
        (
        SELECT * 
        FROM tbl_board
        ORDER BY bno DESC
        ) a
    )
WHERE rn > 10 AND rn <= 20;

-- /*+ INDEX(table_name index_name) */
-- ������ �ε����� ������ ���Բ� ����.
-- INDEX ASC, DESC�� �߰��ؼ� ������, ������ ������ ���Բ� ���� ����.

SELECT * FROM    
    (
    SELECT /*+ INDEX_DESC(tbl_board tbl_board_idx)*/
        ROWNUM AS rn,
        bno,
        writer
    FROM tbl_board
    )
WHERE rn > 10 AND rn <= 20;

/*
- �ε����� ����Ǵ� ��� 
1. �÷��� WHERE �Ǵ� �������ǿ��� ���� ���Ǵ� ���
2. ���� �������� ���� �����ϴ� ���
3. ���̺��� ������ ���
4. Ÿ�� �÷��� ���� ���� null���� �����ϴ� ���.
5. ���̺��� ���� �����ǰ�, �̹� �ϳ� �̻��� �ε����� ������ �ִ� ��쿡��
 �������� �ʽ��ϴ�.
*/













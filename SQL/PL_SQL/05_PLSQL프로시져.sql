
--���ν���(procedure) -> void �޼��� ����
--Ư���� ������ ó���ϰ� ������� ��ȯ���� �ʴ� �ڵ� ���(����)
--������ ���ν����� ���ؼ� ���� �����ϴ� ����� �ֽ��ϴ�.

--�Ű���(�μ�) ���� ���ν���
CREATE PROCEDURE p_test
IS -- �����
    v_msg VARCHAR2(20) := 'Hello Procedure!';
BEGIN
    DBMS_OUTPUT.put_line(v_msg);
END;

EXEC p_test; -- ���ν��� ȣ�⹮

SET SERVEROUTPUT ON;

-- IN �Է°��� ���޹޴� �Ķ����
CREATE PROCEDURE my_new_job_proc
    (p_job_id IN jobs.job_id%TYPE,
    p_job_title IN jobs.job_title%TYPE,
    p_min_sal IN jobs.min_salary%TYPE,
    p_max_sal IN jobs.max_salary%TYPE
    )
IS

BEGIN
    INSERT INTO jobs (job_id, job_title, min_salary, max_salary)
    VALUES(p_job_id, p_job_title, p_min_sal, p_max_sal);
    COMMIT;
END;

EXEC my_new_job_proc('JOB4', 'test job4', 10000, 20000);

SELECT * FROM jobs;

-- job_id�� Ȯ���ؼ�
-- �̹� �����ϴ� �����Ͷ�� ����, ���ٸ� ���Ӱ� �߰�
CREATE OR REPLACE PROCEDURE my_new_job_proc -- ���� ���ν��� ������ ����.
    (p_job_id IN jobs.job_id%TYPE,
    p_job_title IN jobs.job_title%TYPE,
    p_min_sal IN jobs.min_salary%TYPE,
    p_max_sal IN jobs.max_salary%TYPE
    )
IS
    v_cnt NUMBER := 0;
BEGIN

    -- ������ job_id�� �ִ������� üũ
    -- �̹� �����Ѵٸ� 1, �������� �ʴ´ٸ� 0 -> v_cnt�� ����.
    SELECT
        COUNT(*)
    INTO
        v_cnt
    FROM jobs
    WHERE job_id = p_job_id;
    
    IF v_cnt = 0 THEN -- ���ٸ� INSERT�ϰڴ�.
        INSERT INTO jobs (job_id, job_title, min_salary, max_salary)
        VALUES(p_job_id, p_job_title, p_min_sal, p_max_sal);
    ELSE -- ���ٸ� UPDATE
        UPDATE jobs
        SET job_title = p_job_title,
        min_salary = p_min_sal,
        max_salary = p_max_sal
        WHERE job_id = p_job_id;
        END IF;
        
    COMMIT;
END;

-- �Ű���(�μ�)�� ����Ʈ ��(�⺻��) ����
CREATE OR REPLACE PROCEDURE my_new_job_proc -- ���� ���ν��� ������ ����.
    (p_job_id IN jobs.job_id%TYPE,
     p_job_title IN jobs.job_title%TYPE,
     p_min_sal IN jobs.min_salary%TYPE := 0,
     p_max_sal IN jobs.max_salary%TYPE := 1000
    )
IS
    v_cnt NUMBER := 0;
BEGIN

    -- ������ job_id�� �ִ������� üũ
    -- �̹� �����Ѵٸ� 1, �������� �ʴ´ٸ� 0 -> v_cnt�� ����.
    SELECT
        COUNT(*)
    INTO
        v_cnt
    FROM jobs
    WHERE job_id = p_job_id;
    
    IF v_cnt = 0 THEN -- ���ٸ� INSERT�ϰڴ�.
        INSERT INTO jobs (job_id, job_title, min_salary, max_salary)
        VALUES(p_job_id, p_job_title, p_min_sal, p_max_sal);
    ELSE -- ���ٸ� UPDATE
        UPDATE jobs
        SET job_title = p_job_title,
        min_salary = p_min_sal,
        max_salary = p_max_sal
        WHERE job_id = p_job_id;
        END IF;
        
    COMMIT;
END;

EXEC my_new_job_proc('JOB5', 'test job5');

SELECT * FROM jobs;

------------------------------------------------------------------
-- OUT, IN OUT �Ű����� ���.
-- OUT ������ ����ϸ� �������� �ٱ����� ���� �����ϴ�.
-- OUT�� �̿��ؼ� ���� ���� �ٱ� �͸� ��Ͽ��� �����ؾ� �մϴ�.

CREATE OR REPLACE PROCEDURE my_new_job_proc -- ���� ���ν��� ������ ����.
    (p_job_id IN jobs.job_id%TYPE,
     p_job_title IN jobs.job_title%TYPE,
     p_min_sal IN jobs.min_salary%TYPE := 0,
     p_max_sal IN jobs.max_salary%TYPE := 1000,
     p_result OUT VARCHAR2 -- �ٱ��ʿ��� ����� �ϱ� ���� ����
    )
IS
    v_cnt NUMBER := 0;
    v_result VARCHAR2(100) := '���� ��� INSERTó�� �Ǿ����ϴ�.';
BEGIN

    -- ������ job_id�� �ִ������� üũ
    -- �̹� �����Ѵٸ� 1, �������� �ʴ´ٸ� 0 -> v_cnt�� ����.
    SELECT
        COUNT(*)
    INTO
        v_cnt
    FROM jobs
    WHERE job_id = p_job_id;
    
    IF v_cnt = 0 THEN -- ���ٸ� INSERT�ϰڴ�.
        INSERT INTO jobs (job_id, job_title, min_salary, max_salary)
        VALUES(p_job_id, p_job_title, p_min_sal, p_max_sal);
    ELSE -- ������ �����ϴ� �����Ͷ�� ����� ����.
        SELECT
            p_job_id || '�� �ִ� ����: ' || max_salary || ', �ּҿ���: ' || min_salary
            INTO
                v_result -- ��ȸ ����� ����
        FROM jobs
        WHERE job_id = p_job_id;
    END IF;
        
    -- OUT �Ű������� ����� �Ҵ�.
    p_result := v_result;
        
    COMMIT;
END;

DECLARE
    str VARCHAR2(100);
BEGIN
    my_new_job_proc('JOB2', 'test_job1', 2000, 8000, str);
    DBMS_OUTPUT.put_line(str);
    
    my_new_job_proc('CEO', 'test_CEO', 20000, 80000, str);
    DBMS_OUTPUT.put_line(str);
    
END;

----------------------------------------------------------------------
-- IN, OUT�� ���ÿ� ó��
CREATE OR REPLACE PROCEDURE my_parameter_test_proc
    (
    -- ��ȯ �Ұ�. �޴� �뵵�θ� Ȱ��
    p_var1 IN VARCHAR2,
    -- OUT ������ ���ν����� ������ ������ ���� �Ҵ��� �ȵ�.
    -- �����߸� OUT�� ����0
    p_var2 OUT VARCHAR2,
    -- IN, OUT�� �� �� ������.
    p_var3 IN OUT VARCHAR2
    
    
    )
IS

BEGIN
    DBMS_OUTPUT.put_line('p_var1: ' || p_var1); -- �翬�� ��
    DBMS_OUTPUT.put_line('p_var2: ' || p_var2); -- ���� ���޵��� ���� (����)
    DBMS_OUTPUT.put_line('p_var3: ' || p_var3); -- IN�� ������ ������ �ֱ���~
    
    -- p_var1 := '���1'; IN ������ �� �Ҵ� ��ü�� �Ұ�.
    p_var2 := '���2';
    p_var3 := '���3';
    
END;

DECLARE
    v_var1 VARCHAR2(10) := 'value1';
    v_var2 VARCHAR2(10) := 'value2';
    v_var3 VARCHAR2(10) := 'value3';
BEGIN
    my_parameter_test_proc(v_var1, v_var2, v_var3);
    
    DBMS_OUTPUT.put_line('v_var1: ' || v_var1);
    DBMS_OUTPUT.put_line('v_var2: ' || v_var2);
    DBMS_OUTPUT.put_line('v_var3: ' || v_var3);
END;
------------------------------------------------------------------------------

-- RETURN
CREATE OR REPLACE PROCEDURE my_new_job_proc -- ���� ���ν��� ������ ����.
    (p_job_id IN jobs.job_id%TYPE,
     p_result OUT VARCHAR2 -- �ٱ��ʿ��� ����� �ϱ� ���� ����
    )
IS
    v_cnt NUMBER := 0;
    v_result VARCHAR2(100) := '���� ��� INSERTó�� �Ǿ����ϴ�.';
BEGIN
    SELECT
        COUNT(*)
    INTO
        v_cnt
    FROM jobs
    WHERE job_id = p_job_id;
    
    IF v_cnt = 0 THEN -- ���ٸ� INSERT�ϰڴ�.
        DBMS_OUTPUT.put_line(p_job_id || '�� ���̺� �������� �ʽ��ϴ�.');
        RETURN; --���ν��� ���� ����.
    END IF;
    
    SELECT
        p_job_id || '�� �ִ� ����: ' || max_salary || ', �ּҿ���: ' || min_salary
    INTO
        v_result -- ��ȸ ����� ����
        FROM jobs
        WHERE job_id = p_job_id;
        
    -- OUT �Ű������� ����� �Ҵ�.
    p_result := v_result;
        
    COMMIT;
END;

DECLARE
    str VARCHAR2(100);
BEGIN
    my_new_job_proc('IT_PROG', str);
    DBMS_OUTPUT.put_line(str);
END;

-- ���� ó��
DECLARE
    v_num NUMBER := 0;
BEGIN
    v_num := 10 / 0;
/*
OTHERS �ڸ��� ������ Ÿ���� �ۼ��� �ݴϴ�.
ACCESS_INTO_NULL -> ��ü �ʱ�ȭ�� �Ǿ� ���� ���� ���¿��� ���.
NO_DATA_FOUND -> SELECT INTO �� �����Ͱ� �Ѱǵ� ���� ��
ZERO_DIVIDE -> 0���� ���� ��
VALUE_ERROR -> ��ġ �Ǵ� �� ����
INVALID_NUMBER -> ���ڸ� ���ڷ� ��ȯ�� �� ������ ���
*/    
EXCEPTION WHEN OTHERS THEN -- Ÿ������ �������� �ʰ� ��� Ÿ���� ����ó���Ѵ�.
    DBMS_OUTPUT.put_line('0���� ���� �� �����ϴ�.');
    DBMS_OUTPUT.put_line('SQL ERROR CODE: ' || SQLCODE);
    DBMS_OUTPUT.put_line('SQL ERROR CODE: ' || SQLERRM);
    
END;

EXCEPTION 
    WHEN ZERO_DIVIDE THEN 
    DBMS_OUTPUT.put_line('0���� ���� �� �����ϴ�.');
    DBMS_OUTPUT.put_line('SQL ERROR CODE: ' || SQLCODE);
    DBMS_OUTPUT.put_line('SQL ERROR CODE: ' || SQLERRM);
    WHEN OTHERS THEN
        DBMS_OUTPUT.put_line('�� �� ���� ���� �߻�!');
END;









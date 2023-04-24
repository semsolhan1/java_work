SET SERVEROUTPUT ON;
-- 1. ������ �� 3���� ����ϴ� �͸� ����� ����� ����. (��¹� 9���� �����ؼ� ������)
DECLARE

BEGIN
    DBMS_OUTPUT.put_line('3 X 1 = ' || 3*1);
    DBMS_OUTPUT.put_line('3 X 2 = ' || 3*2);
    DBMS_OUTPUT.put_line('3 X 3 = ' || 3*3);
    DBMS_OUTPUT.put_line('3 X 4 = ' || 3*4);
    DBMS_OUTPUT.put_line('3 X 5 = ' || 3*5);
    DBMS_OUTPUT.put_line('3 X 6 = ' || 3*6);
    DBMS_OUTPUT.put_line('3 X 7 = ' || 3*7);
    DBMS_OUTPUT.put_line('3 X 8 = ' || 3*8);
    DBMS_OUTPUT.put_line('3 X 9 = ' || 3*9);
    
END;

-- 2. employees ���̺��� 201�� ����� �̸��� �̸��� �ּҸ� ����ϴ�
-- �͸����� ����� ����. (������ ��Ƽ� ����ϼ���.)

DECLARE
    v_emp_name VARCHAR2(100);
    v_emp_email VARCHAR2(100);
BEGIN

    SELECT
        first_name, email
        INTO
        v_emp_name, v_emp_email
    FROM employees
    WHERE employee_id = 201;
    
    DBMS_OUTPUT.put_line(v_emp_name || '-' || v_emp_email);
END;


-- 3. employees ���̺��� �����ȣ�� ���� ū ����� ã�Ƴ� �� (MAX �Լ� ���)
-- �� ��ȣ + 1������ �Ʒ��� ����� emps ���̺�
-- employee_id, last_name, email, hire_date, job_id�� �ű� �����ϴ� �͸� ����� ���弼��.
--SELECT�� ���Ŀ� INSERT�� ����� �����մϴ�.
/*
<�����>: steven
<�̸���>: stevenjobs
<�Ի�����>: ���ó�¥
<JOB_ID>: CEO
*/
DROP TABLE emps;
CREATE TABLE emps AS (SELECT * FROM employees WHERE 1=2);

DECLARE
    v_max_empno employees.employee_id%TYPE;
    
BEGIN
    
    SELECT
        MAX(employee_id)
    INTO
        v_max_empno
    FROM employees;
    
    INSERT INTO emps
        (employee_id, last_name, email, hire_date, job_id)
    VALUES
        (v_max_empno + 1, 'steven', 'stevenjobs', sysdate, 'CEO');
        
    COMMIT;
    
END;

SELECT * FROM emps;








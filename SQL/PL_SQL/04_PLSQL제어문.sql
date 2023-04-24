
-- IF문
DECLARE
    v_num1 NUMBER := 10;
    v_num2 NUMBER := 5;
BEGIN
    IF
        v_num1 >= v_num2
    THEN
        DBMS_OUTPUT.put_line(v_num1 || '이(가) 큰 수');
    ELSE
        DBMS_OUTPUT.put_line(v_num2 || '이(가) 큰 수');
    END IF;
END;

--ELSIF

DECLARE
    v_salary NUMBER := 0;
    v_department_id NUMBER := 0;
BEGIN
    v_department_id := ROUND(DBMS_RANDOM.VALUE(10, 120), -1);
    
    SELECT
        salary
    INTO
        v_salary
    FROM employees
    WHERE department_id = v_department_id
    AND ROWNUM = 1; -- 첫째 값만 구해서 변수에 저장하기 위해.
    DBMS_OUTPUT.put_line(v_salary);
    
    IF v_salary <= 5000 THEN
        DBMS_OUTPUT.put_line('낮음');
    ELSIF v_salary <= 9000 THEN
        DBMS_OUTPUT.put_line('중간');
    ELSE
        DBMS_OUTPUT.put_line('높음');
    END IF;
END;

-- CASE문
DECLARE
    v_salary NUMBER := 0;
    v_department_id NUMBER := 0;
BEGIN
    v_department_id := ROUND(DBMS_RANDOM.VALUE(10, 120), -1);
    
    SELECT
        salary
    INTO
        v_salary
    FROM employees
    WHERE department_id = v_department_id
    AND ROWNUM = 1; -- 첫째 값만 구해서 변수에 저장하기 위해.
    DBMS_OUTPUT.put_line(v_salary);
    CASE
    WHEN v_salary <= 5000 THEN
        DBMS_OUTPUT.put_line('낮음');
    WHEN v_salary <= 9000 THEN
        DBMS_OUTPUT.put_line('중간');
    ELSE
        DBMS_OUTPUT.put_line('높음');
    END CASE;
END;

-- 충첩 if문

DECLARE
    v_salary NUMBER := 0;
    v_department_id NUMBER := 0;
    v_commission NUMBER := 0;
BEGIN
    v_department_id := ROUND(DBMS_RANDOM.VALUE(10, 120), -1);
    
    SELECT
        salary, commission_pct
    INTO
        v_salary, v_commission
    FROM employees
    WHERE department_id = v_department_id
    AND ROWNUM = 1; -- 첫째 값만 구해서 변수에 저장하기 위해.
    DBMS_OUTPUT.put_line(v_salary);
    
    IF v_commission > 0 THEN
        IF v_commission > 0.15 THEN
            DBMS_OUTPUT.put_line(v_salary * v_commission);
        END IF;
    ELSE
        DBMS_OUTPUT.put_line(v_salary);
    END IF;
END;


















-- WHILE문

DECLARE
    v_num NUMBER := 3;
    v_count NUMBER := 1;
BEGIN
    WHILE v_count <= 10
    LOOP
        DBMS_OUTPUT.put_line(v_num);
        v_count := v_count + 1;
    END LOOP;

END;

-- 탈출문

DECLARE
    v_num NUMBER := 3;
    v_count NUMBER := 1;
BEGIN
    WHILE v_count <= 10
    LOOP
        DBMS_OUTPUT.put_line(v_num);
        EXIT WHEN v_count = 5;
        v_count := v_count + 1;
    END LOOP;

END;

-- FOR문
DECLARE
    v_num NUMBER := 3;
BEGIN

    FOR i IN 1..9 -- '.'을 두개 작성해서 범위를 표현.
    LOOP
        DBMS_OUTPUT.put_line(v_num || ' X ' || i || ' = ' || v_num*i);
    END LOOP;

END;

-- CONTINUE문

DECLARE
    v_num NUMBER := 3;
BEGIN

    FOR i IN 1..9 -- '.'을 두개 작성해서 범위를 표현.
    LOOP
        CONTINUE WHEN i = 5;
        DBMS_OUTPUT.put_line(v_num || ' X ' || i || ' = ' || v_num*i);
    END LOOP;

END;

-- 1. 모든 구구단을 출력하는 익명 블록을 만드세요. (2 ~ 9단)
-- 변수가 필요가 없었다. DECLARE를 뺌.
BEGIN
    FOR i IN 2..9
        LOOP
        DBMS_OUTPUT.put_line('구구단: ' || i || '단');
            FOR j IN 1..9
                LOOP
                DBMS_OUTPUT.put_line(i || ' X ' || j || ' = ' || i*j);
                END LOOP;
                DBMS_OUTPUT.put_line('-------------------------');
        END LOOP;
END;

-- 2. INSERT를 300번 실행하는 익명 블록을 처리하세요.
-- board라는 이름의 테이블을 만드세요. (bno, writer, title 컬럼이 존재합니다.)
-- bno는 SEQUENCE로 올려 주시고, writer와 title에 번호를 붙여서 INSERT 진행해 주세요.
-- ex) 1, test1, title -> 2 test2 title2 -> 3 test3 title3 .....

SET SERVEROUTPUT ON;
DROP TABLE board;
CREATE TABLE board (
    bno NUMBER PRIMARY KEY,
    writer VARCHAR2(30),
    title VARCHAR2(30)
);

CREATE SEQUENCE b_seq
    START WITH 1
    INCREMENT BY 1
    MAXVALUE 1000
    NOCYCLE
    NOCACHE;
    
DECLARE
    v_num NUMBER := 1;
BEGIN
    WHILE v_num <= 300
    LOOP
        INSERT INTO board
        VALUES(b_seq.NEXTVAL, 'test' || v_num, '제목: ' || v_num);
        v_num := v_num + 1;
    END LOOP;
    COMMIT;
END;

SELECT * FROM board
ORDER BY bno DESC;



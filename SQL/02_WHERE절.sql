SELECT * FROM employees;

-- WHERE절 비교 (데이터 값은 대/소문자를 구분합니다.)

SELECT first_name, last_name, job_id
FROM employees
WHERE job_id = 'IT_PROG';

SELECT * FROM employees
WHERE last_name = 'King';

SELECT *
FROM employees
WHERE department_id = 90;

SELECT *
FROM employees
WHERE salary >= 15000;

SELECT *
FROM employees
WHERE hire_date = '04/01/30';

-- 데이터 행 제한(BETWEEN, IN, LIKE)
SELECT * FROM employees 
WHERE salary 
BETWEEN 10000 AND 24000;

SELECT * FROM employees
WHERE hire_date BETWEEN '03/01/01' AND '03/12/31';

--IN 연산자의 사용(특정 값들과 비교할 때 사용)

SELECT * FROM employees
WHERE manager_id IN (100, 101, 102);

SELECT * FROM employees
WHERE job_id IN ('IT_PROG', 'AD_VP');

--LIKE 연산자
--%는 어떠한 문자든, _는 데이터의 자리 (위치)를 찾아낼 때
SELECT first_name, hire_date
FROM employees
WHERE hire_date LIKE '03%';
--%15로 끝나는 %는 상관없는 값
SELECT first_name, hire_date
FROM employees
WHERE hire_date LIKE '%15';
--어디에 05가 들어가든 상관없다는 코드
SELECT first_name, hire_date
FROM employees
WHERE hire_date LIKE '%05%';
--언더바로 공백까지 언더바로 지정하여 검색조건 설정
SELECT first_name, hire_date
FROM employees
WHERE hire_date LIKE '___05%';

--IS NULL (null값을 찾음)
SELECT * FROM employees
WHERE manager_id IS NULL;

SELECT * FROM employees
WHERE commission_pct IS NULL;

-- AND, OR
-- AND가 OR보다 연산 순서가 빠름
SELECT * FROM employees
WHERE (job_id = 'IT_PROG'
OR job_ID = 'FI_MGR')
AND salary >= 6000;

-- 데이터의 정렬(SELECT 구문의 가장 마지막에 배치됩니다.)
-- ASC: ascending 오름차순
-- DESC: descending 내림차순
SELECT * FROM employees
ORDER BY hire_date ASC;

SELECT * FROM employees
ORDER BY hire_date DESC;

SELECT * FROM employees
WHERE hob_if = 'IT_PROG'
ORDER BY first_name ASC;

SELECT * FROM employees
WHERE salary >= 5000
ORDER BY employee_id DESC;

SELECT first_name, salary*12 AS pay
FROM emploYees
ORDER BY pay ASC;

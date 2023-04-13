
--그룹함수 AVG, MAX, MIN, SUM, COUT
SELECT
AVG(salary),
MAX(salary),
MIN(salary),
SUM(salary),
COUNT(salary)
FROM employees;

SELECT COUNT(*) FROM employees;-- 총 행 데이터의 수
SELECT COUNT(first_name) FROM employees;
SELECT COUNT(commission_pct) FROM employees;-- null이 아닌 행의 수
SELECT COUNT(manager_id) FROM employees; -- null이 아닌 행의 수

--부서별로 그룹화, 그룹함수의 사용
SELECT 
    department_id,
    AVG(salary)
FROM employees
GROUP BY department_id;

-- 주의할 점
--그룹 함수는 일반 컬럼과 동시에 그냥 출력할 수는 없습니다.
SELECT 
    department_id,
    AVG(salary)
FROM employees;

-- GROUP BY절을 사용할 때 GROUP절에 묶이지 않으면 다른 컬럼을 조회할 수 없습니다.
SELECT 
    job_id,
    department_id,
    AVG(salary)
FROM employees
GROUP BY department_id; -- 에러

--GROUP BY절 2개 이상 사용
SELECT 
    job_id,
    department_id,
    AVG(salary)
FROM employees
GROUP BY department_id, job_id
ORDER BY department_id;

--GROUP BY를 통해 그룹화를 할 때 조건을 걸 경우 HAVING을 사용.
SELECT 
    department_id,
    AVG(salary)
FROM employees
GROUP BY department_id
HAVING SUM(salary) > 100000;

SELECT
    job_id,
    COUNT(*)
FROM employees
GROUP BY job_id
HAVING COUNT(*) >= 5;

-- 부서 아이디가 50 이상인 것들을 그룹화 시키고, 그룹 월급 평균이 5000 이상만 조회
SELECT                          --3.
    department_id,              --3.
    AVG(salary) AS 평균         --3.
FROM employees                  --1.
WHERE department_id >= 50       --2.
GROUP BY department_id          --2.
HAVING AVG(salary) >= 5000      --2.
ORDER BY department_id DESC;    --4. sql의 실행순서 
-- 코드를 입력하세요
-- 보호 시작일 보다 입양일이 더 빠른 동물들의 아이디와 이름을 조회
SELECT A.ANIMAL_ID,
       A.NAME
  FROM ANIMAL_INS A,
       ANIMAL_OUTS B
 WHERE 1=1
 AND B.DATETIME < A.DATETIME
 AND A.ANIMAL_ID = B.ANIMAL_ID
 ORDER BY A.DATETIME ASC;
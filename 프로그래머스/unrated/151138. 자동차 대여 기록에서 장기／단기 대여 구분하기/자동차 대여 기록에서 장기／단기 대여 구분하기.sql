SELECT 
    HISTORY_ID, 
    CAR_ID, 
    DATE_FORMAT(START_DATE, '%Y-%m-%d') as START_DATE, 
    DATE_FORMAT(END_DATE, '%Y-%m-%d') as END_DATE, 
    CASE WHEN DATEDIFF(END_DATE,START_DATE) >= 29 THEN "장기 대여"
    ELSE "단기 대여" end as RENT_TYPE
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where month(start_date) = 9 
and year(start_date) = 2022
ORDER BY HISTORY_ID DESC;








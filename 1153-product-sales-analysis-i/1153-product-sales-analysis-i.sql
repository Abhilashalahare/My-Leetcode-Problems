# Write your MySQL query statement below
select  p.product_name, s.year, s.price
from sales as s left join  product as p
on s.product_id = p.product_id


-- # Write your MySQL query statement below
-- SELECT s.year, s.price, p.product_name 
-- FROM Sales s
-- INNER JOIN Product p
-- ON s.product_id = p.product_id;
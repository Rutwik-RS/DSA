# Write your MySQL query statement below
select s.product_id,p.product_name from 
Sales s
inner join Product p
on s.product_id = p.product_id
group by s.product_id
having not(MAX(s.sale_date) > '2019-03-31' or MIN(s.sale_date) < '2019-01-01' )
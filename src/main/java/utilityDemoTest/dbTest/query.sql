
-- match customers in the same city but different customer name
select A.CustomerName As CustomerName1, B.CustomerName As CustomerName2,A.City
From Customer A, Customer B
Where A.CustomerID<>B.CustometerID
and A.City=B.City
order by A.City
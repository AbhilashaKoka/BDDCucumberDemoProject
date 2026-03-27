
-- (Self Join ) match customers in the same city but different customer name
select A.CustomerName As CustomerName1, B.CustomerName As CustomerName2,A.City
From Customer A, Customer B
Where A.CustomerID<>B.CustometerID
and A.City=B.City
order by A.City

-- (Full Join) select all customers and all orders
select Customers.CustomerName, Orders.OrderID
From Customers Full OUTER JOIN Orders
ON Customers.CustomerID=Orders.CustomerID
ORDER BY Customers.CustomerName;

--(Right Join) Return all Employee and any orders they might have placed
SELECT Orders.OrderId, Employees.lastname, Employees.Firstname
FROM Orders RIGHT JOIN Employees
ON Orders.EmployeeId=Employees.EmployeeId
ORDER BY Orders.OrderId;

--(Left Join) Select all Customer, and any Orders they might have
Select Customers.CustomerName, Orders.OrderId
FROM Customers LEFT JOIN  Orders
ON  Customers.CustomerId=Orders.CustomersId
ORDER BY Customers.CustomerName;

--(Inner Join) Select all orders with Customers and Shipper information
SELECT  Orders.OrderId,Customers.CustomerName, Shippers.ShipperName
FROM Orders INNER JOIN Customers
ON Orders.CustomerId = Customers.CustomerId
INNER JOIN Shippers
ON Orders.ShipperId = Shippers.ShipperId;

--Between operator
--NotIn operator
--Second Larger operator
SELECT  MAX(Salary) AS SecondHighestSalary
FROM Employees
WHERE Salary < (SELECT MAX(Salary) FROM Employees);

SELECT Name, MAX(Salary) AS SecondHighestSalary
From Employees
WHERE Salary <>(SELECT MAX(Salary) FROM Employees);

SELECT Name,MAX(Salary) AS SecondHighestSalary
FROM Employees
WHERE Salary NOT IN (SELECT MAX(Salary) FROM Employees);

SELECT Name,MAX(Salary) AS SecondHighestSalary
FROM Employees
WHERE Salary  IN (SELECT Salary FROM Employees MINUS SELECT MAX(Salary) FROM Employees);

--list the number of the orders send by each supplier
SELECT Suppliers.SupplierName, COUNT(Orders.OrderId) AS NumberOfOrders
FROM Orders
LEFT JOIN Shippers
ON Orders.ShippersId=Shippers.ShipperId
GROUP BY Shippers.ShipperName;


--Return the cities (only distinct Values) From both the "Customers and "Suppliers" tables
SELECT City FROM Customers
UNION
Select City From Supplier
ORDER BY City;

--list the number of the customers in each country sorted higher to low
SELECT COUNT(CustomerId), Country
FROM Customers
GROUP BY Country
ORDER BY COUNT(CustomerId) DESC;

--list the number of Customers in each Country Coloumns
SELECT COUNT(CustomerId), Country
FROM Customers
GROUP BY Country;

--List the Employees "David" and "Michael" have registered more than 25 orders
SELECT  Employee.LastName, Count(Orders.OrderID) As NumberOfOrders
FROM Orders
INNER JOIN Employees
On Orders.EmployeeId=Employees.EmployeeId
WHERE Employees.LastName IN ('David','Michael')
GROUP BY Employees.LastName
HAVING COUNT(Orders.OrderID)>25
ORDER BY NumberOfOrders DESC;

--List the employees the have registered more than 10 Orders
SELECT Employees.lastName, Count(Orders.OrderID) AS NumberOfOrders
FROM Orders
INNER JOIN Employees
ON Orders.EmployeeId=Employees.EmployeeId
GROUP BY Employees.LastName
HAVING COUNT(Orders.OrderID)>10
ORDER BY NumberOfOrders DESC;


--list the number of customers in each country sorted higher to low(only include countries with more than 5 customers)
SELECT COUNT(CustomerId), Country
FROM Customers
GROUP BY Country
HAVING COUNT(CustomerId)>5
ORDER BY COUNT(CustomerId) DESC;

--List  the number of customers in each country only include countries with more than 5 customers
SELECT COUNT(CustomerId), Country
FROM Customers
GROUP BY Country
HAVING COUNT(CustomerId)>5
ORDER BY Country;

--List the ProductName if all the records in the Order Details table have quality equal to 10
SELECT  ProductName FROM Products
WHERE ProductId IN (
SELECT ProductId
FROM OrderDetails
WHERE Quality=10);

--lists Alls Products name
SELECT  all ProductName FROM Products
Where True;

--Return lists of the suppliers with a product price higher than 20
SELECT SupplierName FROM Suppliers
WHERE EXISTS(SELECT ProductName FROM Products)
WHERE Products.SupplierId=Suppliers.SupplierId
AND Products.Price<20);
































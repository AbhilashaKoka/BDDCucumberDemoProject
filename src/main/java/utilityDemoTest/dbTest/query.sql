
-- (Self Join ) match customers in the same city but different customer name
select A.CustomerName As CustomerName1, B.CustomerName As CustomerName2,  A.City
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

--Between operator-Select all products with a price between 10 to 20 In addition, the categoryID must be either 1,2 or 3.
    Select * from Products
    Where Price Between 10 AND 200
    AND CategoryID IN (1,2,3);

--NotIn operator
    Select * From Customers
    Where Country NOT IN ('Germany','France','UK');


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


--identify the first and lST ORDER DTE FOR EACH CUSTOMER
SEELCT customer_id
       Min(order_date) As first_order,
       Max(order_date) As last_order
       from Orders
       Group by customer_id;


--find duplicate record
       Select coloumn1, coloumn2, coloumn3, COUNT(*)
         From table_name

         Group by coloumn1, coloumn2, coloumn3
            HAVING COUNT(*)>1;



--Retreive the second highest salary from the Employees table
SELECT MAX(Salary) AS SecondHighestSalary
FROM Employees
WHERE Salary < (SELECT MAX(Salary) FROM Employees);


--find employee without department(left join usage
select e.*
From Employees e
left join Departments d
on e.DepartmentId=d.DepartmentId
Where d.DepartmentId is null;

--calcualte the total revenue per product
select product_id
Sum(quality*price)As total_revenue
From Sales
Group By product_id;

--get the top 3 highest paid employee
select top 3*
From Employees
Order By Salary DESC;

--customer who has purchased but never return product
Select Customer c
join Orders on c.CustomerId=o.CustomerId
where c.customerId not in (select CustomerId from Returns);


--show the count of orders per customer
select customer_id
count(*) As order_count
from Orders
Group by customer_id;


--retreive all employee who joined in 2023
Select *
from employees
where YEAR(join_date)=2023;

--calcualte the average order value per customer
select customer_id
AVG(total_amount) As average_order_value
from Orders
Group by customer_id;


--get the latest order placed by each customer
select customer_id, MAX(order_date) As latest_order_date
from Orders
Group by customer_id;


--find prodcut theat were never slod
selevt p.produt from Prodcuts p
left join OrderDetails od
on p.product_id=od.product_id
where od.product_id is null;

 --identify the most selling prodcut
select top 1 product_id, SUM(quantity) AS total_sold
from sales
Group by product_id
Order by total_sold DESC;


--get the total revenue and the number of orders per region
select region
sum(total_amount) As total_revenue, count(*) As number_of_orders
from Orders
Group by region;


--count how many customers plcaed more than 5 orders
select count(*) as customer_count
from (
select customer_id
from Orders
Group by customer_id
having count(*)>5) as subquery;


--major subject (like Computer Science, Mathematics, etc.) for the student with ID 101
SELECT s.student_id, s.name, m.major_name
FROM Students s
JOIN Majors m
 ON s.major_id = m.major_id
WHERE s.student_id = 101;


--Example with Multiple Subjects (if students can have more than one)
SELECT s.name, subj.subject_name
FROM Students s
JOIN StudentSubjects ss ON s.student_id = ss.student_id
JOIN Subjects subj ON ss.subject_id = subj.subject_id
WHERE s.student_id = 101;



-- Students table
CREATE TABLE Students (
  student_id INT PRIMARY KEY,
   name VARCHAR(100),
   major_id INT
);

-- Majors table
CREATE TABLE Majors (
 major_id INT PRIMARY KEY,
  major_name VARCHAR(100)
);

-- Sample data
INSERT INTO Majors
VALUES (1, 'Computer Science'), (2, 'Mathematics'), (3, 'Physics');
INSERT INTO Students
VALUES (101, 'Abhilasha', 1), (102, 'Ravi', 2), (103, 'Sneha', 3);


SELECT s.student_id, s.name, m.major_name
FROM Students s
JOIN Majors m
ON s.major_id = m.major_id
WHERE s.student_id = 101;




































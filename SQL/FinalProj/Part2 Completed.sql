select "Employee"."LastName" AS EmployeeLastName, Count("OrderDetail") as TotalNumOfOrdersMade, ("OrderDetail"."Quantity" * "OrderDetail"."UnitPrice") - "OrderDetail"."Discount" as TotalAmountSpent
from Employee
Left join "order" on "Employee"."Id"="Order"."EmployeeId"
Left Join OrderDetail on "Order"."Id"= "OrderDetail"."OrderId"
group by Employee.LastName
--So the Quotes in general keep this query from not working if the quotes are removed off any parameter it fails to recognize "OrderDetail" or any parameter missing the quotes this isnt in the leson to know better
-- it can also be written using a SUM with the OrderDetail multiplying the UnitPrice and subtracting Discount as the TotalAmountSpent
--Would have never thought this being a confusing math problem
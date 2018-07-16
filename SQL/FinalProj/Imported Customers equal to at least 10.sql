INSERT INTO TopCustomers (firstName, lastName, Address, City, State, PostalCode, PhoneNumber)
SELECT FirstName, LastName, Address, City, State, PostalCode,Phone
FROM invoices, customers
Where Total >= 10 
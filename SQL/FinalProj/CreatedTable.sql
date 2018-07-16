Create Table TopCustomers (
firstName VARCHAR(50),
lastName VARCHAR(50),
Address VARCHAR(70),
City VARCHAR(50),
State NVARCHAR(2),
PostalCode INTEGER,
PhoneNumber NVARCHAR (24),
CHECK (length(PostalCode) = 5),
FOREIGN KEY(State) REFERENCES states(Abbreviation)

);

Create TABLE ProductList(
  ProductId INTEGER PRIMARY KEY AUTOINCREMENT,
  ProductName VARCHAR(50) NOT NULL,
  Price INTEGER NOT NULL,
  DateAdded date DEFAULT (datetime('now', 'localtime')) NOT NULL,
  EmployeeSupportId INTEGER NOT NULL
); 


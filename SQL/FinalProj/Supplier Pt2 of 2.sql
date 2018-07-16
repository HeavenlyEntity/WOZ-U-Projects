SELECT supplier.CompanyName AS CompanyName, count("Product"."Id") AS AmountOfProducts
From Product
LEFT Join "supplier" ON "Product"."supplierId"= "Supplier"."Id"
group by SupplierId
order by (AmountOfProducts) DESC;
-- Never thought using "" would make such a diiference and intereferance at the same time. Ordering in DESC= Decending Order by most first then to least. And using the Aliases to bear the count function 
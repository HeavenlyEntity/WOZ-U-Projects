/*You were just hired at a company as a data analyst and your company needs some information from the database. They would like to see all tracks that have a UnitPrice over .99 cents. However,
they only want to see the Name and any Id that is attached to that track. Once you have finished that, they would like to see the Invoice Id and Track Id of the invoice items that have a UnitPrice over .99 cents.*/

SELECT Name, TrackId, UnitPrice FROM tracks
WHERE Name IN (SELECT Name From tracks WHERE UnitPrice > 0.99);
SELECT InvoiceId, TrackId, UnitPrice From invoice_items
Where UnitPrice > 0.99;

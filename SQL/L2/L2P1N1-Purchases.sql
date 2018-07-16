/*Part 1
Run the following queries:

Write a query to find the first and last name, customer ID and invoice ID for customers who have purchased an item.
Write a query that finds all playlists with tracks that have a trackId less than 5 and Bytes less than 6,000,000.
Write a query that lists out all information of every track along with the Name of the Genre for each track, even if a genre doesn't exist for that track.
Hint! Give the Name in the genres table a different name for the output.

Write a query that lists out the title of albums and the name of the artists who wrote those albums. We only want to see the albums that were written by artists that start with a vowel.*/

Select FirstName, LastName, CustomerId, InvoiceId from  customers
join invoices USING (CustomerId);
### Invoice Mapper

This is an educational "Legacy" Java app, based on a real world business scenario. 
It has purposefully been created in a messy state in order to provide students
an opportunity to refactor and fix bugs in an existing "Legacy" codebase.  
[![Build Status](https://travis-ci.org/johnkuefler/JavaInvoiceMapper.svg?branch=master)](https://travis-ci.org/johnkuefler/JavaInvoiceMapper)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/fd09faa6fa384f50a4b56af435ff6074)](https://www.codacy.com/app/johnkuefler/JavaInvoiceMapper?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=johnkuefler/JavaInvoiceMapper&amp;utm_campaign=Badge_Grade)


### About the Invoice Mapper

The first purpose of this application is to map invoice in a variety of formats into a standardized sales database. 
The second purpose of this application is to calculate commissions to be paid per sale to salespersons who are also stored in the database. 
The end goal is to have an automatic process, for multiple formats, for multiple clients, for multiple agents with different commission rates per client. 


### Business Entities

* __Client:__ A client is a business that we have salespersons (agents) selling products on behalf of.

* __Invoice:__ An invoice is an excel spreadsheet (csv format) of data sent to us each week that has all the raw data bout the sales our agents made this week.
Along with each invoice, we also get the amount of money we've been paid by a client for the sales our agents have made.

* __Agent:__: An agent is a person who sells products on behalf of a client. Agents are paid commissions per successful sale. Commission rates vary by client.

* __Sale:__: A sale is a record of a product that was sold to a customer. Sales have several statues:
    * Payable: The sale is a good sale, the agent will make a commission on it
    * Non payable: The sale fell through, the agent will make no commission on it
    * Chargeback: The sale was payable at one time, but resulted in a return of some kind, the agent owes us their original commission back. 

* __FormatMap:__ A format map tells us what columns from the invoice spreadsheet we will import into which fields of a sale. The format map also tells us 
What commission rate (e.g. 0.05 - 5%) we will pay on each sale that is brought in.


### Key concepts:
* __Invoice Revenue__: As stated above, each invoice comes with a certain amount of money that we have been paid by the client for thes sales made. 
Our total revenue for that invoice is that amount - the commissions paid to agents for the sales on the invoice.
  
* __Commission Rates__: Commission rates are set per client in the format map. Commission rates are stored as decimals, e.g. 0.05 = 5% commission. See below for some 
commission scenarios:
    * if a $50 sale is payable at 5% commission rate, commission = $2.50
    * if a $50 sale is non payable at 5% commission rate, commission = $0
    * if a $50 sale is charged back at 5% commission rate, commission = -$2.50

### Project Structure
* Root: primarily business logic classes
  * dal: Data access layer classes
  * lib: Core business entities
  * ui: Swing interfaces

### Connecting to database
Before you can run the project, you have to connect to add a config file to be able to connect to the db:
* Create  a "app.properties" file in InvoiceMapper/src/main/resources
* File should have the following format (you will receive the values of these items in class):
```
db.host=xxx
db.name=xxx
db.user=xxx
db.password=xxx
```
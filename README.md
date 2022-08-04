# SPRING-BOOT-CONCEPTS

Trying to Implement :

MODEL VIEW CONTROLLER

VIEW ⇒ Presentation layer deals with jsp pages (not implemented here in this eg.)
CONTROLLER ⇒ handles request and response(Business layer) where we can take the request.
MODEL ⇒ Data to be rendered (Data layer) has data access objects which deal with Database, fetching data from database, storing and maintaining.


So taking above things in mind :
Controller -->  CompanyController ( it will get all requests from Browser)
Model -->  Company (it will be defining the structure of your Table)

CompanyRepository --> will deal with data layer(DB) you don;t have to wite any query as you were doing in JDBC
It will use JpaRepsoisitory

For using the Repository we will write ServiceImpl class which will implement Service interface (which extends CompanyRepository)
in this ServiceImpl we will write what we want from CompanyRepository.

We are not using SQL db rather using inmemory db i.e H2 database for storing data.sql 



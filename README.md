# Portfolio Java Web App 

This is a simple application that consume 2 REST microservices, the first one is a local REST service to connect in with the Portfolio database from Zemoga and the second one a REST service to consume the Twitter API.

# Software prerequisites:

- MySQL 5.6
- MySQL Workbench (to test the credentials provide it and understand the columns in the portfolio table)
- Spring Tools Suite 4
- Postman
- Git

# Technologies used:

- Backend:
  - Spring Boot
  - Spring Data JPA
  - MYSQL Driver
  - Spring Web
  - Twitter4J
  - Apache Tomcat (embbed)
- Frontend:
  - Bootstrap

# Steps to configure, test and run the application

1. Clone the project:                         git clone https://github.com/hecogo/portfolio.git
2. Access to the folder in git bash:          cd portfolio
3. Execute this commands in git bash:
  3.1. Clean and get dependencies from Maven: ./mvnw clean install
  3.2. Execute the tests                      ./mvnw test
  3.3. Run the application:                   ./mvnw spring-boot:run (in case that you receive a Firewall windows notificacion please accept it)
  3.4. Open a new broser window on:           http://localhost:8080
  3.5. If you want you could donwload the Postman collection from the root folder postman_collection, import the json file in your Postman application and test it directly the endpoints.
4. Enjoy :)

# Total time to develop this application
- Read and understand the case:               1 hour
- Definition of the architecture              1 hour
- Develop of 
    - Prtfolio Rest microservices:            2 hours
    - Twitter API Rest microservice:          3 hours
    - Front End design                        1 hour
- Testing and fixing bugs:                    3 hours
- Writing the present Readme instructions:    0.5 hours
- Total time spent                            11.5 hours

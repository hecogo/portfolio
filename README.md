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

1. Clone the project:                         
   - git clone https://github.com/hecogo/portfolio.git
2. Access to the folder in git bash:
   - cd portfolio
3. Execute this commands in git bash:
   - Clean and get dependencies from Maven: 
      - ./mvnw clean install
   - Execute the tests                      
      - ./mvnw test
   - Run the application:
      - ./mvnw spring-boot:run (in case that you receive a Firewall Windows notification please accept it)
4. Open a new browser window on:
  - http://localhost:8080
5. If you want you could donwload the Postman collection from the root folder postman_collection, import the json file in your Postman application and test it directly the endpoints.
6. Enjoy :)

# Total time to develop this application

| Activity                       | Hours |
| :----------------------------  | :----:|
| Read and understand the case   |     1 |
| Definition of the architecture |     1 |
| Develop of:                    |       |
| - Portfolio Rest microservices |   1.5 |
| - Twitter API Rest microservice|     2 |
| - Integration testings         |     1 |
| - Front End design             |     1 |
| Testing and fixing bugs        |     3 |
| Writing README instructions    |   0.5 |
| Total time spent               |    11 |

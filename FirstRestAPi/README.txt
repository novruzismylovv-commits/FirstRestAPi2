FirstRestAPI – Spring Boot REST Project

Project Description
This project is a REST API application developed using Java and Spring Boot.
The application manages Product resources and supports full CRUD operations
(Create, Read, Update, Delete).
The project was created as part of the "Spring Framework Apps – Projects for Everyone" assignment.

--------------------------------------------------

Technologies Used
- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 In-Memory Database
- Lombok
- Swagger (OpenAPI)
- Maven

--------------------------------------------------

Project Structure

product
 ├── api
 │   └── ProductController
 │
 ├── domain
 │   └── Product
 │
 ├── repository
 │   └── ProductRepository
 │
 ├── service
 │   └── ProductService
 │
 ├── support
 │   ├── ProductMapper
 │   ├── ProductExceptionSupplier
 │   └── exception
 │       └── ProductNotFoundException
 │
 └── shared.api.response
     └── ErrorMessageResponse

--------------------------------------------------

Application Configuration (application.properties)

spring.h2.console.enabled=true
spring.h2.console.path=/console
spring.datasource.url=jdbc:h2:mem:testdb
spring.jpa.show-sql=true

--------------------------------------------------

Database
The application uses an H2 in-memory database.
Data is stored only while the application is running.

H2 Console:
http://localhost:8080/console

JDBC URL:
jdbc:h2:mem:testdb

--------------------------------------------------

API Endpoints

1. Create Product
HTTP Method: POST
Endpoint: /api/v1/products

Request Body:
{
  "name": "Laptop"
}

Response:
Status: 201 Created
{
  "id": 1,
  "name": "Laptop"
}

--------------------------------------------------

2. Get Product by ID
HTTP Method: GET
Endpoint: /api/v1/products/{id}

Example:
GET /api/v1/products/1

Response:
Status: 200 OK
{
  "id": 1,
  "name": "Laptop"
}

If product not found:
Status: 404 Not Found
{
  "message": "Product not found"
}

--------------------------------------------------

3. Update Product
HTTP Method: PUT
Endpoint: /api/v1/products/{id}

Request Body:
{
  "name": "Updated Laptop"
}

Response:
Status: 200 OK
{
  "id": 1,
  "name": "Updated Laptop"
}

--------------------------------------------------

4. Get All Products
HTTP Method: GET
Endpoint: /api/v1/products

Response:
Status: 200 OK
[
  {
    "id": 1,
    "name": "Laptop"
  },
  {
    "id": 2,
    "name": "Phone"
  }
]

--------------------------------------------------

5. Delete Product
HTTP Method: DELETE
Endpoint: /api/v1/products/{id}

Response:
Status: 204 No Content

If product does not exist:
Status: 404 Not Found

--------------------------------------------------

Exception Handling
The application uses custom exception handling.
ProductNotFoundException is thrown when a product with a given ID does not exist.
Global exception handling is implemented using @ControllerAdvice to return
proper HTTP status codes and meaningful error messages instead of generic 500 errors.

--------------------------------------------------

Swagger UI
Swagger (OpenAPI) is used to document and test the REST API.

Swagger UI:
http://localhost:8080/swagger-ui/index.html

API Documentation (JSON):
http://localhost:8080/v3/api-docs

--------------------------------------------------

How to Run the Project
1. Clone the repository from GitHub
2. Open the project in IntelliJ IDEA
3. Build the project using Maven
4. Run the main Spring Boot application
5. Test endpoints using Swagger UI, Postman, or a web browser

--------------------------------------------------

Testing
All endpoints were tested using:
- Postman
- Swagger UI

CRUD operations and exception handling were verified.

--------------------------------------------------

Author
GAHRAMAN Huseynov
Computer Engineering Student
Vistula University

--------------------------------------------------

Notes
ProductRepository extends JpaRepository, which provides built-in methods
such as save, findById, findAll, and deleteById.
These methods do not need to be implemented manually because Spring Data JPA
generates them automatically at runtime.

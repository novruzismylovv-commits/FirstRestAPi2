# My First Spring Boot API: Product Management

Hello! This is a project I built to learn the ropes of backend development with Java and Spring Boot. It was created as part of Task 2.A for my studies at Vistula University.

## 📖 What is this project?
The goal was to build a functional REST API that can handle product data. Right now, it's a "simulated" backend—meaning instead of a real database, I'm using a HashMap and a counter to store and manage items in memory. This allowed me to focus on the logic and structure before connecting a heavy database.

## 🏗 How I built it
I followed a layered architecture to keep things organized and professional:

* Controller Layer: I created the ProductController to handle all incoming HTTP requests and send back the right responses.
* Service Layer: This is where the business logic lives. The ProductService processes the data before it gets saved.
* Data Layer: The ProductRepository acts as my temporary database, managing how products are stored and retrieved.
* Mapping & DTOs: I used ProductRequest and ProductResponse classes to make sure the data entering and leaving the API is clean and structured.

## ⚙️ How it works in practice
1. You send a POST request to the endpoint (like adding a new product).
2. The system takes that JSON data and turns it into a Java object.
3. A unique ID is assigned, and the product is saved in my "fake" database.
4. You get a "201 Created" message back with your new product details.

## 🚦 How to test it
You can run this project in IntelliJ IDEA and use a tool like Postman to test the endpoints:

* Method: POST
* URL: http://localhost:8080/api/v1/products
* Body Example: 
  {
    "name": "Wireless Mouse"
  }



---
Developed by me as part of Task 2.A at Akademia Finansów i Biznesu Vistula.

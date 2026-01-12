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

* Method: POST<img width="1867" height="875" alt="Screenshot 2026-01-12 175106" src="https://github.com/user-attachments/assets/079390ec-b5a8-45f8-9c5e-b8364138bb72" />

* URL: http://localhost:8080/api/v1/products
* Body Example: 
  {
    "name": "Wireless Mouse"
  }



---
Developed by me as part of Task 2.A at Akademia Finansów i Biznesu Vistula.<img width="1867" height="875" alt="Screenshot 2026-01-12 175106" src="https://github.com/user-attachments/assets/c2446c6f-58a8-4a27-8798-55e891e01182" />
<img width="1862" height="908" alt="Screenshot 2026-01-12 175019" src="https://github.com/user-attachments/assets/c6cc9f8e-3cb4-4ae2-b723-040b45d5d0af" />
<img width="1909" height="569" alt="Screenshot 2026-01-12 174949" src="https://github.com/user-attachments/assets/80447299-e965-4d54-a609-280af326c643" />
<img width="1596" height="844" alt="Screenshot 2026-01-12 174912" src="https://github.com/user-attachments/assets/be95681f-4c66-4100-989e-19c7e9b66e5c" />
<img width="1877" height="922" alt="Screenshot 2026-01-12 175132" src="https://github.com/user-attachments/assets/509609fa-56af-4be7-ada0-37eb0cdc41a4" />



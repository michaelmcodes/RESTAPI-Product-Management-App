# RESTAPI-Product-Management-App

A **Product Management App** built using **Spring Boot** and **REST API** to manage products. This application allows users to perform CRUD (Create, Read, Update, Delete) operations on product data stored in a MySQL database via RESTful API endpoints. 

## Features

- **RESTful API**: Fully compliant REST API that supports Create, Read, Update, Delete operations.
- **Product Management**: Allows you to add, update, delete, and search for products.
- **MySQL Integration**: Data is persisted in a MySQL database.
- **Spring Boot**: The project uses Spring Boot for simplicity, easy configuration, and rapid development.
- **Spring Data JPA**: Used for interacting with the database.

## Tech Stack

- **Backend**: Java, Spring Boot
- **Database**: MySQL
- **Dependencies**:
  - Spring Boot Starter Web (for building REST APIs)
  - Spring Boot Starter Data JPA (for database interaction)
  - MySQL Connector

## Setup Instructions
Clone the repository:
git clone https://github.com/yourusername/product-management-app.git

Set up MySQL: Create a MySQL database for the app and update the application.properties file with your database information.

Build the project: Navigate to the project directory and run:
mvn clean install
mvn spring-boot:run

Access the API: The application will be running on http://localhost:8080. You can use tools like Postman or cURL to interact with the API.
Ensure that you provide valid JSON data when sending requests.

#### Create a Product
- **URL**: `/api/products`
- **Method**: `POST`
- **Request Body** (JSON):
  {
    "pid": 101,
    "pname": "Laptop",
    "location": "Office",
    "quantity": 5
  }
Response: Returns the created product object.

Can use similar methods as above for all other CRUD methods.


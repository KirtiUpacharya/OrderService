# OrderService Microservice

## Overview
The `OrderService` is a microservice built with Java and Spring Boot, responsible for managing orders in an e-commerce system. It exposes RESTful APIs to create and retrieve orders.

## Prerequisites
- Java 17+
- Maven 3.8+
- PostgreSQL 14+
- Git

## Installation
1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd orderservice
   ```
2. Configure the database in `src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/orders_db
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   ```
3. Build and run the application:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

## API Endpoints
- **POST /orders**
  - Creates a new order.
  - Request Body:
    ```json
    {
      "customerId": 1,
      "totalAmount": 99.99
    }
    ```
  - Response: `201 Created` with order details.

- **GET /orders/{id}**
  - Retrieves an order by ID.
  - Response: `200 OK` with order details or `404 Not Found`.

## Usage
- Use tools like Postman or curl to interact with the API.
- Example:
  ```bash
  curl -X POST http://localhost:8080/orders -H "Content-Type: application/json" -d '{"customerId": 1, "totalAmount": 99.99}'
  ```

## Contributing
Submit pull requests or open issues on the repository.

## License
MIT License 
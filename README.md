# Todo API – Java & Spring Boot Learning Project

A RESTful Todo API built with **Java and Spring Boot** as part of my journey into Java backend development.

This project is a hands-on learning experience where I'm applying Java programming concepts and exploring how Spring Boot is used to build backend applications and REST APIs.

Rather than just learning the theory, I'm building a functional application to understand how different backend components work together, from handling HTTP requests to storing and retrieving data from a relational database.

##  Project Purpose

The primary goal of this project is to strengthen my understanding of Java and gain practical experience with the Spring Boot ecosystem.

Through this project, I'm learning how to:

- Build RESTful APIs using Spring Boot.
- Understand how Java classes, objects, methods, and packages are structured in a real-world application.
- Implement CRUD operations.
- Work with controllers, services, and DTOs.
- Handle HTTP requests and responses.
- Validate incoming request data.
- Connect a Spring Boot application to PostgreSQL.
- Use Spring Data JPA and Hibernate for database operations.
- Manage Java project dependencies using Maven.
- Test API endpoints using Postman.

##  Technologies Used

- **Java** – Primary programming language.
- **Spring Boot** – Backend application framework.
- **Spring Web** – Building REST API endpoints.
- **Spring Data JPA** – Database interaction and persistence.
- **Hibernate** – Object-relational mapping (ORM).
- **PostgreSQL** – Relational database.
- **Maven** – Dependency and project management.
- **Postman** – API testing.
- **Git & GitHub** – Version control and project hosting.

##  Features Implemented

The API currently supports the following Todo operations:

### 1. Create a Todo
Create a new Todo with a title, description, and completion status.

### 2. Get All Todos
Retrieve all Todo records stored in the database.

### 3. Get a Todo by ID
Retrieve an individual Todo using its unique ID.

### 4. Update a Todo
Update an existing Todo's information.

### 5. Delete a Todo
Delete a Todo using its unique ID.

##  API Endpoints

Base URL:

```text
http://localhost:8080/api/todos
```

| HTTP Method | Endpoint | Description |
|---|---|---|
| POST | `/api/todos` | Create a Todo |
| GET | `/api/todos` | Get all Todos |
| GET | `/api/todos/{id}` | Get a Todo by ID |
| PUT | `/api/todos/{id}` | Update a Todo |
| DELETE | `/api/todos/{id}` | Delete a Todo |

##  Project Structure

```text
todo-api/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/example/todoapi/
│       │       ├── controller/
│       │       │   └── TodoController.java
│       │       │
│       │       ├── dto/
│       │       │   ├── TodoRequest.java
│       │       │   └── TodoResponse.java
│       │       │
│       │       ├── service/
│       │       │   └── TodoService.java
│       │       │
│       │       └── TodoApiApplication.java
│       │
│       └── resources/
│           └── application.properties
│
├── .mvn/
├── mvnw
├── mvnw.cmd
├── pom.xml
├── .gitignore
└── README.md
```

##  Running the Project Locally

### Prerequisites

Make sure you have the following installed:

- Java JDK
- PostgreSQL
- Maven (optional, since the project includes Maven Wrapper)
- Git

### 1. Clone the repository

```bash
git clone <https://github.com/Sommy1710/Java-Springboot-Learning-Todo-API-.git>
```

### 2. Navigate into the project

```bash
cd todo-api
```

### 3. Configure the database

Create a PostgreSQL database named:

```text
todo_db
```

Configure your database connection in `application.properties` using your environment variables:

```properties
spring.datasource.url=${DB_URL:jdbc:postgresql://localhost:5434/todo_db}
spring.datasource.username=${DB_USERNAME:postgres}
spring.datasource.password=${DB_PASSWORD}
```

Make sure your database environment variables are configured before starting the application.

### 4. Run the application

On Windows:

```bash
mvnw.cmd spring-boot:run
```

On Linux/macOS/Git Bash:

```bash
./mvnw spring-boot:run
```

The application runs at:

```text
http://localhost:8080
```

## 🧪 Testing the API

All endpoints can be tested using Postman.

For example, to create a Todo, send a POST request to:

```text
POST http://localhost:8080/api/todos
```

With the following JSON body:

```json
{
    "title": "Learn Java",
    "description": "Continue learning Java and Spring Boot",
    "completed": false
}
```

##  Learning Progress

This project represents my practical transition into Java backend development.

So far, I've worked on:

- Setting up the Java development environment and JDK.
- Understanding Java syntax, variables, data types, and control flow.
- Learning methods, arrays, strings, classes, and objects.
- Understanding encapsulation, inheritance, and polymorphism.
- Exploring Java collections, enums, and lambda expressions.
- Setting up a Spring Boot application.
- Understanding Maven and the Maven Wrapper.
- Creating REST controllers and handling HTTP requests.
- Working with DTOs and request validation.
- Implementing CRUD operations.
- Connecting Spring Boot to PostgreSQL.
- Using JPA and Hibernate to persist data.
- Testing API endpoints with Postman.

##  What's Next?

This project is still evolving as I continue learning Java and Spring Boot.

Some areas I intend to explore and implement as I progress include:

- Global exception handling.
- More comprehensive validation and error responses.
- Pagination and sorting.
- Spring Security and authentication.
- Unit and integration testing.
- API documentation with Swagger/OpenAPI.
- Deployment.

##  About This Project

This is a personal learning project built to develop my Java and Spring Boot backend development skills.

The focus is on understanding the fundamentals, writing clean code, learning proper backend architecture, and gradually building more advanced features.

**This is a work in progress, and I'm documenting my journey one feature at a time.**


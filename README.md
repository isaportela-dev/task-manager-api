# ✅ Task Manager API

REST API for task management built with **Java, Spring Boot and Spring Data JPA**.

> 💡 Projeto desenvolvido com foco em aprendizado de desenvolvimento backend com Java, Spring Boot e boas práticas de APIs REST.

---

## 🚀 Features

* Create, read, update and delete tasks (CRUD)
* Get task by ID
* In-memory database using H2
* Interactive API documentation with Swagger (OpenAPI)

---

## 🛠 Tech Stack

* Java 17
* Spring Boot
* Spring Web
* Spring Data JPA
* H2 Database
* Maven
* Swagger (OpenAPI)

---

## 📄 API Documentation

Swagger UI available at:

http://localhost:8080/swagger-ui/index.html

---

## 📁 Project Structure

```
src/main/java/com/isabella/taskmanager
├── controller
│   └── TaskController.java
├── model
│   └── Task.java
├── repository
│   └── TaskRepository.java
└── TaskmanagerApplication.java
```

---

## ▶️ How to Run

In the project folder, run:

```
.\mvnw.cmd spring-boot:run
```

The API will be available at:

```
http://localhost:8080/tasks
```

---

## 📌 Example Request (POST)

```
{
  "title": "Study Spring Boot",
  "description": "Learning enums",
  "status": "PENDING"
}
```

---

## 👩‍💻 Author

**Isabella Portela** 🚀
Backend Developer in training

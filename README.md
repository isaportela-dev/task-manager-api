# ✅ Task Manager API

REST API for task management built with **Java, Spring Boot and Spring Data JPA**.

## 🚀 Features

- Create task
- List all tasks
- Get task by ID
- Update task
- Delete task

## 🛠️ Technologies

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

## 📁 Project Structure


```text
src/main/java/com/isabella/taskmanager
├── controller
│   └── TaskController.java
├── model
│   └── Task.java
├── repository
│   └── TaskRepository.java
└── TaskmanagerApplication.java
```

## ▶️ How to run

In the project folder, run:


```bash
.\mvnw.cmd spring-boot:run
```

The API will be available at:

```text
http://localhost:8080/tasks
```

## 📌 Example request (POST)

```json
{
  "title": "Study Spring Boot",
  "description": "First task created via API",
  "status": "pending"
}
```

## 👩‍💻 Author

**Isabella Portela**  
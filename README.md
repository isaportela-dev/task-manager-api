# ✅ Task Manager API

A full stack task management application built with Java, Spring Boot, and a custom frontend (HTML, CSS, JavaScript).

This project allows users to create, update, and manage tasks in a simple and intuitive interface, demonstrating core backend concepts and API integration.

🔗 Live Demo: https://task-manager-api-three-opal.vercel.app

🔗 API Base URL: https://task-manager-api-production-30cb.up.railway.app/tasks

- Backend development with Java and Spring Boot
- RESTful API design
- Integration between frontend and backend

> 💡 Projeto desenvolvido com foco em aprendizado de desenvolvimento backend com Java, Spring Boot e boas práticas de APIs REST.

---

## 🎨 Frontend

This project also includes a simple frontend built with HTML, CSS, and JavaScript to interact with the API.

### Features:
- Create tasks
- Edit tasks
- Delete tasks
- View tasks with status badges
- Clean and modern UI

📍 Frontend location:
/frontend/index.html

---

## 🚀 Features

- Create, read, update, and delete tasks (CRUD)
- Task status management (PENDING, IN_PROGRESS, COMPLETED)
- RESTful API with Spring Boot
- Integration between frontend and backend
- Clean and responsive UI
- Real-time updates after actions

---

## 🛠 Tech Stack

### Frontend
- HTML5
- CSS3
- JavaScript (Vanilla)

### Backend
- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA

### Database
- H2 Database (in-memory)

### Tools
- Maven
- Swagger (OpenAPI)

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

### 🔧 Backend

Clone the repository:

git clone https://github.com/isaportela-dev/task-manager-api.git
cd task-manager-api

Run the backend:

./mvnw spring-boot:run

The API will be available at:

http://localhost:8080/tasks

---

### 🎨 Frontend

1. Go to the frontend folder:

```bash
cd frontend
```

2. Open the file:

```bash
index.html
```

👉 You can also use **Live Server** in VS Code for a better experience.

---

💡 Make sure the backend is running before opening the frontend.


---

## 📸 Screenshots

### Task Manager UI

![Task Manager UI](./frontend/screenshot.png)

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

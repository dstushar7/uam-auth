# 🔐 User Access Management (UAM) System

## 📘 Overview

This project is a **User Access Management (UAM)** system built with **Java 17** and **Spring Boot**. It is designed to provide a secure and flexible foundation for handling:

- ✅ User Authentication (Login/Register)
- 🔐 Role-Based Authorization
- 🔄 Token-based Session Handling (using JWT)
- 🧑‍💼 Admin/User Management APIs

This is ideal for microservices, SaaS platforms, or internal tools where **user access control** and **security** are key requirements.

---

## ⚙️ Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring Security**
- **Spring Data JPA**
- **JWT (JSON Web Tokens)**
- **Postgres Database**
- **Lombok**
- **Actuator (for health and monitoring endpoints)**

---

## 📝 Features

- User registration and login
- Password encryption with BCrypt
- JWT token generation and validation
- Role-based route protection
- API endpoints for user and role management
- Monitoring endpoints using Spring Boot Actuator

---

## 🛠️ Setup Instructions

### 1. ✅ Requirements

- **JDK 17** or higher
- Maven
- (Optional) Postman or any REST Client for testing

### 2. 📦 Clone the Project

```bash
git clone https://github.com/your-username/uam-auth.git
cd uam-auth
```

### 3. 🔐 Configure Environment Variables

> `application.properties` is intentionally **excluded** from version control via `.gitignore`.

You’ll find an `application-example.properties` file inside the `src/main/resources` folder:

```bash
cp src/main/resources/application-example.properties src/main/resources/application.properties
```

Fill in your DB credentials, secret keys, and other config in the new `application.properties`.

### 4. 🚀 Run the Application

```bash
./mvnw spring-boot:run
```
Or, if using your IDE, just run the `UamAuthApplication` main class.

---

## 📊 Useful Actuator Endpoints

Once running, you can monitor the app using:

| Endpoint           | Description              |
|--------------------|--------------------------|
| `/actuator/health` | Health status            |
| `/actuator/info`   | App information          |
| `/actuator/metrics`| Memory, CPU, stats, etc. |

---

## 📬 API Endpoints (Sample)

| Method | Endpoint         | Description              |
|--------|------------------|--------------------------|
| POST   | `/api/auth/register` | Register a new user     |
| POST   | `/api/auth/login`    | Authenticate and get JWT |
| GET    | `/api/users/me`      | Get current user (JWT required) |
| GET    | `/api/admin/users`   | Admin-only: list users   |

More coming soon...

---

## 📂 Folder Structure (Partial)

```
src/
├── main/
│   ├── java/
│   │   └── com/example/uam/
│   │       ├── controller/
│   │       ├── entity/
│   │       ├── repository/
│   │       ├── security/
│   │       └── service/
│   └── resources/
│       ├── application.properties       ← (gitignored)
│       └── application-example.properties
```

---

## 🙋 Why I'm Building This

As a developer, I wanted to understand and implement my **own custom User Access Management system** to:

- Learn **Spring Security** and **JWT** deeply
- Understand how to architect role-based APIs
- Build something deployable with Docker & Kubernetes
- Lay a foundation for secure, scalable microservices

This project reflects both my learning journey and serves as a reusable base for future production-grade applications.

---

## 📄 License

MIT License – free to use, improve, and share 🚀

---

## 👨‍💻 Author

Developed with ❤️ by Dabobroto Sarkar

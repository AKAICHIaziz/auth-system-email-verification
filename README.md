# 🚀 Authentication System with Spring Security, JWT, and Email Verification

This project is a comprehensive implementation of **Spring Security** and **JSON Web Tokens (JWT)** to provide robust and secure authentication. It includes features like user registration, account verification via email, and stateless API authentication with JWT.

## 📋 Overview

This application showcases best practices for securing web applications using **Spring Security** and **JWT**. It provides users with seamless registration and login functionalities, secure endpoints, and email-based account verification.

### Key Functionalities:
- 📝 **User Registration**: Register new users and store them securely in the database.
- 📧 **Account Verification**: Send verification codes via email for user validation.
- 🔑 **JWT Authentication**: Generate and validate JWT tokens for stateless session management.
- 🔒 **Secure Endpoints**: Protect API endpoints to ensure only authorized access.

## 💡 Features

- **User Authentication**: Register and authenticate users with encrypted credentials.
- **Account Verification**: Validate user accounts with verification codes sent via email.
- **JWT Integration**: Securely generate, issue, and validate JSON Web Tokens.
- **Spring Security**: Handle authentication and authorization with Spring's security framework.
- **Stateless API**: Maintain a stateless backend using token-based authentication.

## ⚙️ Technologies Used

- 🌐 **Spring Boot**: Framework for building Java-based applications.
- 🔐 **Spring Security**: For authentication and authorization.
- 🔑 **JWT (JSON Web Tokens)**: Stateless authentication mechanism.
- 💌 **JavaMail**: For sending email verification codes.
- 💾 **Spring Data JPA**: Simplified database operations.
- 🐘 **PostgreSQL**: Relational database management system.

## 🛠️ How It Works

1. **User Registration**:
   - Users provide their details (e.g., email, password) via the `/auth/signup` endpoint.
   - The system sends a verification code to the user's email.

2. **Account Verification**:
   - Users submit the verification code via the `/auth/verify` endpoint.
   - If valid, the account is marked as verified, enabling login.

3. **User Login**:
   - Users authenticate with their email and password at the `/auth/login` endpoint.
   - On successful login, a JWT token is generated and returned to the user.

4. **Protected Endpoints**:
   - API endpoints are secured, accessible only with a valid JWT token.

## 🚀 Endpoints

| HTTP Method | Endpoint         | Description                           |
|-------------|------------------|---------------------------------------|
| POST        | `/auth/signup`   | Register a new user                   |
| POST        | `/auth/verify`   | Verify user account with a code       |
| POST        | `/auth/login`    | Authenticate user and generate JWT    |
| POST        | `/auth/resend`   | Resend verification code to email     |
| GET         | `/users/me`      | A test for allowed route after login  |


## 🛡️ Security Highlights

- **Password Encryption**: User passwords are securely hashed and stored.
- **JWT Token**: Ensures stateless authentication and user session integrity.
- **Spring Security**: Protects against unauthorized access.

## 🧩 Tech Stack

- **Java 22**: Compatible JDK for building and running the application.
- **Spring Boot 3.3.1**: Framework for building Java-based applications.
- **Spring Security**: For authentication and authorization.
- **JWT (JSON Web Tokens)**: Stateless authentication mechanism.
- **PostgreSQL**: Relational database for storing user data.
- **JavaMail**: Configured for sending email verification codes.
- **Gradle**: Build automation tool used for project management.


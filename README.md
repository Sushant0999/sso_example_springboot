# 🔐 SSO Example with Spring Boot

This project demonstrates how to implement **Single Sign-On (SSO)** using **Spring Boot**. It simulates a secure authentication flow across multiple applications using centralized user authentication.

---

## 🚀 Features

- ✅ Spring Boot backend with SSO logic
- 🧾 Login with email and password
- 📁 Role-based user access (Admin, User)
- 📦 Simple structure for integration into microservices

---

## 🧠 Technologies Used

- Java 17+
- Spring Boot 3.x
- Spring Security
- Maven

---

## 🔑 Google OAuth2 Configuration

Use the following settings in the [Google Cloud Console](https://console.cloud.google.com/):

- **Authorized JavaScript origins:** `{base_url}`
- **Authorized redirect URIs:** `{base_url}/login/oauth2/code/google`

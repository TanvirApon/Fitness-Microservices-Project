# 🏋️‍♂️ Fitness Microservices Project (Spring Boot + React + AI)

This is a full-stack **Microservices-based Fitness Recommendation System** built using **Spring Boot, Spring Cloud, Kafka, MongoDB, PostgreSQL, Eureka, API Gateway, Keycloak**, and an AI Recommendation Engine using **Spring AI + OpenAI/Gemini**.

This project follows a scalable enterprise-level architecture where each service works independently and communicates through REST and Kafka.

---

## 🚀 Project Overview

This project allows users to:

- Create & manage user profiles  
- Track daily activities  
- Generate personalized fitness recommendations using AI  
- Communicate between microservices asynchronously  
- Use a secure OAuth2 / Keycloak login system  
- Access all services through an API Gateway  

The architecture ensures **high scalability, fault tolerance, and loose coupling**.

---

## 🏗️ Microservice Architecture (Current Progress: 4:13 Minutes)

So far, the following items have been prepared:

- Project Root Folder Created  
- Basic planning & architecture decisions  
- User Service structure created  
- Initial Spring Boot setup started  

More services will be added as the course progresses.

---

## 📦 Microservices (Planned)

| Service | Technology | Status |
|--------|------------|--------|
| User Service | Spring Boot + PostgreSQL | 🔄 In Progress |
| Activity Service | Spring Boot + MongoDB | ⏳ Not Started |
| AI Service | Spring Boot + Spring AI | ⏳ Not Started |
| Eureka Server | Spring Cloud | ⏳ Not Started |
| API Gateway | Spring Cloud Gateway | ⏳ Not Started |
| Config Server | Spring Cloud Config | ⏳ Not Started |
| Auth Server | Keycloak (OAuth2) | ⏳ Not Started |
| Frontend | React / Angular | ⏳ Not Started |

---

## 🛠️ Technologies Used

### **Backend**
- Java 17+
- Spring Boot  
- Spring Data JPA  
- Spring Cloud (Eureka, Gateway, Config)  
- Spring AI (OpenAI, Gemini)  
- Kafka (Producer/Consumer)
- MongoDB  
- PostgreSQL  

### **Frontend**
- React / Angular  
- Keycloak Authentication  

---

## 🛠️ Installation & Setup

### 1️⃣ Clone the Repository  
```bash
git clone https://github.com/your-username/fitness-microservices.git
cd fitness-microservices

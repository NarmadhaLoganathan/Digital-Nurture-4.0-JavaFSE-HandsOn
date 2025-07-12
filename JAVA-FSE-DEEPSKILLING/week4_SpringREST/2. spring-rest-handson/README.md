# Spring REST Hands-on Project

This is a hands-on assignment for learning Spring Boot REST API. I have completed this project as part of my Java Full Stack Developer training.

---

## 📚 Task Given

We were asked to do the following:

1. **Explain HTTP Request and Response format**  
2. **Understand RESTful Web Services**  
3. **Create REST APIs in Spring Boot:**
   - GET `/hello` → Return plain text "Hello World!!"
   - GET `/country` → Return a Country object for India
   - GET `/countries` → Return a list of countries
   - GET `/countries/{code}` → Return country based on code (case-insensitive)
   - Handle exception if country not found

4. **Test everything in browser and Postman**
5. **Write JUnit test cases using MockMVC for the `/country` API**

---

## 💻 What I Did

I created a Spring Boot application using Java, Spring Web, and Maven.

- ✅ `/hello` – returns "Hello World!!"
- ✅ `/country` – returns:
```json
{
  "code": "IN",
  "name": "India"
}

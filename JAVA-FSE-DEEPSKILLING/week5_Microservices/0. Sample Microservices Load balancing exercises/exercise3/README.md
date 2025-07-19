# Exercise 3: Resilience Patterns in API Gateway

This Spring Boot 3 project demonstrates how to implement resilience patterns (Circuit Breaker and Timeout) using Spring Cloud Gateway and Resilience4j.

## Features
- Circuit Breaker with fallback
- Timeout handling
- API Gateway routing

## How to Run
1. Make sure port 8080 is free.
2. Run the application using: `mvn spring-boot:run`
3. Access: `http://localhost:8083/get`
4. If failure occurs, fallback: `http://localhost:8083/fallback`

## Dependencies
- Spring Cloud Gateway
- Resilience4j
- Spring Boot 3
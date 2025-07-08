# Country Management Application

This is a Spring Boot project that demonstrates how to use **Spring Data JPA** with **Hibernate** and **H2 in-memory database** to perform basic CRUD operations on a `Country` entity.

## Features

- Add a country
- Update a country
- Delete a country
- Get country by code
- Search countries by name
- View H2 database console

## Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database (in-memory)
- Maven

## API Endpoints

| Method | Endpoint                  | Description                |
|--------|---------------------------|----------------------------|
| GET    | `/countries/{code}`       | Get country by code        |
| POST   | `/countries`              | Add a new country          |
| PUT    | `/countries`              | Update existing country    |
| DELETE | `/countries/{code}`       | Delete country by code     |
| GET    | `/countries/search?name=` | Search countries by name   |

## How to Run

### Prerequisites
- JDK 17 or later
- Maven installed

### Steps
1. Clone or download the project.
2. Navigate to the project folder:
   ```bash
   cd path-to-project-folder

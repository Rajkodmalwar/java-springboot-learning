# Java Spring Boot Learning

A hands-on Spring Boot learning project documenting the journey from basics to advanced concepts.

## Project Overview

This repository contains my Spring Boot learning progress, starting with fundamental concepts and gradually building more complex applications.

## Day 1: Initial Setup & Learning

### What Was Done
- ✅ Created a Spring Boot 4.0.6 application with Maven
- ✅ Set up project structure with proper package organization (`com.springlearning.firstproject`)
- ✅ Configured Java 17 as the target version
- ✅ Added Spring Boot Web MVC dependency for REST API support
- ✅ Added OpenCSV library (v5.12.0) for CSV file handling
- ✅ Built and compiled the application successfully

### What Was Learned
- Spring Boot project initialization and Maven configuration basics
- REST controller creation using `@RestController` and `@GetMapping` annotations
- Package naming conventions and Maven project structure
- Spring Boot starter dependencies and their purpose
- Application compilation and build process

### Current Features
- Basic REST API endpoint: `GET /abc` returns "hello"
- Project structure ready for further development
- Foundation set for implementing more complex features

## Project Structure
```
firstproject/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/springlearning/firstproject/
│   │   │       ├── FirstprojectApplication.java
│   │   │       └── myClass.java (REST Controller)
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
│           └── com/springlearning/firstproject/
│               └── FirstprojectApplicationTests.java
├── pom.xml
└── README.md
```

## Technologies Used
- **Framework**: Spring Boot 4.0.6
- **Build Tool**: Maven
- **Java Version**: 17
- **Web Framework**: Spring MVC
- **CSV Library**: OpenCSV 5.12.0

## Getting Started

### Prerequisites
- Java 17 or higher
- Maven 3.6+

### Building the Project
```bash
mvn clean install
```

### Running the Application
```bash
mvn spring-boot:run
```

### Testing the API
Once the application is running, test the endpoint:
```bash
curl http://localhost:8080/abc
```
Expected response: `hello`

## Future Enhancements
- [ ] Add more REST endpoints
- [ ] Implement request/response handling
- [ ] Create service layer and business logic
- [ ] Add database connectivity
- [ ] Implement error handling
- [ ] Add request validation
- [ ] Create comprehensive API documentation

## Learning Progress
- **Day 1**: Project setup and basic REST controller

---

**Author**: Rajkodmalwar  
**Started**: June 9, 2026

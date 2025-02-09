# E-Commerce Microservice

## Overview

This project is an e-commerce platform designed using a microservices architecture. It comprises several services, each responsible for a specific domain within the application. The services communicate with each other to provide a seamless shopping experience.

## Microservices

The application consists of the following microservices:

- **API Gateway**: Acts as the entry point for client requests, routing them to the appropriate services.
- **Discovery Server**: Manages service registration and discovery, allowing services to find and communicate with each other.
- **Inventory Microservice**: Manages product inventory levels.
- **Notification Service**: Handles sending notifications to users.
- **Order Microservice**: Manages customer orders, including creation and tracking.
- **Product Microservice**: Handles product information and catalog management.

## Technologies Used

- **Java**: Primary programming language for the microservices.
- **Spring Boot**: Framework for building the microservices.
- **Spring Cloud**: Provides tools for building and deploying microservices, including service discovery and configuration management.
- **Docker**: Used for containerizing the services to ensure consistency across different environments.
- **Docker Compose**: Facilitates the orchestration of multiple Docker containers, allowing for easy management of the microservices.

## Prerequisites

Before running the application, ensure you have the following installed:

- **Java Development Kit (JDK) 17** or higher
- **Docker** and **Docker Compose**

## Getting Started

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/BIKIRANMAJI/E-COMMERCE-MICROSERVICE.git
   cd E-COMMERCE-MICROSERVICE

2. **Build the Services**:

   ```bash
   ./mvnw clean install

3. **Start the Application**:

   ```bash
   docker-compose up --build
  
  This command will build and start all the microservices along with their dependencies.

## Contributing

Contributions are welcome! If you have suggestions for improvements or new features, feel free to open an issue or submit a pull request.

## License

This project is licensed under the MIT License.

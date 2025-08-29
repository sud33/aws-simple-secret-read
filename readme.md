# AWS Simple Secret Read

A minimal Spring Boot application that demonstrates reading secrets from AWS.

## Prerequisites
- Java 11+ (JDK)
- Maven or the Maven wrapper

## Build & Run
- Build: ./mvnw -DskipTests package
- Run: ./mvnw spring-boot:run

## Endpoints
- See [`TestController.java`](src/main/java/sud/prac/simple_hello_world/TestController.java:1) for exposed endpoints.

## Project Structure
- [`pom.xml`](pom.xml:1)
- [`src/main/java/sud/prac/simple_hello_world/SimpleHelloWorldApplication.java`](src/main/java/sud/prac/simple_hello_world/SimpleHelloWorldApplication.java:1)
- [`src/main/java/sud/prac/simple_hello_world/TestController.java`](src/main/java/sud/prac/simple_hello_world/TestController.java:1)
- [`src/main/java/sud/prac/simple_hello_world/SecretService.java`](src/main/java/sud/prac/simple_hello_world/SecretService.java:1)
- [`src/main/resources/application.properties`](src/main/resources/application.properties:1)
- [`src/test/java/sud/prac/simple_hello_world/SimpleHelloWorldApplicationTests.java`](src/test/java/sud/prac/simple_hello_world/SimpleHelloWorldApplicationTests.java:1)

## License
MIT
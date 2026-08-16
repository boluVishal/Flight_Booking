# Flight Booking — User Registration Service

A Spring Boot project that handles user registration for a flight booking system. Built as a learning exercise around Spring Boot, JPA, and input validation with regex.

## What it does

The app runs as a CLI (`CommandLineRunner`) — it prompts for user details, validates them, and persists the user via JPA if everything passes. Validations are done with regex patterns for user ID, name, city, email, and phone number.

## Validation rules

| Field | Rule |
|---|---|
| User ID | Alphanumeric, 4–15 characters |
| Name | Alphanumeric, 4–15 characters |
| City | Alphanumeric, 4–15 characters |
| Email | Standard email format |
| Phone | 10 digits |

Password validation exists in the code but is currently commented out.

## Running it

You need Java 8+, Maven, and a database configured in `application.properties`.

```bash
./mvnw spring-boot:run
```

The app will prompt you to enter user details via stdin. If validation passes, the user gets saved and a success message is printed. If something's wrong, it prints the relevant error message from `configuration.properties`.

## Project structure

```
src/main/java/com/bolu/rs/FlightBooking_SpringBoot/
  FlightBookingSpringBootApplication.java  — entry point + CLI runner
  entity/UserEntity.java                   — JPA entity
  model/User.java                          — input model
  service/RegistrationService.java         — validation + save logic
  repository/UserRepository.java           — Spring Data JPA repo
  exception/                               — custom exceptions per field
```

## Config

- `application.properties` — DB connection settings
- `configuration.properties` — human-readable messages for success/error codes

---
applyTo: "**"
---
# Full-Stack Development Guidelines

## Table of Contents
1. [Architecture Overview](#architecture-overview)
2. [Frontend (Angular)](#frontend-angular)
3. [Backend (Spring)](#backend-spring)
4. [Testing Strategy](#testing-strategy)
5. [Best Practices](#best-practices)

## Architecture Overview

### Clean Architecture
- Follow the dependency rule: dependencies only point inward
- Layers:
  - Core/Domain (entities, use cases)
  - Application (services, ports)
  - Infrastructure (adapters, frameworks)
  - Presentation (UI, API controllers)

### SOLID Principles
1. **Single Responsibility**: Each class should have only one reason to change
2. **Open/Closed**: Open for extension, closed for modification
3. **Liskov Substitution**: Subtypes must be substitutable for their base types
4. **Interface Segregation**: Many specific interfaces over one general interface
5. **Dependency Inversion**: Depend on abstractions, not concretions

## Frontend (Angular)

### Project Structure
```
src/
├── app/
│   ├── core/        # Singleton services, guards, interceptors
│   ├── features/    # Feature modules
│   ├── shared/      # Shared components, pipes, directives
│   └── utils/       # Helper functions, constants
```

### Best Practices
1. Use feature modules for scalability
2. Implement smart/dumb component pattern
3. Follow Angular style guide naming conventions
4. Use TypeScript strict mode
5. Implement proper error handling
6. Use strongly typed interfaces

### Component Guidelines
- Keep components focused and small
- Use OnPush change detection strategy
- Implement lifecycle hooks properly
- Use async pipe for observables
- Proper error handling in components

## Backend (Spring)

### Project Structure
```
src/
├── main/
│   ├── java/
│   │   ├── domain/      # Business logic and entities
│   │   ├── application/ # Use cases and ports
│   │   ├── infrastructure/ # Adapters and configurations
│   │   └── presentation/   # Controllers and DTOs
│   └── resources/
```

### Best Practices
1. Use Spring Boot starter dependencies
2. Implement proper exception handling
3. Use constructor injection
4. Follow RESTful API design principles
5. Implement proper validation
6. Use DTOs for data transfer

### Code Guidelines
- Keep controllers thin
- Use service layer for business logic
- Implement proper logging
- Use meaningful exception messages
- Follow Java naming conventions

## Testing Strategy

### Frontend Testing
1. **Unit Tests**
   - Test components in isolation
   - Test services and pipes
   - Use TestBed properly
   - Mock dependencies

2. **Integration Tests**
   - Test component interaction
   - Test routing
   - Test HTTP interactions

3. **E2E Tests**
   - Use Cypress or Protractor
   - Test critical user paths
   - Test error scenarios

### Backend Testing
1. **Unit Tests**
   - Test business logic
   - Mock dependencies
   - Use JUnit 5 features
   - Follow AAA pattern (Arrange-Act-Assert)

2. **Integration Tests**
   - Test repository layer
   - Test service integration
   - Use TestContainers for databases

3. **API Tests**
   - Use REST Assured
   - Test all endpoints
   - Test error scenarios


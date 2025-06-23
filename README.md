# Personal Website & Portfolio

This project is a full-stack personal website and digital portfolio, built with Angular (frontend) and Spring Boot (backend), managed with Nx. It is designed to be responsive, maintainable, and easily extensible.

## Features

- **Responsive Design:** Works on all devices (desktop, tablet, mobile).
- **Roles & Authentication:**  
  - Owner: Can log in, manage content, access admin area.  
  - Visitor: Can browse public content without logging in.
- **Blog:**  
  - Owner can create, edit, schedule, and delete posts.
  - Posts support HTML/Markdown, images, and videos.
  - Posts can be filtered by category and scheduled for future publication.
  - Visitors can read and filter posts.
- **Portfolio:**  
  - Showcases technologies, experience, projects, and personal description.
  - Owner can update portfolio content.
- **Contact:**  
  - Visitors can contact the owner via a form.
  - Anti-spam measures (e.g., CAPTCHA) included.
- **SEO-Friendly:** Optimized for search engines.
- **Maintainable Codebase:** Follows clean code, SOLID, and clean architecture principles.

## Architecture

- **Frontend:** Angular, using feature modules, strict typing, and best practices.
- **Backend:** Spring Boot, RESTful APIs, DTOs, and proper validation.
- **Monorepo:** Managed with Nx for unified tooling and scalable development.

## Development

### Prerequisites

- Node.js, npm
- Java 22+
- Maven (wrapper included)
- Nx CLI (`npm install -g nx`)

### Scripts

- `npm run start:frontend` — Start Angular frontend (http://localhost:4200)
- `npm run start:backend` — Start Spring Boot backend (http://localhost:8080)
- `npm start` — Start both frontend and backend concurrently

### Testing

- **Frontend:** Jest for unit/integration tests, Playwright for E2E
- **Backend:** JUnit 5, TestContainers for integration

### Linting & Formatting

- ESLint and Prettier are configured for code quality and consistency.

## Project Structure

```
apps/
  frontend/      # Angular application
  backend/       # Spring Boot application
  shared-ui/     # Angular UI library
.github/instructions/ # Coding and workflow guidelines
documentation/   # User stories and business requirements
```

## Guidelines

- See `.github/instructions/fullstack.instructions.md` and `.github/instructions/copilot-instructions.md` for coding standards, architecture, and workflow.
- Follow best practices for security, performance, and documentation.

## License

MIT


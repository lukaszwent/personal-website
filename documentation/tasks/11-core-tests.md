# 11. Core Tests

Goal: Cover critical paths with unit and integration tests.

Backend Scope:
- Unit tests for services: PostQueryService, PostCommandService, PortfolioService, Auth (token provider), CategoryService.
- Integration tests for controllers (WebMvcTest or @SpringBootTest slices) of main endpoints.
- Scheduler publication tests (time manipulation).

Frontend Scope:
- Unit tests for components: post list, post detail, login form, contact form.
- Tests for services (PostsService, AuthService) with HttpTestingController.
- Basic e2e test (frontend-e2e) for login + create post.

Backend Steps:
1. Add dependencies (JUnit 5, Mockito, Testcontainers – optional later).
2. Write unit tests.
3. Write integration tests.

Frontend Steps:
1. Angular test specs for components.
2. E2E scenario: login -> create post -> see post on public listing (after publish).

Acceptance Criteria:
- >70% line coverage for critical packages (Post*, Auth*, Portfolio*).
- Test pipeline passes locally.

Dependencies: Requires previous functionalities.

Estimated Time: 6h.

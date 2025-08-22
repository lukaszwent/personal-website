# 02. Authentication and Authorization Foundation

Goal: Prepare the skeleton for Owner login (without full admin UI) + protect endpoints.

Scope:
- Backend: Spring Security configuration, Owner entity (or user config in properties initially), JWT (generation, validation), endpoint `/api/auth/login`.
- Backend: roles `OWNER`, `VISITOR` (VISITOR implicit, no login).
- Frontend: `AuthService`, token storage (localStorage), interceptor for Authorization header.
- Frontend: simple login form (route `/login`).

Backend Steps:
1. Add Spring Security + JWT dependency (jjwt / spring-boot-starter-oauth2-resource-server).
2. Create packages: `presentation.auth`, `application.auth`, `domain.user`, `infrastructure.security`.
3. Implement DTOs LoginRequest, LoginResponse.
4. Implement `AuthController` with `/api/auth/login`.
5. Security configuration: allow public GET blog/portfolio/contact, rest requires OWNER.
6. Implement `JwtTokenProvider`.
7. (Initially) Hardcoded Owner credentials in config or InMemoryUserDetails.

Frontend Steps:
1. Create feature module `auth` (or temporarily in core) + route `/login`.
2. Form (Reactive Forms) with basic validation.
3. `AuthService.login` POST `/api/auth/login` -> store token.
4. HTTP interceptor adding `Authorization: Bearer <token>`.
5. Guard `ownerGuard` blocking admin paths.

Acceptance Criteria:
- Correct token issued for valid credentials.
- Protected endpoints rejected without token.
- Frontend can login and token is used in subsequent requests.

Dependencies: Requires task 01. Unlocks admin panel tasks.

Estimated Time: 4h.

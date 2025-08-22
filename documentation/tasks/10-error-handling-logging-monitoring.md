# 10. Error Handling, Logging, Monitoring

Goal: Centralize exception handling, introduce consistent messages and basic monitoring.

Backend Scope:
- Global ExceptionHandler (REST) mapping domain exceptions to HTTP codes.
- Error JSON structure: timestamp, path, code, message, details.
- Logger (SLF4J) + sensible levels.
- (Optional) Integration with monitoring tool (e.g. Spring Boot Actuator + health, metrics endpoints).

Frontend Scope:
- HTTP interceptor catching errors and mapping to user-friendly messages.
- Service `NotificationService` (toast/snackbar).
- Error pages 404 / 500.

Backend Steps:
1. Implement `RestExceptionHandler`.
2. Add domain exceptions (NotFoundException, ValidationException, UnauthorizedOperationException).
3. Configure Actuator (health, info, metrics) - selected endpoints public vs secured.

Frontend Steps:
1. Error interceptor.
2. Service + toast component.
3. 404, 500 views + routing fallback.

Acceptance Criteria:
- Errors return consistent format.
- Frontend shows user-friendly message for 4xx/5xx.
- /actuator/health available (or secured per decision).

Dependencies: Requires earlier endpoints from previous tasks.

Estimated Time: 4h.

# 08. Contact Form + Anti-spam

Goal: Allow visitors to send a message and protect against spam.

Backend Scope:
- Endpoint POST `/api/contact` accepting: name, email, message.
- Validation (email format, lengths, XSS sanitize).
- Anti-spam: simple mechanism (e.g. honeypot field + per-IP rate limit) initially.
- (Optional) Integration with external mail service or persistence in `contact_message` table.

Frontend Scope:
- Page `/contact` with form (Reactive Forms) + validations + success/error UI.
- Honeypot hidden field implementation.

Backend Steps:
1. DTO ContactRequest + validations.
2. Entity `ContactMessage` (optional) + repo.
3. Service `ContactService` (persist + (optional) email send placeholder).
4. Controller `ContactController`.
5. Rate limiting filter (simple in-memory counter per IP).

Frontend Steps:
1. Form + validators.
2. Service `ContactService` (sendMessage).
3. Result handling (toast / message).

Acceptance Criteria:
- Message can be sent; invisible honeypot does not impact UX.
- Too many requests from one IP -> rejection (HTTP 429).

Dependencies: Independent of blog CRUD (after 02). Can run in parallel with 07.

Estimated Time: 5h.

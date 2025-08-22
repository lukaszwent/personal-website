# 05. Media Upload and Embeds

Goal: Enable adding images/video to post content.

Backend Scope:
- OWNER endpoint: POST `/api/admin/media` (multipart) -> returns URL.
- MIME type validation (jpg, png, webp, limited gif), max size.
- Local file storage (initial) in `uploads/` directory or memory, unique name generation.
- Service `MediaStorageService` (port) + local adapter.

Frontend Scope:
- In post editor ability to insert image: upload -> received URL inserted into markdown.
- Image preview.

Backend Steps:
1. Configure upload directory.
2. Controller `MediaController` (OWNER).
3. Validate and store file, return DTO with public URL.

Frontend Steps:
1. "Add image" button in post form.
2. Service `MediaService.upload(file)`.
3. Insert link into content (e.g. `![](url)`).

Acceptance Criteria:
- Image can be uploaded and displayed in post content.
- Validation rejects invalid files.

Dependencies: Requires task 04.

Estimated Time: 5h.

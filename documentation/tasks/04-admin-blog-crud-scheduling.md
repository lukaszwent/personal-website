# 04. Blog Admin Panel: CRUD + Scheduling

Goal: Allow the Owner to manage posts (create, edit, delete, schedule publication).

Backend Scope:
- OWNER endpoints: POST `/api/admin/posts`, PUT `/api/admin/posts/{id}`, DELETE `/api/admin/posts/{id}`, POST `/api/admin/posts/{id}/schedule`.
- Data validation (title, unique slug, content, schedule time > now).
- Logic for immediate publish vs scheduled publish.
- Background scheduler (Spring @Scheduled) checking SCHEDULED posts for publication.

Frontend Scope (admin):
- Feature module `admin` + submodule `admin-blog`.
- Post list component (with status filters) + create/edit form.
- Ability to set publish date/time (scheduler) + "Publish Now" button.
- Markdown editor (initially simple textarea; future integration e.g. ngx-markdown).
- Form validations.

Backend Steps:
1. DTOs: CreatePostRequest, UpdatePostRequest, PostAdminResponse.
2. Service `PostCommandService` (create/update/delete/schedule/publishNow).
3. Controller `PostAdminController`.
4. Scheduler publishing posts when `scheduledAt <= now`.

Frontend Steps:
1. Routing `/admin/posts` (list) + `/admin/posts/new` + `/admin/posts/:id`.
2. Service `AdminPostsService` (CRUD + schedule).
3. Form (Reactive Forms) + validations.
4. List component with actions (edit/delete/schedule/publish-now).

Acceptance Criteria:
- Owner can create a post (DRAFT), schedule it, edit it, publish immediately, delete it.
- Post transitions automatically to PUBLISHED at the scheduled time.
- Frontend refreshes the list after operations.

Dependencies: Requires task 03. Unlocks media and categories tasks.

Estimated Time: 8h.

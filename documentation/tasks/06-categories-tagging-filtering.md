# 06. Categories / Tagging / Filtering

Goal: Enable categorization of posts and filtering by categories.

Backend Scope:
- Entity `Category` (id, name, slug, createdAt).
- Relationship Post - Categories (many-to-many or join table).
- OWNER endpoints: CRUD categories `/api/admin/categories`.
- Extend public GET `/api/posts?category=slug`.

Frontend Scope:
- Admin: manage categories (list, add, delete, edit).
- Public: category filter (list of categories + selection) on blog page.

Backend Steps:
1. Entity + repo + migration.
2. Service `CategoryService`.
3. Admin controller + extension to PostPublicController.

Frontend Steps:
1. Admin: category component.
2. Public: category filters component integrating with `PostsService` (query param).

Acceptance Criteria:
- Category can be added and assigned to a post.
- Public listing accepts slug filter and returns narrowed data.

Dependencies: Requires task 04.

Estimated Time: 4h.

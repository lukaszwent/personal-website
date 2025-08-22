# 03. Blog Model - Basics

Goal: Create a minimal blog model and public read endpoints.

Backend Scope:
- Entities/domain: `Post` (id, title, slug, content, status: DRAFT|SCHEDULED|PUBLISHED, scheduledAt, publishedAt, createdAt, updatedAt, categories (list), mediaRefs (list of URL)).
- Repository (Spring Data / port + adapter) + application service for listing and detail retrieval.
- Public endpoints (GET): `/api/posts?category=&page=`, `/api/posts/{slug}`.
- Default sorting: newest first (publishedAt DESC, fallback createdAt).

Frontend Scope (public):
- TypeScript interfaces `PostSummary`, `PostDetail`.
- Service `PostsService` (fetch list + single post).
- Simple post list component (title + date + categories) + routing `/blog`.
- Post detail component `/blog/:slug` rendering HTML/Markdown (placeholder now with innerHTML, later sanitizer).

Backend Steps:
1. Add entity + migration (optional initially in-memory DB: H2).
2. Add mapper Post -> DTO (summary/detail DTO).
3. Application service `PostQueryService`.
4. Controller `PostPublicController`.

Frontend Steps:
1. Add feature module `blog` with routing (list, detail).
2. `PostsService` with methods `getPosts`, `getPostBySlug`.
3. Components: `PostListComponent`, `PostDetailComponent`.

Acceptance Criteria:
- GET list returns paginated list sorted descending by publication.
- GET detail returns correct data for existing slug.
- Frontend displays list and allows navigation to detail.

Dependencies: Requires tasks 01-02. Unlocks editing/scheduling task.

Estimated Time: 6h.

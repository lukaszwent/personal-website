# 07. Portfolio Section (public + admin)

Goal: Display and edit owner information (technologies, experience, projects, description).

Backend Scope:
- Entities/structures: `Portfolio` (singleton) or set of entities: `Technology`, `Experience`, `Project`, `ProfileInfo`.
- Initial simplification: one table `portfolio_content` with JSON column (technologies[], experience[], projects[], about).
- Public endpoint GET `/api/portfolio`.
- OWNER endpoint PUT `/api/admin/portfolio` for full structure update.

Frontend Scope:
- Public: page `/portfolio` rendering sections (about, technologies, experience timeline, projects grid).
- Admin: edit form (single large form with dynamic list fields).

Backend Steps:
1. Entity + repo + DTO mapper.
2. Service `PortfolioService` (load/update).
3. Public + admin controllers.

Frontend Steps:
1. `PortfolioService` (get/update).
2. Public component `PortfolioPage`.
3. Admin component `PortfolioEditor`.

Acceptance Criteria:
- Public endpoint returns JSON structure.
- Admin can update content and change is visible publicly.

Dependencies: Requires task 02 (auth) and 01 (architecture). Can run in parallel after 04.

Estimated Time: 6h.

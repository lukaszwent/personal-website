# 12. Documentation and CI Configuration

Goal: Organize project documentation and basic CI pipeline.

Scope:
- Extend README (run instructions, architecture, technologies, layer structure, auth flow).
- Add `ARCHITECTURE.md` and `API.md` (main endpoint descriptions) + links to tasks.
- Configure GitHub Actions (build backend, test backend, build frontend, test frontend, e2e optional nightly).
- Status badge in README.

Steps:
1. Create documentation files.
2. Configure workflow `.github/workflows/ci.yml`.
3. Add cache for maven + node_modules.
4. Add step running e2e tests conditionally.

Acceptance Criteria:
- Pipeline passes for main branch.
- Documentation is up to date and complete.

Dependencies: Final task after main features.

Estimated Time: 4h.

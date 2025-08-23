# 01. Monorepo and Architecture Initialization

Goal: Provide the base Nx structure (Angular frontend + Spring backend) aligned with Clean Architecture.

Scope:
- Verify existing Nx structure (already present) and refine backend domain packages.
- Add basic backend layers: `domain`, `application`, `infrastructure`, `monolith`.
- Establish naming conventions and commit style.
- Configure basic npm scripts (lint, test, format, affected, build).

Steps:
1. Create backend packages/layers (Java packages) if missing: `io.github.<project>.domain`, `application`, `infrastructure`, `monolith`.
2. Add `CONTRIBUTING.md` with brief guidelines (commit convention, code style).
3. Configure formatting (Prettier/ESLint) and `spotless`/`checkstyle` (optional) for backend.
4. Verify/augment `nx.json` and `project.json` to have targets: build, test, lint.
5. Add README section describing architecture.

Acceptance Criteria:
- Backend layers exist and are empty or have placeholder classes.
- Commands `npm run lint`, `npm run test` execute without errors.
- Architecture description present in README.

Dependencies: Blocks all subsequent backend tasks.

Estimated Time: 2h.

# 09. SEO and Accessibility

Goal: Improve search engine visibility and accessibility for users.

Frontend Scope:
- Dynamic meta tags (title, description, og: tags) per route (blog post, portfolio, home).
- Add `sitemap.xml` (statically generated or backend endpoint).
- Structured data (JSON-LD) for blog articles.
- Lighthouse audit and implement improvements (aria-label, contrast, focus states).

Backend Scope:
- Endpoint `/sitemap.xml` generating list of public URLs (published posts, portfolio, contact, blog listing).
- Security headers (Security config) + GZIP.

Frontend Steps:
1. SEO service (methods setTitle, setDescription, setArticleSchema).
2. Integrate in routed components.
3. Add link rel=canonical.
4. Lighthouse test and accessibility fixes.

Backend Steps:
1. Service `SitemapService` generating XML.
2. Controller `SitemapController`.
3. Configure headers (basic Content-Security-Policy, X-Frame-Options, etc.).

Acceptance Criteria:
- Available sitemap.xml returning valid XML.
- Blog post has correct meta and JSON-LD.
- Lighthouse score (Performance > 85, Accessibility > 95, SEO > 90).

Dependencies: Requires blog publication (03+) and portfolio (07).

Estimated Time: 5h.

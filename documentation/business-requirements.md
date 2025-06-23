# Business Requirements

## General Information

- This project is a personal website and digital portfolio.
- The site does not need to display my name and surname explicitly.
- The website should be responsive and accessible on all devices.
- The architecture should allow for easy future expansion (e.g., adding new sections or features).

## Roles & Authentication

- There are two roles: **Owner** and **Visitor**.
- Only the **Owner** can log in to the admin area.
- Only the **Owner** can create, edit, schedule, or delete blog posts and manage portfolio content.
- **Visitors** can only view public content (blog, portfolio, contact form).
- Authentication is required for all content management actions.
- Secure authentication (e.g., JWT, OAuth, or similar) must be implemented for the Owner.

## Blog Functionality

- Ability for the Owner to create, edit, schedule, and delete blog entries.
- Posts are displayed starting from the newest.
- Posts can be filtered by categories to adjust the number of results displayed.
- Posts can be scheduled to be published at a specific time.
- Posts support structured content (HTML/Markdown).
- Ability to add images and videos within the post content.
- Only the Owner can manage posts; Visitors can only read and filter them.

## Portfolio Section

- A section dedicated to showcasing information about the Owner.
- Includes technologies known, experience, projects, and a personal description.
- Functions as an online CV.
- Only the Owner can update portfolio content.

## Contact Section

- A section for contacting the Owner via a form.
- Form submissions are sent to the Owner's email or stored securely.
- Anti-spam measures (e.g., CAPTCHA) should be implemented.

## Additional Requirements

- The site should be SEO-friendly.
- All user input must be validated and sanitized.
- Error handling and user feedback should be clear and user-friendly.
- The codebase should be maintainable and well-documented.

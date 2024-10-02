# Koonetto Blog Experiment - Feature Overview

## Authors
- **Ariq Khoiri**

## Introduction
Koonetto Blog Experiment is a simple blogging platform designed for feature experimentation. The primary focus is on fast content delivery and minimizing costs. This README outlines the functional, non-functional, and business requirements for the project.

---

## Requirements

### Functional Requirements
The system should provide the following functionalities:

1. **User Roles**:
    - **Admin**:
        - Can create new blog posts.
        - Can edit and delete existing posts.
        - Can publish any post
        - Can comment on any post.
    - **User**:
        - Can view all blog posts.
        - Can comment on any post.

2. **Post Management**:
    - Admins should be able to create, edit, and delete blog posts.
    - Posts should be viewable by both users and admins.

3. **Commenting Features**:
    - Both users and admins can comment on blog posts.

---

### Non-Functional Requirements
The system must meet the following technical performance and design constraints:

1. **Search Engine Friendly URL**:
    - URLs should be descriptive and SEO-friendly, using post title slugs (e.g., `/blog/my-first-post`).

2. **Response Time**:
    - API response time should be less than 1 second for most requests, excluding image processing.

3. **Scalability**:
    - The system must handle at least 10 requests per minute without performance degradation.

4. **Image Loading**:
    - Images must load within 1 second to ensure a smooth user experience.

5. **Consistency over Availability**:
    - The system must prioritize data consistency, ensuring no partial or incorrect data is displayed, even if this sacrifices some availability.

---

### Business Requirements
The system should align with the following business goals:

1. **Fast Delivery**:
    - Blog content must be quickly published and available to users soon after creation or updates.

2. **Minimal Cost**:
    - The platform should minimize operational costs through efficient resource usage, while maintaining high performance.

---

## Technology Stack 
To implement the Koonetto Blog Experiment, the following technology stack is recommended:

- **Language**: Java
- **Backend**: Spring Boot
- **Frontend**: React.js
- **Database**: PostgreSQL, Redis
- **Hosting**: AWS or a similar cloud platform


Spring Boot Framework –  REST API.
REST Controller (ItemController) – Handles HTTP requests related to lab tasks.
Endpoints:
GET /api/laba – Returns a list of completed lab tasks.
POST /api/laba?item={lab_name} – Adds a new lab task to the list and returns a confirmation message.
Data Handling:
Uses an in-memory ArrayList to store lab tasks dynamically.

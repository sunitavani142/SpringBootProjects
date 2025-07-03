Spring Boot Project: Task Management System
A basic task management web application built using Spring Boot, providing full CRUD functionality for tasks with Spring Security for authentication 

 1. Features
✅ Create, Read, Update, Delete (CRUD) operations for tasks

🔐 Basic authentication using Spring Security (username/password)

🗂️ H2 database support

📡 RESTful APIs

2. Authentication
Basic HTTP Authentication is enabled. Add the following to your request headers:
Username: radha
Password: welcome

3. Run the Application

mvn spring-boot:run

4. Access Endpoints
H2 Console (if enabled): http://localhost:8080/h2-console
API Base URL: http://localhost:8080/api/tasks

5. API Endpoints
   
Method	  Endpoint	        Description

POST	    /api/tasks	        Add a new task

GET	      /api/tasks	        Get all tasks

GET      	/api/tasks/{id}	    Get task by ID

PUT	      /api/tasks/{id}	    Update task

DELETE	  /api/tasks/{id}	    Delete task



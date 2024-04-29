Introduction

This project is a File Hider application developed using Java, Maven, MySQL, and the Java Mail API. It allows users to securely hide sensitive files and folders on their local system. Authentication is performed via email verification to ensure authorized access.

Features

File Hiding: Hide files and folders using a user-friendly interface.
Email-based Authentication: Securely authenticate users through email verification for added security.
Database Integration: Utilize a MySQL database for storing user information and hidden file locations.
Java Mail API Integration: Send verification emails using the Java Mail API.
Maven Build System: Manage project dependencies and build tasks efficiently with Maven.
Requirements

Java Development Kit (JDK) 8 or later (https://www.oracle.com/java/technologies/downloads/)
MySQL Database Server (https://dev.mysql.com/downloads/mysql/)
A Mail Server with SMTP enabled (e.g., Gmail, Outlook)
Getting Started

Clone the Repository:
Bash
git clone https://github.com/<your-username>/file-hider.git
Use code with caution.
content_copy
Set Up Database:
Install and configure a MySQL database server.
Create a database for your application.
Modify the db.properties file within the project to reflect your database connection details (hostname, port, username, password).
Build the Project:
Bash
cd file-hider
mvn clean install
Use code with caution.
content_copy
This command will download necessary dependencies and build the application.
Running the Application

Run the Java Class:
Bash
mvn exec:java -Dexec.mainClass=com.example.Main
Use code with caution.
content_copy
Replace com.example.Main with the actual main class name if it's different.
Usage

Start the application.
Enter your email address for verification.
Check your email for a verification code and enter it in the application.
Once verified, you can access the file hiding functionalities.

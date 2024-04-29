Description:

This project provides a secure file hiding application built with Java, utilizing Maven for dependency management, MySQL for data storage, and the JavaMail API for email-based authentication.

Features:

File Hiding: Hide important files and directories on your system, making them inaccessible to unauthorized users.
Email Authentication: Securely authenticate users by sending a verification code to their email address.
Maven Integration: Leverage Maven's powerful dependency management system for streamlined project setup and maintenance.
MySQL Database: Store user credentials and other application data in a robust MySQL database.




Getting Started:

Prerequisites:
Java Development Kit (JDK) 8 or later (https://www.oracle.com/java/technologies/downloads/)


Maven (https://maven.apache.org/download.cgi)

MySQL database server (https://www.mysql.com/)

Clone the Repository:

Bash

git clone https://github.com/<your-username>/file-hider.git

Use code with caution.

content_copy


Set Up Database:

Create a MySQL database.

Configure database connection details in src/main/resources/application.properties (replace localhost, username, and password).

Run the Application:

Bash

cd file-hider

mvn clean install

mvn exec:java -Dexec.mainClass=com.example.filehider.Main

Use code with caution.

content_copy


Usage:


Launch the application.

Enter your email address for registration or login.

If registering, follow the verification instructions sent to your email.

Once authenticated, use the provided interface to hide or unhide files/directories.

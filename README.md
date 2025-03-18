🏆 Coach Profile Project
This is a Spring Boot project that allows users to register, sign in, and access a dashboard to view videos and GIFs. It includes a Contact Form to collect user inquiries and a secure authentication system using Spring Security.

📂 Project Structure

src
├── main
│   ├── java
│   │   └── com.example.coachprofile
│   │       ├── config
│   │       │   └── SecurityConfig.java
│   │       ├── controller
│   │       │   ├── MainController.java
│   │       │   └── ContactController.java
│   │       ├── model
│   │       │   ├── User.java
│   │       │   └── ContactForm.java
│   │       ├── repository
│   │       │   ├── UserRepository.java
│   │       │   └── ContactRepository.java
│   │       └── service
│   │           ├── UserService.java
│   │           └── ContactService.java
│   └── resources
│       ├── static
│       │   ├── css
│       │   ├── js
│       │   └── images
│       ├── templates
│       │   ├── home.html
│       │   ├── about.html
│       │   ├── contact.html
│       │   ├── sign-in.html
│       │   ├── register.html
│       │   └── dashboard.html
│       ├── application.properties
└── test

🌟 Features
✔️ User Registration
✔️ User Login with Spring Security
✔️ Dashboard Access (Authenticated Users Only)
✔️ Contact Form to collect user messages
✔️ CSRF Protection
✔️ Static Files Handling (CSS, JS, Images)

🚀 Setup and Installation
1. Clone the repository

git clone https://github.com/your-username/coach-profile.git
cd coach-profile

2. Configure Database
Update application.properties file:

spring.datasource.url=jdbc:mysql://localhost:3306/coach_profile
spring.datasource.username=root
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update

3.Install Dependencies
mvn clean install

4.Run the Application
mvn spring-boot:run

5.Access the App
Home: http://localhost:8080/home
About: http://localhost:8080/about
Contact: http://localhost:8080/contact
Sign In: http://localhost:8080/sign-in
Dashboard: http://localhost:8080/dashboard

🔐 Authentication Flow
User registers through /register.
User logs in via /sign-in.
After successful login, user is redirected to /dashboard.
If not authenticated, user is redirected to /sign-in.

🏗️ Endpoints
Method	URL	Description	Access
GET	/home	Home page	Public
GET	/about	About page	Public
GET	/contact	Contact page	Public
POST	/submit-contact	Submit contact form	Public
POST	/register	User registration	Public
POST	/login	User login	Public
GET	/dashboard	Dashboard	Authenticated
POST	/logout	User logout	Authenticated

🎯 Future Improvements
Add role-based access control
Improve UI design
Enable file uploads for videos and GIFs
Add email verification

📜 License
This project is licensed under the MIT License.

🙌 Contributing
Fork the repo, make your changes, and create a pull request.


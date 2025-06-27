# EasyShop E-Commerce Application
[
](https://sdmntprpolandcentral.oaiusercontent.com/files/00000000-9c0c-620a-a6b3-3ed0afe8f5c9/raw?se=2025-06-27T15%3A08%3A27Z&sp=r&sv=2024-08-04&sr=b&scid=11011262-f2ed-5707-99e4-41921157d583&skoid=f28c0102-4d9d-4950-baf0-4a8e5f6cf9d4&sktid=a48cca56-e6da-484e-a814-9c849652bcb3&skt=2025-06-26T17%3A31%3A41Z&ske=2025-06-27T17%3A31%3A41Z&sks=b&skv=2024-08-04&sig=eW2ID1faNL/GEwj6VtjiSnWGecL7kNWxvpDHrr46chA%3D)![image](https://github.com/user-attachments/assets/88a43c59-298e-41ed-a6cc-4261c3f2cb4b)
## 1. Project Summary

EasyShop is a full-stack e-commerce application developed using **Java**, **Spring Boot**, and **MySQL**. It provides a RESTful API backend with the following core features:

- Category and product management  
- Shopping cart functionality  
- User profile handling  
- Order processing  
- Full CRUD operations  
- Secure user authentication  

Users can browse, search, and purchase products via API endpoints.

---

## 2. Running the Application

### Requirements

- Java Development Kit (JDK 17 or higher)  
- MySQL Database  
- Postman *(optional, for API testing)*  
- IDE such as IntelliJ IDEA or Eclipse  

### Configuration

Before running the application, update your `application.properties` file with your MySQL credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/
spring.datasource.username=<your-username>
spring.datasource.password=<your-password>



### Steps to Run

1. Clone the repository:

git clone - link
cd capstone-3


2. Run the application using Maven:

./mvnw spring-boot:run


3. Access the API or frontend:

- API Base URL: `http://localhost:8080`
- Frontend (optional): `http://localhost:8080/index.html`

---

## 3. Project Planning and Workflow

### GitHub Project Board

The development workflow was managed using a GitHub Project board with the following columns:

- **Backlog** – Items yet to be started  
- **In Progress** – Tasks currently being worked on  
- **Review** – Features pending feedback or testing  
- **Done** – Completed features and fixes  

### Roadmap

**Day 1-2**  
- Configure the development environment  
- Set up authentication  
- Establish database connectivity  

**Day 3-5**  
- Implement RESTful APIs for categories and products  

**Day 3** 
- Incomplete **
- Develop shopping cart, user profile, and order modules  
- Conduct integration testing to ensure system cohesion  

---
## Development Phases

- **Authentication**: Implemented `register` and `login` endpoints to secure user access to the API.  
- **CRUD Operations**: Created RESTful endpoints for managing categories, products, shopping carts, user profiles, and orders.  
- **Product Filtering**: Enabled dynamic filtering of products via query parameters.  
- **Testing**: Validated functionality of all endpoints using Postman.

---

## Tools Used

- **Spring Boot** – Backend application framework  
- **MySQL** – Relational database management  
- **Postman** – API testing and validation  
- **GitHub Projects** – Project and task management

---

## Challenges Faced

- **Database Connection Errors**: The application initially failed to connect to MySQL due to incorrect configuration in the properties file.  
- **Dynamic Filtering**: Designing flexible filtering logic using query parameters proved more complex than expected.  
- **Time Constraints**: Completing the project in three days demanded clear priorities and rapid development cycles.

---

## Solutions Implemented

- Fixed database configuration by carefully reviewing `application.properties`.  
- Used Spring Boot's `@RequestParam` to support dynamic product filtering.  
- Maintained a prioritized to-do list and leveraged tight feedback loops to maintain progress and adapt quickly.

---

## Lessons Learned

### 🔐 Cross-Origin and Security Annotations
- `@CrossOrigin`: Enables Cross-Origin Resource Sharing (CORS) so that frontend apps can make requests to the backend from different domains.  
  - *Example*: `AuthenticationController.java` in `org.yearup.controllers`  
- `@PreAuthorize`: Restricts access to certain endpoints to authenticated users.  
  - *Example*: `OrdersController.java` uses `@PreAuthorize("isAuthenticated()")`

### 🧰 Leveraging Spring Boot Annotations
- Key annotations like `@Autowired`, `@RequestMapping`, and `@RequestParam` streamlined development and enhanced code organization.  
  - *Example*: `ProductsController.java` in `org.yearup.controllers`

### 🔬 API Testing with Postman
- Used Postman to simulate and verify API requests, organize test collections, and ensure endpoint reliability.  
  - *Reference*: See “How to Run” section above

### 💻 Frontend Development
- Built a lightweight user interface using **HTML** and **JavaScript** for an intuitive customer experience.  
  - *Example*: `index.html` and related JS files in the `easyshop-frontend` directory

### ⚙️ Efficient Data Handling with Java Streams
- Utilized Java Streams to filter, map, and process data concisely and effectively.  
  - *Example*: `ShoppingCartController.java` in `org.yearup.controllers` uses `stream().filter().map().collect()`

---

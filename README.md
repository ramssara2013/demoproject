# User Service (Demo Project)

## Description
This is a demo project for a user management service built with Spring Boot.

## How to Run
1. Ensure you have JDK and Maven installed.
2. Clone the repository.
3. Navigate to the project directory.

### Using Intellij 
    * Right click on the DemoApplication java file and choose 'Run DemoApplication.main()'
    * Once you notice the "Started DemoApplication" message in the terminal, 
      access the endpoints using http://localhost:8080 using postman

### Endpoints 
```
POST http://localhost:8080/users
Payload:  
{
    "name": "demo user",
    "email": "demo@gmail.com"
}

GET http://localhost:8080/users/{id}
        
GET http://localhost:8080/users/filter?name={name}}&email={email}

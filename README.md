# MVC Request Flow Integration

## Purpose
This project demonstrates the MVC request flow in a Jakarta EE 10 web application.

## How MVC Works in This Application
1. The browser loads `index.jsp`.
2. The user enters a name, favorite food, and age.
3. The form submits to `ProcessServlet`.
4. The servlet reads the request parameters.
5. The servlet determines whether the user is a minor or an adult.
6. The servlet creates a message using the user’s name and favorite food.
7. The servlet stores the values in request attributes.
8. The servlet forwards the request to `result.jsp`.
9. The JSP uses Expression Language (EL) to display the values in the browser.

## Run URL
`http://localhost:8080/mvc-request-flow/`

## Technologies
- Jakarta EE 10
- Servlet
- JSP
- Expression Language (EL)
- Maven
- Tomcat 10.1+

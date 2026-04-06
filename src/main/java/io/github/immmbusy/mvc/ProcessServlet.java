package io.github.immmbusy.mvc;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/process")
public class ProcessServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String favoriteFood = request.getParameter("favoriteFood");
        String ageParam = request.getParameter("age");

        int age = 0;
        String category;
        String message;

        try {
            age = Integer.parseInt(ageParam);
        } catch (NumberFormatException e) {
            age = 0;
        }

        if (age < 18) {
            category = "minor";
        } else {
            category = "adult";
        }

        message = name + " likes " + favoriteFood + ".";

        request.setAttribute("name", name);
        request.setAttribute("favoriteFood", favoriteFood);
        request.setAttribute("age", age);
        request.setAttribute("category", category);
        request.setAttribute("message", message);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/result.jsp");
        dispatcher.forward(request, response);
    }
}
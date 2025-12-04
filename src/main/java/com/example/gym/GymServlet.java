package com.example.gym;


import java.io.IOException;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/gym")
public class GymServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/plain");
        response.getWriter().write("Backend Running: Welcome to Gym Website!");
    }
}


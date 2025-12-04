package com.example.gym;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public abstract class HttpServlet {
    protected abstract void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException;
}

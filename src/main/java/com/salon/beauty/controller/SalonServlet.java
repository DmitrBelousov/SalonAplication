package com.salon.beauty.controller;

import jakarta.servlet.http.*;
import java.io.*;

public class SalonServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().write("Hello World!");
    }
}
package Controller;

import Model.Account;
import Service.LoginService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Omni
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession();
        Account us = (Account) session.getAttribute("user");

        if (us != null) {
            response.sendRedirect("/Wed/student-transferred");
            return;
        }

        request.getRequestDispatcher("login.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("userName" + userName + "password" + password);
        LoginService loginService = new LoginService();
        Account user = loginService.findUser(userName, password);

        if (user != null && !user.isEmty()) {
            session.setAttribute("user", user);
            response.sendRedirect("/Wed/student-transferred");
        } else {
            request.getRequestDispatcher("login.jsp").forward(request, response);
            
        }
    }

}

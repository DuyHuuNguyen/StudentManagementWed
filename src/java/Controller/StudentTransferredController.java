/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import DTO.StudentTransferred;
import Service.StudentTransferredService;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 *
 * @author Omni
 */
@WebServlet(name="StudentTransferred" ,  urlPatterns= {"/student-transferred"})
public class StudentTransferredController extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {

           StudentTransferredService studentTransferredService = new  StudentTransferredService();
            ArrayList<StudentTransferred> students = studentTransferredService.findAll();
//            ví dụ
            int studentId = 100;
            studentTransferredService.findById(studentId);
           
            req.setAttribute("students", students);

            
        } catch (SQLException ex) {
            Logger.getLogger(StudentTransferredController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentTransferredController.class.getName()).log(Level.SEVERE, null, ex);
        }
      
       
    }
    
    
}

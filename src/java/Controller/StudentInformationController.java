/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;



import Service.StudentService;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * XEM TẤT CẢ HỌC VIÊN TRONG TOÀN DB 
 * @author Omni
 */

@WebServlet(name = "StudentInformation" ,urlPatterns = {"/student-information"})
public class StudentInformationController extends  HttpServlet{
    
   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(" hello");
        StudentService studentService = new StudentService();
     
        studentService.showInformationStudent();
         
       
    
    }
    
    
    

    
}

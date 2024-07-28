/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Account;
import Model.Student;
import Repository.StudentRepository;
import Service.CreateAccountService;
import Service.StudentService;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * đổi tên thành tên lớp + với tên file
 * convention urlPatterns là _- ko viết hóa
 *
 * @author Omni
 */
@WebServlet(name ="CreateAccount" ,urlPatterns ="/create")
public class CreateAccountController extends HttpServlet {
    private CreateAccountService createAccountService = new CreateAccountService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("create.jsp").forward(req, resp);
       
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   
       
        try {
            Student student = setInforStudent(req);
            boolean isValidableStudentInfor = createAccountService.create(student);
            System.out.println(isValidableStudentInfor);
//            if (isValidableStudentInfor){
//                Account account = setInforAccount(req, student);
//                createAccountService.create(account);
//                
//            }
//            System.out.println("Student create from jsp " +student);
            
            
            req.getRequestDispatcher("create.jsp").forward(req, resp);
            
        } catch (SQLException ex) {
            Logger.getLogger(CreateAccountController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CreateAccountController.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        
    }
    private static Account setInforAccount(HttpServletRequest req , Student student) throws SQLException, ClassNotFoundException{
       StudentRepository studentRepository = new StudentRepository();
        Account account = new Account();
        String accountId = req.getParameter("accountId");
        String password = req.getParameter("password");
        String id = student.getPersonId();
        int  studentId = studentRepository.findStudentIdByPersonId(id);
        
        account.setPassword(password);
        account.setAccountId(accountId);
        account.setStudentId(studentId);
        return account;
    }
    
    private static Student setInforStudent(HttpServletRequest req){
        String name = req.getParameter("name");
        String address = req.getParameter("address");
//        String dayOfBirth = req.getParameter("dayOfBirth");
//        Date day = Date.valueOf(dayOfBirth);
        String homeTown = req.getParameter("homeTown");
        String phoneNumber  = req.getParameter("phoneNumber");
        String level = req.getParameter("level");
        String personId = req.getParameter("personId");
        
        Student student = new Student();
     
        student.setAddress(address);
        student.setLevel(level);
        student.setStudentName(name);
        student.setPhoneNumber(phoneNumber);
        student.setHomeTown(homeTown);
//        student.setDateOfBirth(day);
        student.setPersonId(personId);
        
        return student;
    }
    
    
    
    
    
    
}
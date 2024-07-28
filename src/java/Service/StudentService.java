/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Student;
import Repository.StudentRepository;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Omni
 */
public class StudentService {
    StudentRepository studentRepository = new StudentRepository();
    
    // XEM  THONG TIN TẤT CẢ HỌC VIÊN 
    public ArrayList<Student> showInformationStudent() {
        try {
            // đôi tên thành students (nhớ có S) bỏ  list
            ArrayList<Student> students = studentRepository.findAllStudent();
            System.out.println("service");
            for (Student st : students){
                System.out.println(st);
            }
            return students;
        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    

    public boolean addNewStudent(Student student){
//        boolean studentDaCoTrongHeThong = studentRepository.timStudent(studentMoi.getSdt());
        
        return false;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;


import DTO.StudentTransferred;
import Repository.StudentTransferredRepository;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Omni
 */
public class StudentTransferredService {
        private StudentTransferredRepository  studentTransferredRepository = new StudentTransferredRepository();
        
        
        public ArrayList<StudentTransferred> findAll() throws SQLException, ClassNotFoundException, IOException{
            return studentTransferredRepository.findAll();
        }
 
        public StudentTransferred findById(int studentId ) throws SQLException, ClassNotFoundException, IOException{
             return studentTransferredRepository.findById(studentId);
        }
      
}

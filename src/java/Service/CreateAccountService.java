/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.Account;
import Model.Student;
import Repository.AccountRepository;
import Repository.StudentRepository;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author Omni
 */
public class CreateAccountService {
    private StudentRepository studentRepository = new StudentRepository();
    private AccountRepository accountRepository = new AccountRepository();
    
    public boolean create(Student newStudent ) throws SQLException, ClassNotFoundException, IOException{
        String personId = newStudent.getPersonId();
      
        Student foundStudent = studentRepository.findByPersonId(personId);
        boolean isValidStudent = (foundStudent == null);
        
        if(isValidStudent)
            return studentRepository.create(newStudent);
           
        return false;
    }
    
    public boolean create(Account newAccount) throws SQLException, ClassNotFoundException, IOException{
        
        return accountRepository.create(newAccount);
        
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Config.ConnectionConfig;
import Model.Student;
import java.io.IOException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * IdStudent INT NOT NULL PRIMARY KEY , HoTen VARCHAR(20) NOT NULL, NgaySinh
 * DATE, QueQuan VARCHAR(20), TrinhDo VARCHAR(20), DiaChi VARCHAR(20), SDT
 * VARCHAR(10)
 *
 * @author Omni
 */
public class StudentRepository {

    private ConnectionConfig cu = new ConnectionConfig();

    // LẤY TẤT CẢ HỌC VIÊN
    public ArrayList<Student> findAllStudent() throws SQLException, ClassNotFoundException {
        ArrayList<Student> listStudent = new ArrayList<>();
        String query = "SELECT IdHocVien,  HoTen,  NgaySinh,  QueQuan,  TrinhDo,  DiaChi,  SDT  FROM HocVien";
        Connection con = cu.getConnection();
        Statement statement = con.createStatement();
        System.out.println ("repo");
        try{
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            Student hv = setValuesFrom(resultSet);
            
            listStudent.add(hv);
        }
        }catch (Exception e){
            e.getStackTrace();
        }
             

        return listStudent;
    }

    
    public boolean create(Student student) throws SQLException, ClassNotFoundException, IOException {
        Connection con = cu.getConnection();
        String query = "INSERT INTO HocVien (HoTen,NgaySinh, QueQuan, TrinhDo, DiaChi,SDT,PersonId )\n"
                + "VALUES (?,?,?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(query);
      
        ps.setString(1,student.getStudentName());
        ps.setDate(2, (Date) student.getDateOfBirth());
        ps.setString(3, student.getHomeTown());
        ps.setString(4,student.getLever());
        ps.setString(5,student.getAddress());
        ps.setString(6, student.getPhoneNumber());
        ps.setString(7,student.getPersonId());
        int row = ps.executeUpdate();
        ConnectionConfig.closeConnection(con);
        return row >0;
    }

    public int  findStudentIdByPersonId(String personId) throws SQLException, ClassNotFoundException{
        ConnectionConfig cu = new ConnectionConfig();
        Connection con = cu.getConnection();
        String query ="select * from  HocVien \n" +
        "where PersonId = ? ";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1,personId);
        ResultSet resultSet = ps.executeQuery();
        while (resultSet.next()){
          return resultSet.getInt("PersionId");
           
        }
        return -1 ;
        
    }
    public Student findByPersonId(String personId) throws SQLException, ClassNotFoundException{
        
        ConnectionConfig cu = new ConnectionConfig();
        Connection con = cu.getConnection();
        String query ="select * from  HocVien \n" +
        "where PersonId = ? ";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1,personId);
        ResultSet resultSet = ps.executeQuery();
        while (resultSet.next()){
            Student student = setValuesFrom(resultSet);
            System.out.println(student);
            return student;
        }
        return null;
       
    }
    
    private static Student setValuesFrom(ResultSet res) throws SQLException {
        Student hv = new Student();
        hv.setStudentId(res.getInt(Student.STUDENT_ID));
        hv.setStudentName(res.getString(Student.STUDENT_NAME));
        hv.setDateOfBirth(res.getDate(Student.DATE_OF_BIRTH));
        hv.setHomeTown(res.getString(Student.HOME_TOWN));
        hv.setLevel(res.getString(Student.LEVER));
        hv.setAddress(res.getString(Student.ADDRESS));
        hv.setPhoneNumber(res.getString(Student.PHONE_NUMBER));
        hv.setPersonId(res.getString(Student.PERSON_ID));
        System.out.println(hv);
        return hv;
    }

}

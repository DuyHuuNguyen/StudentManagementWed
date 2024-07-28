/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Config.ConnectionConfig;
import DTO.StudentTransferred;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.CallableStatement;
import java.sql.ResultSet;

/**
 *
 * @author Omni
 */
public class StudentTransferredRepository {
    private ConnectionConfig cu = new ConnectionConfig();
    
    //LẤY HẾT TẤT CẢ HỌC VIÊN ĐÃ THANH TOÁN
    public ArrayList<StudentTransferred> findAll() throws SQLException, ClassNotFoundException, IOException{
        Connection con  = cu.getConnection();
        ArrayList<StudentTransferred> listStudent = new ArrayList<>();
        String query ="{call sp_hocVienDaThanhToan}";
        CallableStatement cs = con.prepareCall(query);
        ResultSet rs = cs.executeQuery();
        while (rs.next()){
            
            StudentTransferred hv = resultStudent(rs);
            System.out.println(hv);
            listStudent.add(hv);
        }
        ConnectionConfig.closeConnection(con);
        return listStudent;
    }
    
    // LẤY THEO ID YÊU CẦU 
    public StudentTransferred findById(int studentId ) throws SQLException, ClassNotFoundException, IOException{
        Connection con  = cu.getConnection();
        String query ="{call sp_hocVienDaThanhToanById(?)}";
        CallableStatement cs = con.prepareCall(query);
        cs.setInt(1,studentId);
        ResultSet rs = cs.executeQuery();
        while (rs.next()){       
            
            StudentTransferred hv = resultStudent( rs );
            System.out.println(hv);
            return hv;
        }
        ConnectionConfig.closeConnection(con);
       return null;
    }
    /**
     * set các giá trị cho đối tượng học viên
     * @return StudentPaid
     */
    private static StudentTransferred resultStudent(ResultSet rs ) throws SQLException{
        
        StudentTransferred hv = new StudentTransferred();
        hv.setStudentName(rs.getString(StudentTransferred.STUDENT_NAME));
        hv.setStudentId(rs.getInt(StudentTransferred.STUDENT_ID));
        hv.setSubjectName(rs.getString(StudentTransferred.SUBJECT_NAME));
        hv.setMoneyTransferred(rs.getDouble(StudentTransferred.MONEY_PAID));
        hv.setTransferred(rs.getString(StudentTransferred.TRANSFERRED));
        hv.setClassId(rs.getInt(StudentTransferred.CLASS_ID));
        
        return hv;
    }
    
    
}

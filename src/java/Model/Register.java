/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Omni
 */
public class Register {
     private int registerId;
     private int studentId;
     private int classId;
     private String transferred; // đã chuyển tiền

    public Register() {
    }

    public Register(int registerId, int studentId, int classId, String transferred) {
        this.registerId = registerId;
        this.studentId = studentId;
        this.classId = classId;
        this.transferred = transferred;
    }

    public int getRegisterId() {
        return registerId;
    }

    public void setRegisterId(int registerId) {
        this.registerId = registerId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getTransferred() {
        return transferred;
    }

    public void setTransferred(String transferred) {
        this.transferred = transferred;
    }

  
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *  đổi tên lại  DTO
 *  mổi entity luôn có 1 thuộc tính tên id (int và identity(1,1))
 *  tên biến boolean là  is....
 *  tên viến date là ...edAt
 *  xm lại moneypaid 
 * đôi cái String transferred -> boolean isTranferred
 * 
 * @author Omni
 */
public class StudentTransferred {
    private int  studentId ;
    private int classId;
    private String studentName;
    private Double  moneyTransferred;
    private String transferred;
    private String subjectName;
    
    public static final String STUDENT_ID ="IdHocVien"; 
    public static final String CLASS_ID ="IdLopHoc"; 
    public static final String STUDENT_NAME ="HoTen"; 
    public static final String MONEY_PAID="SoTienThanhToan"; 
    public static final String TRANSFERRED ="XacNhanDangKy"; 
    public static final String SUBJECT_NAME ="TenMon"; 

    public StudentTransferred() {
    }

   

    public StudentTransferred(int studentId, int classId, String studentName, Double moneyTransferred, String transferred, String subjectName) {
        this.studentId = studentId;
        this.classId = classId;
        this.studentName = studentName;
        this.moneyTransferred = moneyTransferred;
        this.transferred = transferred;
        this.subjectName = subjectName;
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

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Double getMoneyTransferred() {
        return moneyTransferred;
    }

    public void setMoneyTransferred(Double moneyTransferred) {
        this.moneyTransferred = moneyTransferred;
    }

    public String getTransferred() {
        return transferred;
    }

    public void setTransferred(String transferred) {
        this.transferred = transferred;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
    
    @Override
    public String toString() {
        return "StudentTransferred{" + "studentId=" + studentId + ", classId=" + classId + ", studentName=" + studentName + ", moneyTransferred=" + moneyTransferred + ", transferred=" + transferred + ", subjectName=" + subjectName + '}';
    }
    
}

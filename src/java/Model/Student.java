/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;
import java.util.Objects;

/**
 *   Student hv = new Student();
            hv.setIdStudent(res.getInt("IdStudent"));
            hv.setTenStudent(res.getString("HoTen"));
            hv.setNgaySing(res.getDate("NgaySinh"));
            hv.setQueQuan( res.getString("QueQuan"));
            hv.setTrinhDo(res.getString("TrinhDo"));
            hv.setDiaChi(res.getString("DiaChi"));
            hv.setSdt(res.getString("SDT"));
            System.out.println(hv);
 *
 * @author Omni
 */
public class Student {
    private int studentId;
    private String personId;
    private String studentName;
    private Date dateOfBirth;
    private String homeTown;
    private String level;
    private String address;
    private String phoneNumber;
    public static final String STUDENT_ID = "IdHocVien";
    public static final String STUDENT_NAME = "HoTen";
    public static final String DATE_OF_BIRTH ="NgaySinh";
    public static final String HOME_TOWN ="QueQuan";
    public static final String LEVER ="TrinhDo";
    public static final String ADDRESS ="DiaChi";
    public static final String PHONE_NUMBER ="SDT";
    public static final String PERSON_ID ="PersonId";
    

    public Student() {
    }

    public Student(int studentId, String personId, String studentName, Date dateOfBirth, String homeTown, String level, String address, String phoneNumber) {
        this.studentId = studentId;
        this.personId = personId;
        this.studentName = studentName;
        this.dateOfBirth = dateOfBirth;
        this.homeTown = homeTown;
        this.level = level;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

   

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getLever() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", personId=" + personId + ", studentName=" + studentName + ", dateOfBirth=" + dateOfBirth + ", homeTown=" + homeTown + ", level=" + level + ", address=" + address + ", phoneNumber=" + phoneNumber + '}';
    }

 


    @Override
    public boolean equals(Object obj) {
        if( obj == null ||  obj instanceof Student){
            return false;
        }
        Student that = (Student) obj;
        return that.studentId == this.studentId && that.studentName.equals(this.studentName)    
                 && that.dateOfBirth.equals(this.dateOfBirth) && that.homeTown.equals(this.homeTown) 
                 && that.level.equals(this.level) && that.address.equals(this.address) && that.phoneNumber.equals(this.phoneNumber)
                 && that.personId.equals(this.personId);
    }
    

   
}

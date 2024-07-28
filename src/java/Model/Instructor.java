/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Omni
 */
public class Instructor {
    private int instructorId;
    private String intructorName;
    private String address;
    private String workPlace ; // nơi làm việc
    private String phoneNumber;

    public Instructor() {
    }

    public Instructor(int instructorId, String intructorName, String address, String workPlace, String phoneNumber) {
        this.instructorId = instructorId;
        this.intructorName = intructorName;
        this.address = address;
        this.workPlace = workPlace;
        this.phoneNumber = phoneNumber;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }

    public String getIntructorName() {
        return intructorName;
    }

    public void setIntructorName(String intructorName) {
        this.intructorName = intructorName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    
    
    
}

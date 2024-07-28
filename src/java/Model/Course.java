/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author Omni
 */
public class Course {
    private int courseId;
    private Date courseOpeningDay ;
   

    public Course() {
    }

    public Course(int courseId, Date courseOpeningDay) {
        this.courseId = courseId;
        this.courseOpeningDay = courseOpeningDay;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public Date getCourseOpeningDay() {
        return courseOpeningDay;
    }

    public void setCourseOpeningDay(Date courseOpeningDay) {
        this.courseOpeningDay = courseOpeningDay;
    }

    
    
}

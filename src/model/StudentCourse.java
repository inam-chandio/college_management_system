/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 20CS008
 */
public class StudentCourse {
    private String st_name;
   private String  course_name;
   private int marks_Obtained;
   
   private int st_id;
   private int crs_id;

    public int getSt_id() {
        return st_id;
    }

    public void setSt_id(int st_id) {
        this.st_id = st_id;
    }

    public int getCrs_id() {
        return crs_id;
    }

    public void setCrs_id(int crs_id) {
        this.crs_id = crs_id;
    }

    public String getSt_name() {
        return st_name;
    }

    public void setSt_name(String st_name) {
        this.st_name = st_name;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public int getMarks_Obtained() {
        return marks_Obtained;
    }

    public void setMarks_Obtained(int marks_Obtained) {
        this.marks_Obtained = marks_Obtained;
    }

   
    
}

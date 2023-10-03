/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

import java.util.List;
import model.StudentCourse;
//import model.Course;

/**
 *
 * @author 20CS008
 */
public interface StudentcourseDao {
    public List<StudentCourse> getAllStudCourse();
    public boolean addStudentCourse(StudentCourse crs);
    public boolean deleteStudentCourse(StudentCourse id);
    public boolean updateStudentCourse(StudentCourse update);  
    
    
    
}

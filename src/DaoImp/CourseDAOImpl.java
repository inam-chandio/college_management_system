/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoImp;

import DAO.CourseDao;
import dbConnection.Dbconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Course;
import model.Student;



public class CourseDAOImpl implements CourseDao{
        private final String SELECT_QUERY = "SELECT * FROM course";

    @Override
    public List<Course> getAllCourse() {
         Connection con = (Connection) Dbconnection.getConnection();
        
		try {
			PreparedStatement ps = con.prepareStatement(SELECT_QUERY);
			ResultSet rst = ps.executeQuery();

			List<Course> crsList = new ArrayList<>();                   
			while (rst.next()) {
				Course crs = new Course();
				crs.setCourse_id(rst.getInt("course_id"));
				crs.setCourse_name(rst.getString("course_name"));
                                crs.setCourse_marks(rst.getInt("course_marks"));
				crsList.add(crs);
			}
			return  crsList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
    
		return null;
    
    
    }

    @Override
    public boolean addCourse(Course crs) {
      Connection con = (Connection) Dbconnection.getConnection();
     
        
 try{
           
            String query="INSERT INTO course(course_id, course_name, course_marks) VALUES(?,?,?)"; 
            PreparedStatement pst;
            pst = con.prepareStatement(query);
           pst.setInt(1, crs.getCourse_id());
           pst.setString(2, crs.getCourse_name());
           pst.setInt(3, crs.getCourse_marks());
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registered Successfully");
            
             }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
            return false;
        
             }    
    return true;
    }

    @Override
    public boolean deleteCourse(Course id) {
       
  Connection con = (Connection) Dbconnection.getConnection();
        
 try{
            
            String DELETE_QUERY="DELETE FROM course WHERE course_id=?"; 
            PreparedStatement ps;
            ps = con.prepareStatement(DELETE_QUERY);
            ps.setInt(1, id.getCourse_id());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Delete Successfully");
            
             }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
            return false;
     
             }
                return true;
    }

    @Override
    public boolean updateCourse(Course crs) {
        Connection con = (Connection) Dbconnection.getConnection();
     
        
 try{
           
           String query="Update course SET course_name=?, course_marks=? Where course_id=? "; 
           PreparedStatement pst;
           pst = con.prepareStatement(query);
           pst.setString(1, crs.getCourse_name());
           pst.setInt(2, crs.getCourse_marks());
           pst.setInt(3, crs.getCourse_id());
           pst.executeUpdate();
            
           JOptionPane.showMessageDialog(null, "Updated Successfully");
            
             }catch(Exception ex){
           JOptionPane.showMessageDialog(null,ex);
           return false;
        
             }    
    return true;
    
     }
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoImp;

import DAO.StudentcourseDao;
import com.mysql.jdbc.PreparedStatement;
import com.sun.jdi.connect.spi.Connection;
import dbConnection.Dbconnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Course;
import model.StudentCourse;

//import com.sun.jdi.connect.spi.Connection;

/**
 *
 * @author 20CS008
 */
public  class StudentCourseDAOImpl implements StudentcourseDao {
      private final String SELECT_QUERY = "select sc.st_id,s.st_name,sc.course_id,c.course_name,sc.marks_Obtained from studentCourse sc inner join students s on sc.st_id = s.st_id inner join course c on sc.course_id = c.course_id;";
     @Override
    public List<StudentCourse> getAllStudCourse() {
         java.sql.Connection con = (java.sql.Connection) Dbconnection.getConnection();
        
		try {
			java.sql.PreparedStatement ps = con.prepareStatement(SELECT_QUERY);
			ResultSet rst = ps.executeQuery();

			List<StudentCourse> crsList = new ArrayList<>();                   
			while (rst.next()) {
				StudentCourse stc = new StudentCourse();
                                stc.setSt_name(rst.getString("s.st_name"));
				stc.setCourse_name(rst.getString("c.course_name"));
                                stc.setSt_id(rst.getInt("sc.st_id"));
                                stc.setCrs_id(rst.getInt("sc.course_id"));
                                stc.setMarks_Obtained(rst.getInt("sc.marks_Obtained"));
				crsList.add(stc);
			}
			return  crsList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
    
		return null;
    
    }

    @Override
    public boolean addStudentCourse(StudentCourse crs) {
     java.sql.Connection con = (java.sql.Connection) Dbconnection.getConnection();
     
        
 try{
           
            String query="INSERT INTO studentCourse( st_id, course_id, marks_Obtained) VALUES(?,?,?)"; 
            java.sql.PreparedStatement pst;
            pst = con.prepareStatement(query);
            pst.setInt(1, crs.getSt_id());
            pst.setInt(2, crs.getCrs_id());
          
           pst.setInt(3, crs.getMarks_Obtained());
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registered Successfully");
            
             }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
            return false;
        
             }    
    return true;

    }

    @Override
    public boolean deleteStudentCourse(StudentCourse id) {
    java.sql.Connection con = (java.sql.Connection) Dbconnection.getConnection();
        
 try{
            
            String DELETE_QUERY="DELETE FROM studentCourse WHERE st_id=?"; 
            java.sql.PreparedStatement ps;
            ps = con.prepareStatement(DELETE_QUERY);
            ps.setInt(1, id.getSt_id());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Delete Successfully");
            
             }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
            return false;
     
             }
                return true;
    }

    @Override
    public boolean updateStudentCourse(StudentCourse update) {
     java.sql.Connection con = (java.sql.Connection) Dbconnection.getConnection();
     
        
 try{
           
           String query="Update studentCourse SET marks_Obtained=?, course_id=? Where st_id=? "; 
           java.sql.PreparedStatement pst;
           pst = con.prepareStatement(query);
          // pst.setString(1, crs.);
          
           pst.setInt(1, update.getCrs_id());
           pst.setInt(2, update.getMarks_Obtained());
           pst.setInt(1, update.getSt_id());

           pst.executeUpdate();
            
           JOptionPane.showMessageDialog(null, "Updated Successfully");
            
             }catch(Exception ex){
           JOptionPane.showMessageDialog(null,ex);
           return false;
        
             }    
    return true;
    }

   
}
 
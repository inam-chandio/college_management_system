/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoImp;
import DAO.StudentDao;
import java.util.Scanner;
import model.Student;
import dbConnection.Dbconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class StudentDAOImpl implements StudentDao{
    private final String SELECT_QUERY = "SELECT * FROM students";
    @Override
    public List<Student> getAllStud() {
     Connection con = (Connection) Dbconnection.getConnection();
        
		try {
			PreparedStatement ps = con.prepareStatement(SELECT_QUERY);
			ResultSet rst = ps.executeQuery();

			List<Student> stList = new ArrayList<>();

			while (rst.next()) {
				Student st = new Student();
				st.setSt_id(rst.getInt("st_id"));
				st.setSt_rollNumber(rst.getString("st_rollNumber"));
                                st.setSt_name(rst.getString("st_name"));
                                
                                st.setSt_fatherName(rst.getString("st_fatherName"));
                               st.setSt_age(rst.getInt("st_age"));
                               
                                st.setSt_email(rst.getString("st_email"));
                               st.setSt_mobile_Number(rst.getInt("st_mobile_Number"));
                               st.setDep_ID(rst.getInt("dep_ID"));
                               
				stList.add(st);
			}
			return  stList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
    }

   
    @Override
    //public boolean addDepartment(Student dept) {
        public boolean addStudent(Student stud)
        {
            Connection con = (Connection) Dbconnection.getConnection();
     
        
 try{
            
            String query="INSERT INTO students(st_id, st_rollNumber, st_name, st_fathername, st_age, st_email,st_mobile_Number, dep_ID) VALUES(?,?,?,?,?,?,?,?)"; 
            PreparedStatement pst;
            pst = con.prepareStatement(query);
        //    pst.setInt(1, dept.getDep_ID());
          //  pst.setString(2, dept.getDep_name());
            //pst.setString(3, dept.getDep_code());
            pst.setInt(1, stud.getSt_id());
            pst.setString(2, stud.getSt_rollNumber());
            pst.setString(3, stud.getSt_name());
            pst.setString(4, stud.getSt_fatherName());
            pst.setInt(5, stud.getSt_age());
            pst.setString(6, stud.getSt_email());
            pst.setInt(7, stud.getSt_mobile_Number());
            pst.setInt(8, stud.getDep_ID());
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registered Successfully");
            
             }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
            return false;
     
             }
                return true;
    
    }

    @Override
    public boolean deleteStudent(Student id) {
   Connection con = (Connection) Dbconnection.getConnection();
        
 try{
            
           String DELETE_QUERY="DELETE FROM students WHERE st_id=?"; 
           PreparedStatement ps;
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
    public boolean updateStudent(Student update) {
     Connection con = (Connection) Dbconnection.getConnection();
     
        
 try{
           
           String query="Update students SET st_rollNumber=?, st_name=?, st_fathername=?, st_age=?, st_email=?,st_mobile_Number=?, dep_ID=? Where st_id=?;"; 
           PreparedStatement pst;
           pst = con.prepareStatement(query);
           pst.setString(1, update.getSt_rollNumber());
           pst.setString(2, update.getSt_name());
           pst.setString(3, update.getSt_fatherName());
           pst.setInt(4, update.getSt_age());
           pst.setString(5, update.getSt_email());
            pst.setInt(6, update.getSt_mobile_Number());
             pst.setInt(7, update.getDep_ID());
             pst.setInt(8, update.getSt_id());
           pst.executeUpdate();
            
           JOptionPane.showMessageDialog(null, "Updated Successfully");
            
             }catch(Exception ex){
           JOptionPane.showMessageDialog(null,ex);
           return false;
        
             }    
    return true;
    
    }
     

    @Override
    public void getStudent() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
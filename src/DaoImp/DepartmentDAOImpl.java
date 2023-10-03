package DaoImp;

import DAO.DepartmentDao;
import dbConnection.Dbconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Department;

public class DepartmentDAOImpl implements DepartmentDao{
    
            private final String SELECT_QUERY = "SELECT * FROM department";
   // private PreparedStatement pst;
   // private Object txtname;
    //private int dep_ID;

    @Override
    public List<Department> getAllDept() {
         Connection con = (Connection) Dbconnection.getConnection();
        
		try {
			PreparedStatement ps = con.prepareStatement(SELECT_QUERY);
			ResultSet rst = ps.executeQuery();

			List<Department> deptList = new ArrayList<>();

			while (rst.next()) {
				Department dept = new Department();
				dept.setDep_ID(rst.getInt("dep_ID"));
				dept.setDep_name(rst.getString("dep_name"));
                                dept.setDep_code(rst.getString("dep_code"));
				deptList.add(dept);
			}
			return  deptList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
    
    }
            @Override
     public boolean addDepartment(Department dept){
         Connection con = (Connection) Dbconnection.getConnection();
     
        
 try{
            
            String query="INSERT INTO department(dep_ID,dep_name,dep_code) VALUES(?,?,?)"; 
            PreparedStatement pst;
            pst = con.prepareStatement(query);
            pst.setInt(1, dept.getDep_ID());
            pst.setString(2, dept.getDep_name());
            pst.setString(3, dept.getDep_code());
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registered Successfully");
            
             }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
            return false;
     
             }
                return true;

     }

   @Override
    public boolean deleteDepartment(Department id) {
  Connection con = (Connection) Dbconnection.getConnection();
        
 try{
            
            String DELETE_QUERY="DELETE FROM department WHERE dep_ID=?"; 
            PreparedStatement ps;
            ps = con.prepareStatement(DELETE_QUERY);
            ps.setInt(1, id.getDep_ID());
           // ps.setString(2, dept.getDep_name());
            //ps.setString(3, dept.getDep_code());
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Delete Successfully");
            
             }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
            return false;
     
             }
                return true;
    }

    @Override
    public boolean updateDepartment(Department update) {
    Connection con = (Connection) Dbconnection.getConnection();
     
        
 try{
           
           String query="Update department SET dep_name=?, dep_code=? Where dep_ID=?;"; 
           PreparedStatement pst;
           pst = con.prepareStatement(query);
           pst.setString(1, update.getDep_name());
           pst.setInt(3, update.getDep_ID());
           pst.setString(2,update.getDep_code() );
           
           pst.executeUpdate();
            
           JOptionPane.showMessageDialog(null, "Updated Successfully");
            
             }catch(Exception ex){
           JOptionPane.showMessageDialog(null,ex);
           return false;
        
             }    
    return true;
    
    }
     
       
}

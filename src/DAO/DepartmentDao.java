
package DAO;

import java.util.List;
import model.Department;

public interface DepartmentDao {
    
    public List<Department> getAllDept();
    public boolean addDepartment(Department dept);
    public boolean deleteDepartment(Department id);
     public boolean updateDepartment(Department update);
     
}

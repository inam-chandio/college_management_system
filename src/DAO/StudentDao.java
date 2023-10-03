
package DAO;

import java.util.List;
import model.Student;

public interface StudentDao {
    public List<Student> getAllStud();
    public boolean addStudent(Student stud);
    public boolean deleteStudent(Student id);
    public boolean updateStudent(Student update);

    public void getStudent();
     
}

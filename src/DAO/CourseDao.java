package DAO;

import java.util.List;
import model.Course;

public interface CourseDao {
    public List<Course> getAllCourse();
    public boolean addCourse(Course crs);
    public boolean deleteCourse(Course id);
    public boolean updateCourse(Course update);     
}

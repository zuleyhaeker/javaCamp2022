package dataAccess;

import java.util.ArrayList;
import java.util.List;
import entity.Course;

public class JdbcCourseDao implements CourseDao {

    private List<Course> courses = new ArrayList<>();

    @Override
    public void add(Course course) {
        courses.add(course);
        System.out.println("Kurs JDBC ile vertabanina eklendi.");
    }

    @Override
    public void delete(int id) {
        courses.remove(id);
        System.out.println("Kurs silindi.");
    }

    @Override
    public void update(int id, Course course) {
        courses.set(id, course);
        System.out.println("Kurs guncellendi.");
    }

    @Override
    public Course findById(int id) {
        return courses.get(id);
    }

    @Override
    public List<Course> getCourses() {
        return courses;
    }
}

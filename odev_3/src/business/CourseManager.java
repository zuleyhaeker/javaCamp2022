package business;
import java.util.ArrayList;
import java.util.List;

import logger.Logger;
import dataAccess.CourseDao;
import entity.Course;


public class CourseManager {

    private CourseDao courseDao;
    private List<Logger> loggers = new ArrayList<>();

    public CourseManager(CourseDao courseDao, List<Logger> loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {

        boolean isRepeat = false;

        for (Course c : courseDao.getCourses()) {
            if (course.getName().equals(c.getName())) {
                isRepeat = true;
            }
        }
        if (course.getPrice() < 0) {
            throw new Exception("Kursun fiyati 0 dan kucuk olamaz");
        } else {

            if (!isRepeat) {
                courseDao.add(course);
            } else {
                throw new Exception("Kurs ismi tekrar edemez.");
            }
        }

        for (Logger logger : loggers) {
            logger.log(course.getName());
        }

    }

    public void delete(int id) {
        courseDao.delete(id);
    }

    public void update(int id, Course course) {
        courseDao.update(id, course);
    }

    public Course findById(int id) {
        return courseDao.findById(id);
    }

    public List<Course> getCourses() {
        return courseDao.getCourses();
    }
}

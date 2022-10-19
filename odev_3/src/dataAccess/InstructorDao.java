package dataAccess;

import java.util.List;
import entity.Instructor;

public interface InstructorDao {

    void add(Instructor instructor);

    void delete(int id);

    void update(int id, Instructor instructor);

    Instructor findById(int id);

    List<Instructor> getInstructors();
}

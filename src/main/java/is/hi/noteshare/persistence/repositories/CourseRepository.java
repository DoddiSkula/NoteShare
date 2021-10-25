package is.hi.noteshare.persistence.repositories;

import is.hi.noteshare.persistence.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long>{
    Course save(Course course);
    void delete(Course course);

    Course findOne(long id);

    List<Course> findByName(String name);
    List<Course> findAll();
    List<Course> findAllReverseOrder();
}

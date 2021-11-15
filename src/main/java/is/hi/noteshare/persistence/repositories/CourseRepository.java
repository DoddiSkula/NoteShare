package is.hi.noteshare.persistence.repositories;

import is.hi.noteshare.persistence.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long>{
    Course save(Course course);
    void delete(Course course);
    List<Course> findByShortName(String name);
    Course findById(long id);
    List<Course> findAll();
    @Query(value = "SELECT * FROM courses WHERE concat(lower(name), lower(short_name)) LIKE '%'||lower(?1)||'%'", nativeQuery = true)
    List<Course> findByKeyword(String keyword);
}

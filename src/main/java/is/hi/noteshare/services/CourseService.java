package is.hi.noteshare.services;

import is.hi.noteshare.persistence.entities.Course;


import java.util.List;

public interface CourseService {
    List<Course> findByShortName(String name);
    Course findById(long id);
    List<Course> findAll();
    Course save(Course Course);
    void delete(Course course);
    List<Course> findByKeyword(String keyword);
}


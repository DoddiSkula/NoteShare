package is.hi.noteshare.services;

import is.hi.noteshare.persistence.entities.Course;


import java.util.List;

public interface CourseService {
    Course findByName(String name);
    List<Course> findAll();
    List<Course> findAllReverseOrder();
    Course findOne(long id);
    Course save(Course Course);
    void delete(Course course);
}


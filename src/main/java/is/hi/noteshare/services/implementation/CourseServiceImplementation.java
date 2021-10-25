package is.hi.noteshare.services.implementation;

import is.hi.noteshare.persistence.entities.Course;
import is.hi.noteshare.persistence.repositories.CourseRepository;
import is.hi.noteshare.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImplementation implements CourseService {
    private CourseRepository courseRepository;

    @Autowired
    public CourseServiceImplementation(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> findByName(String name) {
        return courseRepository.findByName(name);
    }

    @Override
    public List<Course> findAll(){
        return courseRepository.findAll();
    }

    @Override
    public List<Course> findAllReverseOrder(){
        return courseRepository.findAllReverseOrder();
    }

    @Override
    public Course findOne(long id) {
        return courseRepository.findOne(id);
    }

    @Override
    public Course save(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void delete(Course course) {
        courseRepository.delete(course);
    }
}

package is.hi.noteshare.services.implementation;

import is.hi.noteshare.persistence.entities.Course;
import is.hi.noteshare.persistence.repositories.CourseRepository;
import is.hi.noteshare.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImplementation implements CourseService {
    private CourseRepository courseRepository;

    @Autowired
    public CourseServiceImplementation(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> findByShortName(String name) {
        return courseRepository.findByShortName(name);
    }

    @Override
    public Course findById(long id) { return courseRepository.findById(id); }

    @Override
    public List<Course> findAll(){
        return courseRepository.findAll();
    }

    @Override
    public Course save(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void delete(Course course) {
        courseRepository.delete(course);
    }

    @Override
    public List<Course> findByKeyword(String keyword) {
        return courseRepository.findByKeyword(keyword);
    }
}

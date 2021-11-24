package is.hi.noteshare.services.implementation;

import is.hi.noteshare.persistence.entities.Course;
import is.hi.noteshare.persistence.entities.User;
import is.hi.noteshare.persistence.repositories.UserRepository;
import is.hi.noteshare.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImplementation(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findByUsername(String username){
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> findAll(){
        return userRepository.findAll();
    }

    @Override
    public User findById(long id) {
        return userRepository.findById(id);
    }

    @Override
    public User save(User user){
        return userRepository.save(user);
    }

    @Override
    public void delete(User user){
        userRepository.delete(user);
    }

    @Override
    public User login(User user) {
        User doesExist = findByUsername(user.getUsername());
        if(doesExist != null){
            if(doesExist.getPassword().equals(user.getPassword())){
                return doesExist;
            }
        }
        return null;
    }

    @Override
    public void favourite(long userId, long courseId) {
        userRepository.favourite(userId, courseId);
    }

    @Override
    public void removeFavourite(long userId, long courseId) {
        userRepository.removeFavourite(userId, courseId);
    }

    @Override
    public boolean isFavourited(User user, long courseId) {
        for(Course course : user.getCourses()){
            if(course.getId() == courseId) return true;
        }
        return false;
    }

    @Override
    public void removeFavouritedSession(User user, long courseId) {
        for(Course course: user.getCourses()) {
            if(course.getId() == courseId) {
                user.getCourses().remove(course);
                return;
            }
        }
    }
}

package is.hi.noteshare.services.implementation;

import is.hi.noteshare.persistence.entities.User;
import is.hi.noteshare.persistence.repositories.UserRepository;
import is.hi.noteshare.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImplementation implements UserService {
    private UserRepository userRepository;

    @Autowired
    public UserServiceImplementation(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findByName(String name){
        return userRepository.findByName(name);
    }

    @Override
    public List<User> findAll(){
        return userRepository.findAll();
    }

    @Override
    public List<User> findAllReverseOrder(){
        return userRepository.findAllReverseOrder();
    }

    @Override
    public User findOne(long id){
        return userRepository.findOne(id);
    }

    @Override
    public User save(User user){
        return userRepository.save(user);
    }

    @Override
    public void delete(User user){
        userRepository.delete(user);
    }
}

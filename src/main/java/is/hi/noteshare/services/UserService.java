package is.hi.noteshare.services;

import is.hi.noteshare.persistence.entities.User;

import java.util.List;

public interface UserService {
    List<User> findByName(String name);
    List<User> findAll();
    List<User> findAllReverseOrder();
    User findOne(long id);
    User save(User user);
    void delete(User user);
}

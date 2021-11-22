package is.hi.noteshare.services;

import is.hi.noteshare.persistence.entities.User;

import java.util.List;

public interface UserService {
    User findByUsername(String username);
    List<User> findAll();
    User save(User user);
    void delete(User user);
    User login(User user);
    void favourite(long userId, long courseId);
    void removeFavourite(long userId, long courseId);
}

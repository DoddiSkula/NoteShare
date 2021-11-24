package is.hi.noteshare.services;

import is.hi.noteshare.persistence.entities.User;

import java.util.List;

public interface UserService {
    User findByUsername(String username);
    List<User> findAll();
    User findById(long id);
    User save(User user);
    void delete(User user);
    User login(User user);
    void favourite(long userId, long courseId);
    void removeFavourite(long userId, long courseId);
    boolean isFavourited(User user, long courseId);
    void removeFavouritedSession(User user, long courseId);
}

package is.hi.noteshare.persistence.repositories;

import is.hi.noteshare.persistence.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long>{
    User save(User user);
    void delete(User user);
    User findByUsername(String username);
    List<User> findAll();
    User findById(long id);
    @Modifying
    @Query(value = "INSERT INTO user_courses(user_id, course_id) VALUES (?1, ?2)", nativeQuery = true)
    @Transactional
    void favourite(long userId, long courseId);
    @Modifying
    @Query(value = "DELETE FROM user_courses WHERE user_id = ?1 AND course_id =?2", nativeQuery = true)
    @Transactional
    void removeFavourite(long userId, long courseId);
}

package is.hi.noteshare.persistence.repositories;

import is.hi.noteshare.persistence.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long>{
    User save(User user);
    void delete(User user);

    User findOne(long id);

    List<User> findByName(String user);
    List<User> findAll();
    List<User> findAllReverseOrder();
}

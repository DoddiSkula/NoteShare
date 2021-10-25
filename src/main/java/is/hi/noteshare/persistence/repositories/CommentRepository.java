package is.hi.noteshare.persistence.repositories;

import is.hi.noteshare.persistence.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long>{
    Comment save(Comment comment);
    void delete(Comment comment);

    Comment findOne(long id);

    List<Comment> findByName(String name);
    List<Comment> findAll();
    List<Comment> findAllReverseOrder();
}

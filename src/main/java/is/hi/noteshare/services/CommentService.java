package is.hi.noteshare.services;

import is.hi.noteshare.persistence.entities.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> findByName(Comment comment);
    List<Comment> findAll();
    List<Comment> findAllReverseOrder();
    Comment findOne(long id);
    Comment save(Comment comment);
    void delete(Comment comment);
}

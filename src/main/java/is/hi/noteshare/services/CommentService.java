package is.hi.noteshare.services;

import is.hi.noteshare.persistence.entities.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> findById(long id);
    List<Comment> findAll();
    Comment save(Comment comment);
    void delete(Comment comment);
}

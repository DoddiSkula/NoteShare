package is.hi.noteshare.services.implementation;

import is.hi.noteshare.persistence.entities.Comment;
import is.hi.noteshare.persistence.repositories.CommentRepository;
import is.hi.noteshare.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImplementation implements CommentService{
    private CommentRepository commentRepository;

    @Autowired
    public CommentServiceImplementation(CommentRepository commentRepository){
        this.commentRepository = commentRepository;
    }

    @Override
    public List<Comment> findById(long id){
        return commentRepository.findById(id);
    }

    @Override
    public List<Comment> findAll(){
        return commentRepository.findAll();
    }


    @Override
    public Comment save(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public void delete(Comment comment) {
        commentRepository.delete(comment);
    }
}


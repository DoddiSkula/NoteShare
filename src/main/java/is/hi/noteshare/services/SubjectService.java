package is.hi.noteshare.services;

import is.hi.noteshare.persistence.entities.Subject;

import java.util.List;

public interface SubjectService {
    Subject save(Subject subject);
    void delete(Subject subject);
    Subject findBySubject(String subject);
    Subject findById(long id);
    List<Subject> findAll();
}

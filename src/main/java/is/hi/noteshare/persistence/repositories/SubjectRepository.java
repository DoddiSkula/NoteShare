package is.hi.noteshare.persistence.repositories;

import is.hi.noteshare.persistence.entities.School;
import is.hi.noteshare.persistence.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
    Subject save(Subject subject);
    void delete(Subject subject);
    Subject findBySubject(String subject);
    Subject findById(long id);
    List<Subject> findAll();
}
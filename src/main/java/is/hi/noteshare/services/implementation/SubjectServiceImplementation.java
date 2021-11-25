package is.hi.noteshare.services.implementation;

import is.hi.noteshare.persistence.entities.School;
import is.hi.noteshare.persistence.entities.Subject;
import is.hi.noteshare.persistence.repositories.SubjectRepository;
import is.hi.noteshare.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImplementation implements SubjectService {
    private SubjectRepository subjectRepository;

    @Autowired
    public SubjectServiceImplementation(SubjectRepository subjectRepository){
        this.subjectRepository = subjectRepository;
    }

    @Override
    public Subject save(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public void delete(Subject subject) {
        subjectRepository.delete(subject);
    }

    @Override
    public Subject findBySubject(String subject) {
        return subjectRepository.findBySubject(subject);
    }

    @Override
    public Subject findById(long id) {
        return subjectRepository.findById(id);
    }

    @Override
    public List<Subject> findAll() {
        return subjectRepository.findAll();
    }
}

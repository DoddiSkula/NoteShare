package is.hi.noteshare.services.implementation;

import is.hi.noteshare.persistence.entities.School;
import is.hi.noteshare.persistence.repositories.SchoolRepository;
import is.hi.noteshare.services.SchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SchoolServiceImplementation implements SchoolService{
    private SchoolRepository schoolRepository;

    @Autowired
    public SchoolServiceImplementation(SchoolRepository schoolRepository){
        this.schoolRepository = schoolRepository;
    }

    @Override
    public List<School> findByName(String name){
        return schoolRepository.findByName(name);
    }

    @Override
    public List<School> findAll(){
        return schoolRepository.findAll();
    }

    @Override
    public School save(School school){
        return schoolRepository.save(school);
    }

    @Override
    public void delete(School school){
        schoolRepository.delete(school);
    }
}

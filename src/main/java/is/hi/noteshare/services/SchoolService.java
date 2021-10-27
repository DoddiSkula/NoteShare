package is.hi.noteshare.services;

import is.hi.noteshare.persistence.entities.School;

import java.util.List;

public interface SchoolService {
    List<School> findByName(String name);
    List<School> findAll();
    School save(School school);
    void delete(School school);
}

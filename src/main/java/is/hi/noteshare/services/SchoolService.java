package is.hi.noteshare.services;

import is.hi.noteshare.persistence.entities.School;

import java.util.List;

public interface SchoolService {
    List<School> findByName(String name);
    List<School> findAll();
    List<School> findAllReverseOrder();
    School findOne(long id);
    School save(School school);
    void delete(School school);
}

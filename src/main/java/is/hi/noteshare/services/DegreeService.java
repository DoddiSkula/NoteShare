package is.hi.noteshare.services;

import is.hi.noteshare.persistence.entities.Degree;

import java.util.List;

public interface DegreeService {
    Degree save(Degree degree);
    void delete(Degree degree);
    Degree findByDegree(Degree degree);
    Degree findById(long id);
    List<Degree> findAll();
}

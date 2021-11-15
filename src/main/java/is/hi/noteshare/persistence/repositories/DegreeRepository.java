package is.hi.noteshare.persistence.repositories;

import is.hi.noteshare.persistence.entities.Degree;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DegreeRepository extends JpaRepository<Degree, Long> {
    Degree save(Degree degree);
    void delete(Degree degree);
    Degree findByDegree(Degree degree);
    Degree findById(long id);
    List<Degree> findAll();
}
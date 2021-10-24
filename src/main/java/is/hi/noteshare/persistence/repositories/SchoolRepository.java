package is.hi.noteshare.persistence.repositories;

import is.hi.noteshare.persistence.entities.School;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SchoolRepository extends JpaRepository<School,Long> {
    School save(School school);
    void delete(School school);

    School findByName(String name);
    School findOne(long id);

    List<School> findAll();
    List<School> findAllReverseOrder();


}

package is.hi.noteshare.persistence.repositories;

import is.hi.noteshare.persistence.entities.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SchoolRepository extends JpaRepository<School,Long> {
    School save(School school);
    void delete(School school);
    List<School> findByName(String name);
    List<School> findAll();
    @Query(value="SELECT subject FROM subjects", nativeQuery = true)
    List<String> findAllSubjects();
    @Query(value="SELECT degree FROM degrees", nativeQuery = true)
    List<String> findAllDegrees();
}

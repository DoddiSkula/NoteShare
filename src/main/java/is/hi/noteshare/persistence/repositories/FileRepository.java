package is.hi.noteshare.persistence.repositories;

import is.hi.noteshare.persistence.entities.File;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FileRepository  extends JpaRepository<File, Long>{
    File save(File file);
    void delete(File file);
    List<File> findById(long id);
    List<File> findAll();
    List<File> findByCourse(long id);
}

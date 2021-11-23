package is.hi.noteshare.services;

import is.hi.noteshare.persistence.entities.File;

import java.util.List;

public interface FileService {
    File findById(long id);
    List<File> findAll();
    File save(File file);
    void delete(File file);
    List<File> findByCourse(long id);
}

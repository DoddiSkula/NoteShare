package is.hi.noteshare.services;

import is.hi.noteshare.persistence.entities.File;

import java.util.List;

public interface FileService {
    List<File> findByName(String name);
    List<File> findAll();
    List<File> findAllReverseOrder();
    List<File> findAllDateOrder();
    File findOne(long id);
    File save(File file);
    void delete(File file);
}

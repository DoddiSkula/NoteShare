package is.hi.noteshare.services.implementation;

import is.hi.noteshare.persistence.entities.File;
import is.hi.noteshare.persistence.repositories.FileRepository;
import is.hi.noteshare.services.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileServiceImplementation implements FileService{
    private  FileRepository fileRepository;

    @Autowired
    public FileServiceImplementation(FileRepository fileRepository){
        this.fileRepository = fileRepository;
    }

    @Override
    public File findById(long id){ return fileRepository.findById(id); }

    @Override
    public List<File> findAll(){
        return fileRepository.findAll();
    }

    @Override
    public File save(File file){
        return fileRepository.save(file);
    }

    @Override
    public void delete(File file){
        fileRepository.delete(file);
    }

    @Override
    public List<File> findByCourse(long id) {
        return fileRepository.findByCourse(id);
    }
}

package is.hi.noteshare.services.implementation;

import is.hi.noteshare.persistence.entities.Degree;
import is.hi.noteshare.persistence.repositories.DegreeRepository;
import is.hi.noteshare.services.DegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DegreeServiceImplementation implements DegreeService {
    private DegreeRepository degreeRepository;

    @Autowired
    public DegreeServiceImplementation(DegreeRepository degreeRepository) {
        this.degreeRepository = degreeRepository;
    }

    @Override
    public Degree save(Degree degree) {
        return degreeRepository.save(degree);
    }

    @Override
    public void delete(Degree degree) {
        degreeRepository.delete(degree);
    }

    @Override
    public Degree findByDegree(Degree degree) {
        return degreeRepository.findByDegree(degree);
    }

    @Override
    public Degree findById(long id) {
        return degreeRepository.findById(id);
    }

    @Override
    public List<Degree> findAll() {
        return degreeRepository.findAll();
    }
}

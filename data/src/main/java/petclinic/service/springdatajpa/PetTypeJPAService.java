package petclinic.service.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import petclinic.model.PetType;
import petclinic.service.PetTypeService;

import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetTypeJPAService implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return null;
    }

    @Override
    public PetType findById(Long aLong) {
        return null;
    }

    @Override
    public PetType save(PetType object) {
        return null;
    }

    @Override
    public void delete(PetType object) {

    }

    @Override
    public void deleteById(Long aLong) {

    }
}

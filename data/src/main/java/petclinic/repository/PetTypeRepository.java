package petclinic.repository;

import org.springframework.data.repository.CrudRepository;
import petclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}

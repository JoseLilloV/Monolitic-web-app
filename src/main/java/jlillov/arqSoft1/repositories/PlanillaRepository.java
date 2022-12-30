package jlillov.arqSoft1.repositories;

import jlillov.arqSoft1.entities.PlanillaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanillaRepository extends CrudRepository<PlanillaEntity, Long> {
}

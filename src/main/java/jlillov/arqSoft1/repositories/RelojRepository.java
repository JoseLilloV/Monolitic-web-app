package jlillov.arqSoft1.repositories;

import jlillov.arqSoft1.entities.EmpleadoEntity;
import jlillov.arqSoft1.entities.RelojEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelojRepository extends CrudRepository<RelojEntity, Long> {
    RelojEntity save(RelojEntity registro);}

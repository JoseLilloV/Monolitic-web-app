package jlillov.arqSoft1.repositories;

import jlillov.arqSoft1.entities.EmpleadoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends CrudRepository<EmpleadoEntity, Long> {


        EmpleadoEntity  save(EmpleadoEntity empleadoNuevo);


}

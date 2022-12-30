package jlillov.arqSoft1.services;

import jlillov.arqSoft1.entities.EmpleadoEntity;
import jlillov.arqSoft1.repositories.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoService  {
    @Autowired
    EmpleadoRepository empleadoRepository;

    public EmpleadoEntity guardar(EmpleadoEntity empleado){
        return empleadoRepository.save(empleado);
    }
    public List<EmpleadoEntity> getAll(){
        return (List<EmpleadoEntity>) empleadoRepository.findAll();
    }
}

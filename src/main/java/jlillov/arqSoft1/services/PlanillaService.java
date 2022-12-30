package jlillov.arqSoft1.services;

import jlillov.arqSoft1.entities.EmpleadoEntity;
import jlillov.arqSoft1.entities.PlanillaEntity;
import jlillov.arqSoft1.repositories.EmpleadoRepository;
import jlillov.arqSoft1.repositories.PlanillaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlanillaService {
    @Autowired
    PlanillaRepository planillaRepository;
    @Autowired
    EmpleadoRepository empleadoRepository;

    public PlanillaEntity guardarVarios(PlanillaEntity registro){
        Iterable<EmpleadoEntity> listaEmpleados = empleadoRepository.findAll();
        for (EmpleadoEntity empleado:listaEmpleados) {

        }
        return planillaRepository.save(registro);
    }
}

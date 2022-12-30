package jlillov.arqSoft1.services;

import jlillov.arqSoft1.entities.RelojEntity;
import jlillov.arqSoft1.repositories.RelojRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class RelojService {
    @Autowired
    RelojRepository relojRepository;

    public List<RelojEntity> getByRut(String rut){
        Iterable<RelojEntity> all =  relojRepository.findAll();
        List<RelojEntity> salida = new LinkedList<>();
        for (RelojEntity registro: all) {
            if(registro.getRut() == rut){
                salida.add(registro);
          }
        }
        return salida;
    }

    public RelojEntity guardar(RelojEntity registro){
        return relojRepository.save(registro);
    }
}

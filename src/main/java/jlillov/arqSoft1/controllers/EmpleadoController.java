package jlillov.arqSoft1.controllers;

import jlillov.arqSoft1.entities.EmpleadoEntity;
import jlillov.arqSoft1.services.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping
public class EmpleadoController {
    @Autowired
    EmpleadoService empleadoService;

    @PostMapping("/empleado/create")
    public EmpleadoEntity crear(@RequestBody EmpleadoEntity empleado_nuevo){
        EmpleadoEntity obj =  empleadoService.guardar(empleado_nuevo);

        return obj;
    }
}

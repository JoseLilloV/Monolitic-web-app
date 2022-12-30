package jlillov.arqSoft1.controllers;

import jlillov.arqSoft1.services.PlanillaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping
public class PlanillaController {
    @Autowired
    PlanillaService planillaService;

    @PostMapping("/planilla/calcular")
    public void calcular(@RequestParam("mes") Integer mes, RedirectAttributes ms)  {


       // return "redirect:/";
    }
}

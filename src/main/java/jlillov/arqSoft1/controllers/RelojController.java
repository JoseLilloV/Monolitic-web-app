package jlillov.arqSoft1.controllers;

import jlillov.arqSoft1.services.CsvReader;
import jlillov.arqSoft1.services.JsonReader;
import jlillov.arqSoft1.services.ReaderContext;
import jlillov.arqSoft1.services.RelojService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.text.ParseException;


@Controller
@RequestMapping
public class RelojController {
    @Autowired
    RelojService relojService;


    @PostMapping("/reloj/cargarArchivo")
    public String carga(@RequestParam("archivos") MultipartFile file, RedirectAttributes ms) throws IOException, ParseException {
        ReaderContext context = new ReaderContext();

        //String content = new String(file.getBytes(), StandardCharsets.UTF_8);
        switch (file.getOriginalFilename()){
            case "DATA.txt":
                context.setReaderMethod(new CsvReader());
                context.readerFile(file, relojService);
                ms.addFlashAttribute("mensaje", "Archivo del reloj cargado correctamente");
                break;
            case "HORAS.JSON":
                context.setReaderMethod(new JsonReader());
                context.readerFile(file, relojService);
                ms.addFlashAttribute("mensaje", "Archivo del reloj cargado correctamente");
                break;
            default:
                ms.addFlashAttribute("mensaje", "Archivo no valido");
        }
        return "redirect:/";
    }
}

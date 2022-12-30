package jlillov.arqSoft1.services;

import jlillov.arqSoft1.entities.RelojEntity;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.ParseException;

public class CsvReader implements ReaderStrategy{

    @Override
    public void reader(MultipartFile archivo, RelojService relojService) throws IOException, ParseException {
        if (!archivo.isEmpty()) {
            String content = new String(archivo.getBytes());
            String[] lineas = content.split("\n");
            String[] registro;
            for (int i = 1; i < lineas.length; i++) {
                registro = lineas[i].split(";");
                relojService.guardar( new RelojEntity(registro[0], registro[1], registro[2]));
            }
        }
    }
}

package jlillov.arqSoft1.services;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.ParseException;

public interface ReaderStrategy {
    public void reader(MultipartFile archivo, RelojService relojService) throws IOException, ParseException;
}

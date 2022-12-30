package jlillov.arqSoft1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.ParseException;

public class ReaderContext {
    private ReaderStrategy strategy;

    public void setReaderMethod(ReaderStrategy strategy){
        this.strategy = strategy;
    }
    public ReaderStrategy getStrategy(){
        return this.strategy;
    }
    public void readerFile(MultipartFile archivo, RelojService relojService) throws IOException, ParseException {
        this.strategy.reader(archivo, relojService);
    }

}

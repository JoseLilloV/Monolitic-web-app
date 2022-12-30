package jlillov.arqSoft1.services;


import com.google.gson.*;
import jlillov.arqSoft1.entities.RelojEntity;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.text.ParseException;
import java.util.Properties;

public class JsonReader implements ReaderStrategy{


    @Override
    public void reader(MultipartFile archivo, RelojService relojService) throws IOException, ParseException {
        if (!archivo.isEmpty()) {
            String content = new String(archivo.getBytes());
            final Gson gson = new Gson();
            JsonParser parser = new JsonParser();
            JsonArray gsonArr = parser.parse(content).getAsJsonArray();
            for (JsonElement obj : gsonArr) {
                JsonObject gsonObj = obj.getAsJsonObject();
                System.out.println(gsonObj);
                relojService.guardar( new RelojEntity( gsonObj.get("fecha").getAsString(),
                        gsonObj.get("hora").getAsString(),
                        gsonObj.get("run").getAsString())
                );
            }


        }
    }
}

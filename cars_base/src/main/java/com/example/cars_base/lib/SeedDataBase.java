package com.example.cars_base.lib;

import com.example.cars_base.lib.interfaces.IModelSeed;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class SeedDataBase {
    public void insertDatabase(String path, IModelSeed modelSeed){
        Resource resource = new ClassPathResource("Seeds/"+path+".txt");
        try (Stream<String> stream = Files.lines(Paths.get(resource.getURI()))) {
            Optional<String> optional = stream.findFirst();
            String value = optional.isPresent() ? optional.get() : null;
            value = value.replace("'", "");
            var arr = value.split("\\),\\(");
            for (String str : arr
            ) {
                if (str.startsWith("("))
                    str=str.substring(1);
                else if (str.endsWith(")")) {
                    str=str.substring(0,str.length()-1);
                }
                var params=str.split(",");
                try {
                    modelSeed.insert(params);
                    System.out.println(params);
                } catch (Exception e) {
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

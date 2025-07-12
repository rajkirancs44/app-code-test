package com.citi.test;

import org.yaml.snakeyaml.Yaml;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

public class TestYamlProperties {
    public static void main(String [] str){
        try (InputStream in = TestYamlProperties.class.getClassLoader().getResourceAsStream("application.yaml");) {
            Yaml yaml = new Yaml();
            Map<String, Object> obj = yaml.load(in);
            Map<String, Object> deadcode = (Map<String, Object>) obj.get("deadcode");
        } catch (IOException e) {
            System.out.print(e.getMessage());
            throw new RuntimeException(e);
        }
    }


}

package com.java7;

import java.io.InputStream;
import java.util.Properties;

public class ResourceClose7Test {

    public static void main(String[] args) {
        String fileName = "system.properties";
        Properties p = new Properties();
        try (InputStream inputStream = ResourceClose7Test.class.getClassLoader().getResourceAsStream(fileName)) {
            p.load(inputStream);
            System.out.println(p.get("system.info"));
        } catch (Exception e) {
            throw new RuntimeException("read file error:" + fileName, e);
        }
    }
}

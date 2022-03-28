package com.java6;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ResourceClose6Test {

    public static void main(String[] args) throws IOException {
        String fileName = "system1.properties";
        InputStream inputStream = null;
        Properties p = new Properties();
        try {
            inputStream = ResourceClose6Test.class.getClassLoader().getResourceAsStream(fileName);
            p.load(inputStream);
        } catch (IOException|NullPointerException e) {
            throw new RuntimeException("read file error:" + fileName, e);
        } finally {
            inputStream.close();
        }
        System.out.println(p.get("system.info"));
    }
}

package com.syntax.class29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileDemo {
    public static void main(String[] args) throws IOException {
        //this demo shows that how to read properties file
        //steps to read the files
        //1 we need to know the path to that file

        String path="Filess/Config.properties";
        //navigate to that path where file is stored
        FileInputStream fileInputStream=new FileInputStream(path);
        //2 we need to have a special software that understad that file that we can use to open and edt that file
        Properties properties=new Properties();
        //loading all the data from the file inside the properties objects
        properties.load(fileInputStream);
        System.out.println(properties.get("user"));
        System.out.println(properties.get("password"));
        System.out.println(properties.get("URL"));
        fileInputStream.close();


    }
}

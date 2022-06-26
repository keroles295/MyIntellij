package com.syntax.class24;

public class HW1cl24Rest {
    public static void main(String[] args) {

        File[] f={ new JavaFile(), new WordFile(), new PdfFile() };
        for(File file:f){
            file.open();
            file.close();
            file.edit();
        }








    }

}

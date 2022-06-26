package com.syntax.class24;

public class HW1Cl24 {
    //Create a class File that will have the following behaviors:
    // open, edit, close. Edit and close are implemented method while open is an abstract.
    // Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
    // Example: to open .java file we need notepad++ or sublime text, to open .
    // doc file we need Microsoft word to be installed etc
}
 abstract class File {
   void close(){
        System.out.println("It closes");

    }
    void edit(){
        System.out.println("it edits");
    }
  abstract void open();
}
class JavaFile extends File {

    @Override
    void open() {
        System.out.println("java file we need notepad++ or sublime text");
    }
}
class WordFile extends File {
    @Override
    void open() {
        System.out.println("we need Microsoft word to be installed to open it");
    }
}
class PdfFile extends File {
    @Override
    void open() {
        System.out.println("we need PDF to be installed to open it");
    }
}
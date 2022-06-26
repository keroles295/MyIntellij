package com.syntax.class25;

public class HWCl24T1ASh {
    public static void main(String[] args) {
        File[] files={new JavaFile(), new WordFile(), new PDFFile()};
        for(File file:files){
            file.close();
            file.edit();
            file.open();

        }
    }

}
abstract class File{
   abstract void open();
   //private String name;
  // File(String name){
       //this.name=name;
   //}
    void edit(){
       // System.out.println(name);
        System.out.println("Editing the file");
    }
    void close(){
        System.out.println("Closing the file");
    }
}
class JavaFile extends File{
   // JavaFile(String name) {
      //  super(name);
   // }

    void open(){
        System.out.println("Use IntelliJ to open Java file");
    }
    @Override
    void edit(){
        System.out.println("Java can be edit");
    }
}
class WordFile extends File{
    @Override
    void open() {
        System.out.println("Use Microsoft Word to the word file");
    }
}
class PDFFile extends File{

    @Override
    void open() {
        System.out.println("Use Adobe reader to open the pdf file");
    }
}

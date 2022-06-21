package com.syntax.class19;

class Book{
    String author;
    int pageCount;
    Book(String author){
        this.author=author;
    }
    Book(String author, int pageCount){
        this.author=author;
        this.pageCount=pageCount;
    }
}


public class TaskHwWithAsghar1809 {
    public static void main(String[] args) {
        Book book1=new Book("Halim");
        Book book2=new Book("Unknown", 78);
    }


}

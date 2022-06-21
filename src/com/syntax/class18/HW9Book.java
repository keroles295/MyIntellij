package com.syntax.class18;

public class HW9Book {
    //Write Book class that will have instance variables and 2 Constructors. While creating an object make sure
    //Instance variables are being initialized
    //Both Constructors are being executed
    String title;
    String authorName;
    String authorCountry;
    String publisher;
    int year;
    int numberOfSalies;
    HW9Book(String title, String publisher, int year, int numberOfSalies){
        this.title=title;
        this.publisher=publisher;
        this.year=year;
        this.numberOfSalies=numberOfSalies;
        System.out.println("The book title is "+title+" ,and it had been published by "+publisher+". It published in "+year+" it sold "+numberOfSalies+" of this book in 3 months");
    }
    HW9Book(String authorName, String authorCountry){
        this.authorName=authorName;
        this.authorCountry=authorCountry;
        System.out.println("The author is "+authorName+", and the country of author is "+authorCountry);
    }

    public static void main(String[] args) {
        HW9Book pito=new HW9Book(  "The Lost", "New York Times", 2006, 1009933);
        HW9Book pito1=new HW9Book("Natasha Preston", "UK");
    }







}

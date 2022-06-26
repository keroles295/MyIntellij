package com.syntax.class23;

public class HW1C22AS {
    public static void main(String[] args) {
        Degree d1=new Degree();
        d1.getPreeqisuite();
        Bacheroles d2= new Bacheroles();
        d2.getPreeqisuite();
        Master d3= new Master();
        d3.getPreeqisuite();
    }

}
class Degree{
    void getPreeqisuite(){
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bacheroles extends Degree{

}
class Master extends Degree{
    @Override
    void getPreeqisuite(){
        System.out.println("To get a Master you need Bacheroles degree");
    }
}


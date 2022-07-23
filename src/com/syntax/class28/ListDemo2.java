package com.syntax.class28;

import java.util.ArrayList;

public class ListDemo2 {
    public static void main(String[] args) {
        ArrayList<Flower> flowers=new ArrayList<>();
        flowers.add(new Rose());
        flowers.add(new Lilly());
        flowers.add(new Flower());
        for(Flower flower1:flowers){
            flower1.bloom();
        }
    }
}
class Flower{
    void bloom(){
        System.out.println("Generally flower in spring");
    }
}
class Rose extends Flower{
    @Override
    void bloom() {
        System.out.println("Bloom in April");
    }
}
class Lilly extends Flower{
    @Override
    void bloom() {
        System.out.println("Bloom in Summer");
    }
}


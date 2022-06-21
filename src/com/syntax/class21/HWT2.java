package com.syntax.class21;

public class HWT2 {

}
class Shape{
    double radius;
    Shape(double radius){
        this.radius=radius;
    }
}

class Circle extends Shape{

    Circle(double radius) {
        super(radius);
    }
    void calculateAndPrintArea(){
        double area=Math.PI*Math.pow(radius, 2);
        System.out.println("Area "+area);
    }
}
class Tester{

    public static void main(String[] args) {
        Circle circle=new Circle(20);
        circle.calculateAndPrintArea();
    }
}


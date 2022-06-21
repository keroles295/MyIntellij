package com.syntax.class21;

public class HW121 {
    //Create 1 class in which create a methods that will calculate the area (volume in case of box) of
    //Rectangle
    //Square
    //Box
    //Use separate class to test your code
    double length;
    double width;
    double hight;
    public HW121(double length, double width){
        this.hight=hight;
        this.length=length;
        this.width=width;
    }
}
class Rectangle extends HW121{

    public Rectangle(double length, double width) {
        super(length, width);
    }
    public void calculateAre(){
        System.out.println("The Rectangle Area = "+length*width);
    }

}
class Square extends HW121{
    public Square(double lenght, double width){
        super(lenght, width);
    }
    public void calculateAre(){
        System.out.println("The Square area = "+length*width);
    }
}
class Box extends HW121{
    public Box (double length, double width, double hight){
        super(length, width);
        this.hight=hight;

    }
    public void calculatevol(){
        System.out.println("The Box Volume = "+length*width*hight);
    }
}


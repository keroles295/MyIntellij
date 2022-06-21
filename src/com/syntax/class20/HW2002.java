package com.syntax.class20;

public class HW2002 {
    //Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
    // In circle class create a method to calculate the area of circle. Test your code

}
class Shapee{
    double radius;
    Shapee(double radius){
        this.radius=radius;
    }
}
class CircleCl extends Shapee{
    CircleCl(double raduis){
        super( raduis);
    }
    public void calArea() {
        double area=Math.PI*(radius*radius);
        System.out.println(area);
    }
}
class Testere{
    public static void main(String[] args) {
        CircleCl pito=new CircleCl(21.38782);
        pito.calArea();
    }
}

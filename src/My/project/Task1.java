package My.project;

public class Task1 {
    //Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
    // Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
    // Test your code.
}
interface Shape{

    void calculateArea();

    double calculatePerimiter();

}
class Circle implements Shape{
    int r;
    @Override
    public void calculateArea() {

        System.out.println(Math.PI*r*r);
    }

    @Override
    public double calculatePerimiter() {
        return Math.PI*2*r;
    }


}
class Square implements Shape{
   int d;
    @Override
    public void calculateArea() {
        System.out.println(d*d);
    }

    @Override
    public double calculatePerimiter() {
        return d+d ;
    }


}
class Test{
    public static void main(String[] args) {
        Circle c=new Circle();
        c.r=7;
        c.calculateArea();
        System.out.println(c.calculatePerimiter());
       Square s=new Square();
       s.d=8;
       s.calculateArea();
        System.out.println(s.calculatePerimiter());

    }
}

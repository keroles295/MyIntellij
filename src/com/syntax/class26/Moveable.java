package com.syntax.class26;

public interface Moveable {
    void move();

}
class Car implements Moveable{

    @Override
    public void move() {
        System.out.println("You can move it");
    }
    public void park(){
        System.out.println("You can park it");
    }
}
class Person implements Moveable {

    @Override
    public void move() {
        System.out.println("Human can also move");
    }
}
class Test{
    public static void main(String[] args) {
        Moveable moveable=new Car();//we are widening
        moveable.move();
        ((Car)(moveable)).park();//narrowing
        //With interface, we can also use polymorphism
        Moveable[] moveAbles={new Car(), new Person()};
    }
}
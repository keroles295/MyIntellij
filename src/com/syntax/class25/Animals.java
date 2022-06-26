package com.syntax.class25;

public interface Animals {
    void sleep();
    void eat();


}
interface Dog extends Animals{
    void Bark();
}
class Huskey implements Dog{
    @Override
    public void sleep() {
        System.out.println("It sleeps 10 hours");
    }

    @Override
    public void eat() {
        System.out.println("It likes to eat meat");
    }

    @Override
    public void Bark() {
        System.out.println("It always barks loudly");
    }
}

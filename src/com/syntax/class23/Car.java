package com.syntax.class23;

public class Car {
    void start(){
        System.out.println("Use keys to start");
    }
    void stop(){
        System.out.println("Use breek to stop it");
    }
    void park(){
        System.out.println("You can park it manually");
    }
}
class BMW extends Car{
    @Override
    void start() {
        System.out.println("You can push the button to start it");
    }

    @Override
    void stop() {
        System.out.println("You can use auto breek");
    }


}
class Tesla extends Car{
    @Override
    void start() {
        System.out.println("Push to start");
    }

    @Override
    void stop() {
        System.out.println("Auto stop");

    }

    @Override
    void park() {
        System.out.println("It can park itself");
    }
}
class Honda extends Car{

}


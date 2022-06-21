package com.syntax.class18;

public class CarTester {
    public static void main(String[] args) {
        Car car1=new Car("Honda", "Civic","Gray");
        car1.printInfo();
        Car car2= new Car("Toyota", "Camery", "White");
        car2.printInfo();
        Car car=new Car("Tesla");
        car.printCarModel();




    }
}

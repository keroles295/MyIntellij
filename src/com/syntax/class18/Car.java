package com.syntax.class18;

public class Car {
    String make;
    String model;
    String color;
    public Car(){

    }
    public Car(String carMake, String carModel, String carColor){
        make=carMake;
        model=carModel;
        color=carColor;
    }
    public Car(String carModel){
        model=carModel;
    }
    //public Car(String carColor){}//it is not allow to create a constructor of
    //the same number of the parameters and same type
    void printCarModel(){
        System.out.println("Model is "+model);
    }
    void printInfo(){
        System.out.println("Car make is "+make+" Model is "+model+" color is "+color);
    }


}

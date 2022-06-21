package com.syntax.class20;

public class Vehicle {
    int enginHP;
    String make;
    String model;
    String color;

}
class Car extends Vehicle{
    String steeringType;
    boolean autoPilot;
    int noOfWidows;


}
class BMW extends Car{
    int topSpeed;
    void printBasicInfo(){
        enginHP=378;
        System.out.println(enginHP);
    }
}
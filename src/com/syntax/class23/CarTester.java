package com.syntax.class23;

public class CarTester {
    public static void main(String[] args) {


       //Car car =new Tesla();
      // car.park();
      // car.start();
      // car=new Honda();//reasign the value
        //car.start();



      //Car bmw=new BMW();//
      // Car Honda=new Honda();//
       // Tesla tesla=new Tesla();
        //tesla.park();
        //tesla.start();
        //tesla.stop();
       /// BMW bmw=new BMW();
        //bmw.start();
        //bmw.park();
        //bmw.stop();
       // Honda honda=new Honda();
       // honda.park();
      //  honda.start();
      //  honda.stop();
        //Car car=new BMW();
       // car.start();
       // car.park();
       // car.stop();
        Car [] cars={new BMW(), new Honda(), new Tesla()};
        for(Car c:cars){
            c.stop();
            c.park();
            c.start();
        }

    }
}

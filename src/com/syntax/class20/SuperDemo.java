package com.syntax.class20;

public class SuperDemo {
    public static void main(String[] args) {
        Chair chair= new Chair();
        chair.printCl();
    }

}
class Wood{
    String color="Blue";// if we want to print it we should to remove color from furniture class
}
class Furniture extends Wood {

    String color="Black";

}
class Chair extends Furniture{
    String color ="Grey";
    void printCl(){
        String color="White";
        //alawys local variable is prefered
        System.out.println(color);
        System.out.println(this.color);
        System.out.println(super.color);// we just call the Parent of The Child class, but we can not GrandParent with super(KW)
        //if we don not have color in furrnture class so it grabes from the parent of the parent class
        //so we can print color Blue if we don not have color black in parent class
    }
}

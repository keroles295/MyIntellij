package com.syntax.class15;

public class HW1404Ret {

    void sayHello(String country){
        String hello;
        switch(country){
            case "USA":
                hello="Hola";
                break;
            case "Russia":
                hello="Privet";
                break;
            case "France":
                hello="Bonjour";
                break;
            case "Egypt":
                hello="Ahlan W Sahlen";
                break;
            case "India":
                hello="Namastay";
                break;
            default:
                hello="Country not found";

        }
        System.out.println(hello);
    }

    public static void main(String[] args) {
        HW1404Ret task4=new HW1404Ret();
        task4.sayHello("France");
    }


}

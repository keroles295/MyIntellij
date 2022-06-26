package com.syntax.class25;

public interface IP65 {
    //private String make="LG"; interface can only have public fields
    //protected String make="LG"; interface can only have public fields
    //public String make="LG";//Modifier 'public' is redundant for interface members
    //public static final ----No need to write them because all the fields are public static final

    //String make="LG";
    void wash();//



}
interface FiveG{
    void speed();
}
interface FastChargable{
    void charging();
}
class S21Ultra implements IP65, FastChargable, FiveG{

    @Override
    public void wash() {
        System.out.println("You can wash me easy");
    }

    @Override
    public void charging() {
        System.out.println("I support fast charging now because I have implemented this requirements as well");
    }

    @Override
    public void speed() {
        System.out.println("You can download things super fast because I also have implemented");
    }

    public static void main(String[] args) {
        IP65 ip65=new S21Ultra();

    }
}

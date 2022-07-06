package com.syntax.class24;

public abstract class Phone {
    abstract void displayaPictures();
    abstract void unLock();


}
class Iphone extends Phone{
    @Override
    void displayaPictures(){
        System.out.println("Use the Photos app to diplay the picture");
    }
    @Override
    void unLock(){
        System.out.println("Use the Face ID to unlock the phone");
    }
    void sendText(){
        System.out.println("Use the messing app to send the mesg");
    }
}

class Samsung extends Phone{


    @Override
    void displayaPictures() {
        System.out.println("Use the Gallery app to display the pictures");
    }

    @Override
    void unLock() {
        System.out.println("Use the fingerprint sensor to unlock your phone");
    }
}
class Tester{
    public static void main(String[] args) {
        Samsung samsung= new Samsung();
        samsung.displayaPictures();
        samsung.unLock();


    }
}

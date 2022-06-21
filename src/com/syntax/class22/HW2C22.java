package com.syntax.class22;

public class HW2C22 {
    //Create a class CreditCard and define variable balance and interest.//
    // Create an instance method that will calculate interest based on the given balance.
    //Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
    //Call the method by creating an object of each of the three classes.
}
class CreditCard {
    double balance;
    double interest;
    public void getInterest(double balance){
        this.balance=balance;
        this.interest=interest;
        if(balance<2000){
            interest=2.9;
        } else if (balance<1000) {
            interest=0.9;
        } else if (balance>8000) {
            interest=3.9;
        }
        System.out.println(interest);
    }



}
class Visa extends CreditCard{

}
class AX extends CreditCard{
    public void getInterest(double balance){
        this.balance=balance;
        this.interest=interest;
        if(balance<2000&& balance>=1000){
            interest=2.9;
        } else if (balance<1000) {
            interest=1.9;
        } else if (balance>8000) {
            interest=3.9;
        }
        System.out.println(interest);
    }

}
class Test4{
    public static void main(String[] args) {
        CreditCard card=new CreditCard();
        Visa visa=new Visa();
        AX ax=new AX();
        card.getInterest(700);
        ax.getInterest(1800);
        visa.getInterest(8694);

    }
}


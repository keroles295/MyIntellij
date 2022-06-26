package com.syntax.class23;

public class HW2C22AS {
    public static void main(String[] args) {
        CreaditCard cred=new CreaditCard(100, 15);
        cred.calculateInterst();
        Visa visa=new Visa(150, 10);
        visa.calculateInterst();
        AX ax=new AX(100, 15);
        ax.calculateInterst();
    }

}
class CreaditCard{
    double balance;
    double interest;

    public CreaditCard(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    public void calculateInterst(){
        System.out.println("Interest"+(balance*interest/100));
    }
}
class Visa extends CreaditCard{
    Visa(double balance, double interest){
        super(balance, interest);

    }

}
class AX extends CreaditCard{

    public AX(double balance, double interest) {
        super(balance, interest);
    }

    @Override
    public void calculateInterst() {
        System.out.println("Interest "+(balance*interest/100+5));
    }
}

package com.syntax.class20;

public class HW1Ta {
    //Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
    // Create a subclass  userInfo that will have user address variable
    // and it also being initialized through constructor call.
    // Print users name, mobile number and address in userDetails method.
    // Test your code.
}
class UserClass1{
    String name;
    String mobileNumber;
    public  UserClass1(String name, String mobileNumber){
        this.name=name;
        this.mobileNumber=mobileNumber;
    }

}
class userInfo1 extends UserClass1 {
    String adsress;
   public userInfo1(String name, String adsress, String mobileNumber){
        super(name, mobileNumber);
        this.adsress=adsress;

   }
   public void printDe(){
       System.out.println("Name "+name+" adsress "+adsress+" mobil number "+mobileNumber);
   }

    }

package com.syntax.class21;

public class HWTask1 {

}
 class userClass{
    String name;
    String mobilNumber;

    public userClass(String name, String mobilNumber) {
        this.name = name;
        this.mobilNumber = mobilNumber;
    }
}
class UserInfo extends userClass{
    String userAddress;

    public UserInfo(String name, String mobilNumber, String userAddress) {
        super(name, mobilNumber);
        this.userAddress=userAddress;
    }
    void printB(){
        System.out.println("Name "+name+" Mobile Number "+mobilNumber+" User Address "+userAddress);
    }
}

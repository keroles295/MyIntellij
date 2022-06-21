package com.syntax.class15;

public class HW1403Ret {
    //create a method that will print whether given String is palindrome or not.

    void printIsPalindrome(String str){
       StringBuilder stringBuilder=new  StringBuilder(str);
        stringBuilder.reverse();
        String reversedStr=stringBuilder.toString();
        if(str.equals(reversedStr)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }

    }

    public static void main(String[] args) {
        HW1403Ret task3=new HW1403Ret();
        task3.printIsPalindrome("dad");
        task3.printIsPalindrome("kougd");
    }





}

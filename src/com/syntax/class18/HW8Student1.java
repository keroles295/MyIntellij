package com.syntax.class18;

public class HW8Student1 {
    //Write a Student class   that have instance variables name and address.
    // Create a constructor that will initialize those variables.
    // Print name & address of given  student using displayInfo method.
    String name;
    String address;
    public HW8Student1(String name, String address ){
        this.name=name;
        this.address=address;
    }
    public void displayInfo(){
        System.out.println("The student name is "+name+" ,and the student address is "+address);
    }

    public static void main(String[] args) {
        HW8Student1 st=new HW8Student1("Pietro", "150 Pittman Ct, Stephens City, VA 22655");
        st.displayInfo();


    }

}

package com.syntax.class19;

public class TaskHwWithAsghar1808 {
    String name;
    String address;

    TaskHwWithAsghar1808(String name, String address){
        this.name=name;
        this.address=address;
    }
    void displayInfo(){
        System.out.println(name+" "+address);
    }

    public static void main(String[] args) {
        TaskHwWithAsghar1808 task8=new TaskHwWithAsghar1808("Peter", "467 Lindy Parkside dr");
        task8.displayInfo();
    }
}

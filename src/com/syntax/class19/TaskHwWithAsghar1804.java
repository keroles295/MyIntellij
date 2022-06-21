package com.syntax.class19;

public class TaskHwWithAsghar1804 {
    TaskHwWithAsghar1804(){
        System.out.println("Constructor one");
    }
    TaskHwWithAsghar1804(String name){
        System.out.println("Constructor two");
    }

    public static void main(String[] args) {
        new TaskHwWithAsghar1804();
        new TaskHwWithAsghar1804("Pietro");
    }
}

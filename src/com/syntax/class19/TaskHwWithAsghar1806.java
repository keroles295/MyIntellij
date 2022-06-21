package com.syntax.class19;

public class TaskHwWithAsghar1806 {
    private TaskHwWithAsghar1806(){
        System.out.println("Private");
    }
    TaskHwWithAsghar1806(String name){
        System.out.println("Default");
    }
    protected TaskHwWithAsghar1806(int i){
        System.out.println("Protected");
    }
    public TaskHwWithAsghar1806(boolean x){
        System.out.println("Public");
    }

    public static void main(String[] args) {
        new TaskHwWithAsghar1806();
        new TaskHwWithAsghar1806("Pietro");
        new TaskHwWithAsghar1806(true);
        new TaskHwWithAsghar1806(23);
    }
}

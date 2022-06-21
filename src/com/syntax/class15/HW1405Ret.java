package com.syntax.class15;

public class HW1405Ret {
    String completeEmail(String name, String lastName, String emailType){
        return name+lastName+"@"+emailType+".com";

    }

    public static void main(String[] args) {
        HW1405Ret task5=new HW1405Ret();
        System.out.println(task5.completeEmail("keroles","nazer", "gmail"));
    }
}

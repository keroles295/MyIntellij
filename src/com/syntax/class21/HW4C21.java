package com.syntax.class21;

public class HW4C21 {
    //Create 1 class with a private method that has 3 overloaded forms.
    // Then call each overloaded method with specific arguments and observe result.
    private void myMeth(int a, String str){
        System.out.println("This is first method");
    }
    private void myMeth(String str2, String str){
        System.out.println("This is second method");
    }
    private void myMeth(String str, int a){
        System.out.println("This is third method");
    }

    public static void main(String[] args) {
        HW4C21 po= new HW4C21();

        po.myMeth(23, "Pietro");
        po.myMeth("Kyrolis", "Botros");
        po.myMeth("pietro", 3);

    }
}




package com.syntax.class22;

public class THW2WithAs {
    static void sayHelllo(){
        System.out.println("Hello Batch 13");
    }
    static void sayHelllo(String mst){
        System.out.println(mst);
    }
    static void sayHelllo(String mst, int times){
        for(int i=0; i<times; i++){
            System.out.println(mst);
        }
    }

    public static void main(String[] args) {
        sayHelllo();
        sayHelllo("You will never walk alone");
        sayHelllo("Pietro", 6);
    }

}

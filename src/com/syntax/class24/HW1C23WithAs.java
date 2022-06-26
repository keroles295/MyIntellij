package com.syntax.class24;

public class HW1C23WithAs {

}
class Students {
    void doHW1(){
        System.out.println("Students should do HW");
    }
    void study(){
        System.out.println("Students must study");
    }
    void practice(){
        System.out.println("Students must practice");
    }

}
class SyntaxStudent1 extends Students{
    @Override
    void study() {
        System.out.println("Syntax students must learn programming");
    }
    void doHW1(){
        System.out.println("Syntax students must solve the Repls to get a good job");
    }
    @Override
    void practice(){
        System.out.println("Syntax Students must practice to get good job");
    }
}
class CollegeStydent1 extends Students {
    @Override
    void practice(){
        System.out.println("College Students must practice to get good job");
    }

}
class SchoolStudent1 extends Students{

}

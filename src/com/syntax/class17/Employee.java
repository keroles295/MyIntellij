package com.syntax.class17;

public class Employee {
    public String name;
    public static String manager ="Cinday";
    private int salary;
    String department;
    private void printSalary(){
        System.out.println("Salary "+salary);
    }
    public static void printMang(){
        System.out.println(manager);
    }

    void printDepartment(){
        System.out.println("Department "+department);
    }
    public void printName(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Employee empy=new Employee();
        empy.name="Pito";
        empy.department="IT Developer";
        empy.salary=12999;
        empy.printName();
        empy.printSalary();
        empy.printDepartment();

    }
}

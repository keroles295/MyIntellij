package com.syntax.class16;

public class GoogleEmployees {
    String name;
    double salary;
    static int noOfEmplyees;
    static String companyName="Google";
    void displayEmployessInfo(){
        System.out.println("Name "+name+" salary "+salary+" company name "+companyName+" Total Employees "+noOfEmplyees);
    }

    public static void main(String[] args) {
        GoogleEmployees emp1=new GoogleEmployees();
        emp1.name="Pietro";
        emp1.salary=2345678;
        emp1.noOfEmplyees=1;
        emp1.displayEmployessInfo();
        emp1.displayEmployessInfo();

        GoogleEmployees emp2=new GoogleEmployees();
        emp2.name="Peter";
        emp2.salary=234538;
        emp2.noOfEmplyees=2;
        emp1.displayEmployessInfo();
        emp2.displayEmployessInfo();
    }




}

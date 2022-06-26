package review.class09;

public class Human {
    String name;
    int age;
    double weight;
    String color;

    public Human(String name, int age, double weight, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
class Employee extends  Human{
    String employeeID;
    double salary;
    String title;
    String departement;

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID='" + employeeID + '\'' +
                ", salary=" + salary +
                ", title='" + title + '\'' +
                ", departement='" + departement + '\'' +
                '}';
    }

    public Employee(String name, int age, double weight, String color,
                    String employeeID, double salary, String title, String departement) {
        super(name, age, weight, color);
        this.employeeID = employeeID;
        this.salary = salary;
        this.title = title;
        this.departement = departement;



    }
}
class SDET extends Employee{

    String programminglan;
    boolean knowSel;
    String framwork;

    @Override
    public String toString() {
        return "SDET{" +
                "programminglan='" + programminglan + '\'' +
                ", knowSel=" + knowSel +
                ", framwork='" + framwork + '\'' +
                '}';
    }

    public SDET(String name, int age, double weight, String color, String employeeID, double salary, String title,
                String departement, String programminglan, boolean knowSel, String framwork) {
        super(name, age, weight, color, employeeID, salary, title, departement);
        this.programminglan = programminglan;
        this.knowSel = knowSel;
        this.framwork = framwork;

    }
}


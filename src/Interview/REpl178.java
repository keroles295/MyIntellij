package Interview;

public class REpl178 {
    public static void main(String[] args) {
        EncapsulationDemo test=new EncapsulationDemo();
        test.setEmpName("John");
        test.setEmpAge(30);
        test.getEmpName();
        test.getEmpAge();
    }
}
class EncapsulationDemo{
    private String empName;
    private int empAge;
    public void getEmpName() {
        System.out.println("Employee Name: "+empName);
    }
    public String setEmpName(String empName) {
        this.empName = empName;
        return empName;
    }
    public void getEmpAge() {
        System.out.println("Employee Name: "+empAge);
    }
    public int setEmpAge(int empAge) {

        this.empAge = empAge;
        return empAge;
    }
}

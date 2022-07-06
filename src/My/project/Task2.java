package My.project;

public class Task2 {
    //We have to calculate the average of marks obtained in
    // three subjects by student A and in 4 subjects by student B.
    // Create class 'Marks' with an abstract method 'getAverage' that will be returning the average of marks.
    // Provide implementation of abstract method in classes 'A' and 'B'.
    // The constructor of student A takes the marks in three subjects as its parameters
    // and the marks in four subjects as its parameters for student B. Test your code
}
 abstract class Marks{
   abstract double getAverage();
    }
 class StudentA extends Marks{
    double s1;
    double s2;
    double s3;

     public StudentA(double s1, double s2, double s3) {
         this.s1 = s1;
         this.s2 = s2;
         this.s3 = s3;

     }

     @Override
     double getAverage() {
         return (s1+s2+s3)/(3);
     }
 }
class StudentB extends Marks{
    double s1;
    double s2;
    double s3;
    double s4;

    public StudentB(double s1, double s2, double s3, double s4) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
    }

    @Override
    double getAverage() {
        return (s1+s2+s3+s4)/(4);
    }
}
class Test2{
    public static void main(String[] args) {
        StudentA s1=new StudentA(98, 56, 98);
        System.out.println(s1.getAverage());
        StudentB s2=new StudentB(98, 97, 67, 89);
        System.out.println(s2.getAverage());
    }
}



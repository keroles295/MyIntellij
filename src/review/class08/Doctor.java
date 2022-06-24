package review.class08;

public class Doctor {
   public String firstName, lastName;
   protected String speciality;
    int experience;
    private double salary;
    public static String hospital;
    public Doctor(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;

    }
    Doctor(String firstName, String lastName, String speciality, int experience){
        this(firstName, lastName);
        this.speciality=speciality;
        this.experience=experience;
    }

    public void printInfo(){
        System.out.println("Doctor name is "+firstName+" "+lastName+" and sepciality is "+speciality);
    }
    protected void work(){
        System.out.println("Doctor "+firstName+" works at "+hospital);
    }
    void treat(String patientName){
        this.printInfo();
        System.out.println("treats patient "+patientName);
    }
    //static void study(String universty){
       // System.out.println("Doctor "+lastName+"Studied at "+universty);//static methods can not work with instance variable

    //}
    public static void study(String universty){
        //printInfo();Non-static method 'printInfo()' cannot be referenced from a static context
        System.out.println("Doctor Studied at "+universty);
    }
    private void getPaid(){
        System.out.println("Doctor "+lastName+" get paid ");
    }








}

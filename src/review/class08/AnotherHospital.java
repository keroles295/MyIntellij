package review.class08;

public class AnotherHospital {
    public static void main(String[] args) {
        Doctor doc1=new Doctor( "Pietro", "Botros", "yuujj", 16);
        doc1.printInfo();//access to public
        doc1.work();//access to default
        doc1.treat("Mariam");//access to protected
        Doctor.study("GW");

    }
}

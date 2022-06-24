package review.class08;
import review.class08.Doctor;
public class Practice extends Doctor{
    Practice (String firstName, String lastName){
        super(firstName, lastName);
    }



    public static void main(String[] args) {
        Doctor doc=new Doctor("Hpix", "TYUi");
        doc.printInfo();
        doc.work();



    }
}

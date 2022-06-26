package review.class08;

public class Hospital {
    public static void main(String[] args) {
        //Doctor doc=new Doctor( "Pietro", "Botros","trutu", 10);
        //System.out.println(doc.firstName);
        //System.out.println(doc.experience);
        //System.out.println(doc.lastName);
        //System.out.println(doc.speciality);
       Doctor.hospital="Vally Health";// to access the static variable we should to use the name of
        // the class where we created
        Doctor doc=new Doctor("Pietro", "Botros", "cardiologyst", 13);
        doc.printInfo();
        doc.work();
        //create another doctor
        Doctor doc2=new Doctor("Josh", "Deo", "cardiologyst", 10);
        doc2.printInfo();
        doc2.work();
        //changing value of the static variable
        Doctor.hospital="George Washington";
        doc.work();
        doc.work();
        //changing value of the instatance variable
        doc.lastName="Obama";
        doc.printInfo();
        doc2.printInfo();
        doc.treat("Maraim");
        //accessing static methods

     Doctor.study("AMU");



    }
}

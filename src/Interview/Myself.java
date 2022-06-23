package Interview;

public class Myself {
     static  void thirdLetter(String calleds) {



          for (int i = 0; i < calleds.length(); i += 3) {

              System.out.print(calleds.charAt(i));
          }
         System.out.println();

      }



    //test case below (dont change):
    public static void main(String[] args){
        thirdLetter("hello there"); //"hltr"
       thirdLetter("technology"); //"thly"
    }
}


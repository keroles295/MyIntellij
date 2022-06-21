package review.class07;

public class B13String {
    //best practice that make all of your intace variable as private
    String str;
    public B13String(String str){



        this.str=str;

    }

    //write a method that will tell me how many times the character is being repated in a String
    public int countChar(char c){
        int cout=0;
      for(char cha:str.toCharArray()){
          if(cha==c){
              cout++;
          }
      }
      return cout;
    }

    public void printChars(char c){
        int counter=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==c){
                counter++;
            }
        }
        System.out.println(c+" has appered "+counter+" inside this String "+str);
    }





}

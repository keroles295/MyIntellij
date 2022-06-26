package Interview;

public class Main2 {
    public static void main(String[] args) {
        Main2 p=new Main2();
        System.out.println(p.alpha("language"));
    }
    public String alpha(String str){
        char[] arr=str.toCharArray();
        String newStr="";
        newStr=newStr+arr[0];

        for(int i=1; i<str.length(); i++){
            if(arr[i]>arr[i-1]){
                newStr=newStr+arr[i];

            }
        }
        return newStr;
    }





}
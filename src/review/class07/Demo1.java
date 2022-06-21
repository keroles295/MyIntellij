package review.class07;

public class Demo1 {
 public static void main(String[] args) {
  char[] arr={'a', 'b', 'h', 'o'};
  String str=new String(arr);
  System.out.println(str);
  int[] arr2={65,66,67,68,69};
  String str2=new String(arr2, 0,  4);
  System.out.println(str2);

  String name="Pitro Botros Ataba";
  if (name.length()>10){
   System.out.println("Please use shorter name");
  }else{
   System.out.println("Your name has been accepted");
  }


 }
}

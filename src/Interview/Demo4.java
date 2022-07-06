package Interview;
import java.util.Scanner;


import java.util.*;

public class Demo4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        scanner.nextInt();
        ArrayList<Integer>num=new ArrayList<Integer>();
        while(scanner.hasNextInt()){
            num.add(scanner.nextInt());
        }
            for (Integer integer : num) {
                System.out.print(integer+" ");
            }









    }
    }


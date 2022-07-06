package Interview;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Demoo1 {
    //my way to remove the deplicate from array
    public static void main(String[] args) {
        String [] arr={"Koko", "Koko", "Pito", "Nizp", "Pito"};
        for (String s : arr) {
            System.out.println("s = " + s);
        }
        LinkedHashSet<String> hashSet=new LinkedHashSet<>();
        hashSet.addAll( Arrays.asList(arr) );
        arr= new String[]{String.valueOf(hashSet)};

        for (String s : arr) {
            System.out.println("array after remove = " + s);
        }





    }
}

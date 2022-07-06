package Interview;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class REpl195 {
    //Create the HashSet with list of Integers add the below numbers for the list
    public static void main(String[] args) {
        LinkedHashSet<String>values=new LinkedHashSet<>();
        values.add("third");
        values.add("first");
        values.add("second");
        System.out.println( values);
        values.clear();
        System.out.println(values);
    }
}

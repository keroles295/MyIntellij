package Interview;

import java.util.ArrayList;
import java.util.List;

public class Repl190 {
    public static void main(String[] args) {
        List<Integer> fibona=new ArrayList<>();
        Integer t1=0; Integer t2=1; Integer num=10;
        Integer t3;
        fibona.add(t1);
        fibona.add(t2);

        for(int i=2; i<num; i++){
          t3=t1+t2;
          fibona.add(t3);
          t1=t2;
          t2=t3;

        }
        for (Integer integer : fibona) {
            System.out.print(integer+" ");
        }
    }
}

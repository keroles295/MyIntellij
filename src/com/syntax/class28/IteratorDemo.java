package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hope");
        words.add("Play");
        words.removeIf( nat -> nat.endsWith("e"));
//        words.add("come");
//        words.add("frame");
//        words.add("game");
        //Never use loops simple for loop Enhased for loop or while loop whenever you are planning to use any method
        //that can change the size of the list
//        for(String word:words){
//            if(word.endsWith("e")){
//                words.remove(word);
//            }
//        }
//        for(int i=0; i< words.size(); i++){
//            if(words.get(i).endsWith("e")){
//                words.remove(i);
//            }
//        }
//        System.out.println(words);
        Iterator<String> iterator1 = words.iterator();
//        System.out.println(iterator1.hasNext());
//        System.out.println(iterator1.next());
//        System.out.println(iterator1.hasNext());
//        System.out.println(iterator1.next());
//        System.out.println(iterator1.hasNext());
//        System.out.println(iterator1.next());
        words.add("come");
        words.add("frame");
       words.add("game");
//        while (iterator1.hasNext()){
//     //       System.out.println(iterator1.next());
//            if(iterator1.next().endsWith("e")){
//                iterator1.remove();
//            }
//        }
        //System.out.println(iterator.next());
        //   words.removeIf( nat -> nat.endsWith("e"));
        System.out.println(words);

    }
}
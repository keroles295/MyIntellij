package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {

        List<String>names=new ArrayList<>();
        names.add("Bro");
        names.add("Pito");
        names.add("Maro");
        names.add("Lolo");
        names.add("Mizor");
        //those operation which can chang the size of the collection are not allowed to be used for

        /*for(String name:names){
            names.remove(name);
        }*/
        Iterator<String > iterator= names.iterator();
        while (iterator.hasNext()){
            System.out.println();
        }


    }
}

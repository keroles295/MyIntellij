package com.syntax.class22;

import java.security.cert.CertPathValidatorException;

public class THW1WithAs {
    static void are(double length, double width) {
        System.out.println("Area =" + (length * width));
    }

    static void are(double length) {
        System.out.println("Area =" + (length * length));
    }

    static void volume(double length, double width, double hi) {
        System.out.println("Area =" + (length * width * hi));
    }

    public static void main(String[] args) {
       are(23);
       are(23.4, 42.1);
       volume(2.1, 3.7, 86.8);


    }
}
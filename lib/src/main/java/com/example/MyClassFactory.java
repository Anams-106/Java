package com.example;

/**
 * Created by Anamika Singh on 29-04-2018.
 */
public class MyClassFactory {
    public MySuperClass makeMyClass(String input) {
        if (input.equalsIgnoreCase("A")) {
            return new SubA("A sub class", 3);
        } else if (input.equalsIgnoreCase("B")) {
            return new SubB("B sub class", 2);
        } else if (input.equalsIgnoreCase("C")) {
            return new SubC("C sub class", 1);
        } else {
            System.out.println("Enter valid inpput (a/b/c or A/B/C)");
            return null;
        }
    }
}

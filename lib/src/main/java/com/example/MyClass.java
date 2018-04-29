package com.example;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] arg) {
        System.out.println("Hello Anamika");
        Scanner input = new Scanner(System.in);
        while(input.hasNextLine()) {
            String userInput = input.nextLine();
            System.out.println("user input :"+userInput);
            MyClassFactory factory = new MyClassFactory();
            MySuperClass myClass = null;
            myClass = factory.makeMyClass(userInput);
            if (myClass == null) {
                System.out.println("invalid entry");
            } else {
                myClass.displayCurrentClass();
            }
        }
    }
}

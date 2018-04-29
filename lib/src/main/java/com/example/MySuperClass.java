package com.example;

/**
 * Created by Anamika Singh on 29-04-2018.
 */
public class MySuperClass {
    String className;
    int priority;
    public String getName() {
        return className;
    }
    public int getPriority() {
        return priority;
    }
    public void setName(String name) {
        className = name;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }
    public void displayCurrentClass() {
        System.out.println("current class = "+className+" and its priority is = "+priority);
    }
}

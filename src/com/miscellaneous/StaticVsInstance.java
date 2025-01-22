package com.miscellaneous;

//Write a program to demonstrate static and instance variables.

public class StaticVsInstance {
    static int staticVar = 0; // Static variable
    int instanceVar = 0;     // Instance variable

    public void increment() {
        staticVar++;  // Shared across all objects
        instanceVar++; // Unique to each object
    }

    public static void main(String[] args) {
        StaticVsInstance obj1 = new StaticVsInstance();
        StaticVsInstance obj2 = new StaticVsInstance();

        obj1.increment();
        obj1.increment();

        obj2.increment();

        System.out.println("obj1 - Static Var: " + obj1.staticVar + ", Instance Var: " + obj1.instanceVar);
        System.out.println("obj2 - Static Var: " + obj2.staticVar + ", Instance Var: " + obj2.instanceVar);
    }
}

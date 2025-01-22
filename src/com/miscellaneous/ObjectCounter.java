package com.miscellaneous;

public class ObjectCounter {
    static int objectCount = 0; // Static variable to count objects

    // Constructor
    public ObjectCounter() {
        objectCount++; // Increment count whenever a new object is created
    }

    public static void main(String[] args) {
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();

        System.out.println("Total objects created: " + ObjectCounter.objectCount);
    }
}

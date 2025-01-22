package com.miscellaneous;

public class StringBufferInMultithreading {
    public static void main(String[] args) {
        StringBuffer sharedBuffer = new StringBuffer(); // Shared resource

        // Thread 1 task
        Runnable task1 = () -> {
            for (int i = 0; i < 5; i++) {
                sharedBuffer.append("Thread1 ");
            }
        };

        // Thread 2 task
        Runnable task2 = () -> {
            for (int i = 0; i < 5; i++) {
                sharedBuffer.append("Thread2 ");
            }
        };

        // Create threads
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        // Start threads
        t1.start();
        t2.start();

        // Wait for threads to complete
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the shared buffer
        System.out.println("Final String: " + sharedBuffer.toString());
    }
}



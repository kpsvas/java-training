package com.java.training.exceptions;

public class TestThread {

    public static void main(String args[]) {

        MyThreadDemo thread1 = new MyThreadDemo("Facebook");
        thread1.start();
        MyThreadDemo thread2 = new MyThreadDemo("Twitter");
        thread2.start();
        MyThreadDemo thread3 = new MyThreadDemo("Google");
        thread3.start();

    }
}

class MyThreadDemo extends Thread {

    public MyThreadDemo(String threadName) {
        // super: Allocates a new Thread object.
        // This constructor has the same effect as Thread (null, null, name).
        super(threadName);
    }

    public void run() {

        for (int counter = 1; counter <= 5; counter++) {

            System.out.println("Loop " + counter + ": " + getName() + ", ID: " + getId() + ", State: " + getState());

            try {
                // random(): returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
                sleep((int) (Math.random() * 2000));

            } catch (InterruptedException e) {
                // printStackTrace(): Prints this throwable and its backtrace to the standard error stream.
                // This method prints a stack trace for this Throwable object on the error output stream that is the value of the field System.err.
                e.printStackTrace();
            }
        }

        //System.out.println("\n========= Test Finished for: " + getName() + ":" + getState());
    }
}


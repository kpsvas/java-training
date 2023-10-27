package com.java.training.exceptions;


//implemented by extends threads or implementing runnable interface

public class ThreadDemo extends Thread {

    public void run() {
        System.out.println("This code is running in a thread");
    }

    public static void main(String[] args) {

        ThreadDemo thread = new ThreadDemo(); // new thread created
        thread.start(); // thread entering to start state
        // invoke runnable -> run() will method be called. that's mean it is in run state

        System.out.println("This code is outside of the thread");
    }

}
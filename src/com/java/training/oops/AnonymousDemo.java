package com.java.training.oops;

// Java Program to Demonstrate Anonymous inner class

// Interface
interface Age {
    int x = 21;
    void getAge();
}

// Main class
class AnonymousDemo {

    // Main driver method
    public static void main(String[] args)
    {

        // Myclass is hidden inner class of Age interface
        // whose name is not written but an object to it
        // is created.
        Age oj1 = new Age() {

            @Override public void getAge()
            {
                // printing  age
                System.out.print("Age is " + x);
            }
        };

        oj1.getAge();
    }
}


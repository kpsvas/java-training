package com.java.training.oops;

// Java Program to Demonstrate Anonymous inner class

// Interface
abstract class Age {
    int x = 21;
    abstract void displayAge();
}

// Main class
class AnonymousDemo {

    // Main driver method
    public static void main(String[] args)
    {

        // Myclass is hidden inner class of Age interface
        // whose name is not written but an object to it
        // is created.
        Age age1 = new Age() {
            public void displayAge()
            {
                // printing  age
                System.out.print("Age is x ");
            }

        };
        age1.displayAge();
    }
}



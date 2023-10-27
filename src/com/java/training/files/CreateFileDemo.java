package com.java.training.files;

import java.io.File;  // Import the File class
import java.io.FileReader;
import java.io.FileWriter;

import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;

public class CreateFileDemo {

    public static void main(String[] args) {

        try {
            // to create a new file.
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {

                System.out.println("File created: " + myObj.getName());
                
                //to create file writer object, we need to pass file object
                FileWriter myWriter = new FileWriter(myObj);
                System.out.println("Writing content to file name :" +myObj.getName());

                // writer method will data into file.
                myWriter.write("Testing file writer use cases! using Scanner Class.");
                // add more content
                myWriter.close();

                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
                myReader.close();

               /* System.out.println("Now, it is reading file content from :" +myObj.getName());
                FileReader myReader = new FileReader(myObj);
                int i;
                while ((i = myReader.read()) != -1) {
                    System.out.print((char)i);
                }
                myReader.close();*/
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

/*


 */
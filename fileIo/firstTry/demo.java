package firstTry;

import java.io.PrintWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;
import java.net.URL;
import java.io.FileOutputStream;


public class demo{
    public static void main(String args[]) throws IOException{
        File path = new File("Hello.txt"); //This will create a path. Not an actual file!
        System.out.println("We got a file!" + path);
        System.out.println("Does it exist? " + path.exists()); //This will ask if the path to the file specified exists
        System.out.println("Wat? " + path.isDirectory()); //This will ask if the path leads to a directory

        //Streams
        String contentsToWrite = "Hello World"; //The stuff to write inside the new file
        OutputStream outStream = new FileOutputStream(path); //this will create a fill output stream enabling it to write to a file specified
        outStream.write(contentsToWrite.getBytes());//This will write information to the file by using bytes
        outStream.close(); //This will deconstruct the output stream to the file and release any system information assossiated with it (i.e the file)

        System.exit(0);
    }
}
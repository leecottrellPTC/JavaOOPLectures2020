/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwritefiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lee_c
 */
public class WriteFile {

    static String fname, lname, username, password;
    static Scanner keyboard = new Scanner(System.in);
    static Random rnd = new Random();

    /**
     * @param args the command line arguments
     */

    static void getData() {
        System.out.println("Enter your first name");
        fname = keyboard.nextLine();
        System.out.println("Enter your last name");
        lname = keyboard.nextLine();

        username = fname.substring(0, 1) + lname;
        password = lname.substring(0, 2) + fname.substring(0, 2) + (rnd.nextInt(90) + 10);

    }

    static void writeToFile() {

        String fileName = "c:\\data\\password.txt";
        String outputLine;
        try {
            File file = new File(fileName);
            
            //FileWriter fileOut = new FileWriter(file);
            FileWriter fileOut = new FileWriter(file, true);
            //outputLine = username + ", " + password;
            outputLine = username + ", " + password + "\n";
            
            fileOut.write(outputLine);
            fileOut.flush();
            fileOut.close();
        } catch (IOException ex) {
            System.out.println("Cannot write password file");
            return;
        }

    }

    public static void main(String[] args) {
        // TODO code application logic here
        getData();
        writeToFile();
    }

}

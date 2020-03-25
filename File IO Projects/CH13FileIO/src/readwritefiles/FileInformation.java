/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwritefiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Demonstrate paths
 *
 * @author lee_c
 */
public class FileInformation {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Integer> temps = new ArrayList<Integer>();
    static FileSystem fs;
    static Path pathToFile;
    static File theFile;
    static BasicFileAttributes attributes;
    static InputStream tempIn = null;
    static BufferedReader tempReader;
    static int total = 0, avg = 0, max = 0, min = 100;

    public static void openFile() {
        fs = FileSystems.getDefault();//allows access to disk
        pathToFile = fs.getPath("c:\\data\\temperatures.txt");
        try {
            //notice the \\
            tempIn = Files.newInputStream(pathToFile);
            tempReader = new BufferedReader(new InputStreamReader(tempIn));
            
        } catch (IOException ex) {
            System.out.println("Cannot open " + pathToFile.getFileName());
            return;
        }

    }//end of openFile

    public static void displayFileInfo() {
        System.out.println(pathToFile.getFileName());
        System.out.println(pathToFile.getParent()); //folder on disk
        try {
            attributes = Files.readAttributes(pathToFile, BasicFileAttributes.class);
            System.out.println(attributes.size() + " bytes");
            System.out.println(attributes.lastModifiedTime());
        } catch (IOException ex) {
            //fires if file does not exist or is write protected
            System.out.println("Attributes cannot be read of " + pathToFile.getFileName());
            return;
        }

    }//end of displayFileInfo

    static void processFile() {
        int tempValue;
        String line;
        try {
            while ((line = tempReader.readLine()) != null) {
                //System.out.println(line);
                try {
                    tempValue = Integer.parseInt(line);
                    temps.add(tempValue);
                    total += tempValue;
                    if (tempValue > max) {
                        max = tempValue;
                    }
                    if (tempValue < min) {
                        min = tempValue;
                    }
                } catch (NumberFormatException numberFormatException) {
                    //skip the error
                    System.out.println(line + " is invalid");
                }

            }//end of the while
            avg = total / temps.size();
        } catch (IOException ex) {
            System.out.println("File cannot be read " + pathToFile.getFileName() + ex.toString());
        }
    }//end of file process

    public static void main(String[] args) {
        
            // TODO code applicsnipation logic here
            openFile();
            displayFileInfo();
            processFile();
            System.out.println("Average = " + avg);
            System.out.println("Min = " + min);
            System.out.println("Max = " + max);
        try {    
            tempIn.close();
        } catch (IOException ex) {
            Logger.getLogger(FileInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter8arrayslecture;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author lee_c
 */
public class PTCProgramMain {

    static PTCPrograms majors[] = new PTCPrograms[4];
    static Book compBookList[] = new Book[5];
    static Book nurseBookList[] = new Book[4];

    static void fillArrays() {
        compBookList[0] = new Book("Java", "person", 0, 0);
        compBookList[1] = new Book("Office", "person", 0, 0);
        compBookList[2] = new Book("Android", "person", 0, 0);
        compBookList[3] = new Book("C++", "person", 0, 0);
        compBookList[4] = new Book("Unity", "person", 0, 0);

        nurseBookList[0] = new Book("CPR", "person", 0, 0);
        nurseBookList[1] = new Book("First Aid", "person", 0, 0);
        nurseBookList[2] = new Book("Medicine", "person", 0, 0);
        nurseBookList[3] = new Book("Anatomy", "person", 0, 0);

        //use the default book list
        majors[0] = new PTCPrograms("Business", "Dr. Wertz");
        majors[1] = new PTCPrograms("Hospitality", "Mrs. Boff");
        majors[2] = new PTCPrograms("Computer Programming", "Dr. Scarpino", compBookList);
        majors[3] = new PTCPrograms("Nursing", "Mrs. Kirshner", nurseBookList);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //build a menu driven system to display the programs
        fillArrays();
        Scanner keyboard = new Scanner(System.in);
        int choice = 0;
        do {
            //display the program names
            System.out.println("Enter your choice  (-1 to quit)");
            for (int x = 0; x < majors.length; x++) {
                System.out.println(x + " for " + majors[x].getProgramName());
            }
            //demo entering character
            try {
                choice = keyboard.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Please enter numbers between -1 and " + majors.length);
                choice = majors.length; //guarantee to allow the loop to repeat without causing an error
                String error = keyboard.nextLine(); //get the error
            }

            //show what happens with bad input before moving on
            if (choice >= 0 && choice < majors.length) {
                System.out.println(majors[choice]);
            }
            System.out.println("---------------------------------------------------------------------------");

        } while (choice != -1);

    }

}

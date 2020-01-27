
package chapter7lecture;

import java.util.Scanner;

/**
 *This program will allow the user to enter a sentence. 
 * Once entered, the program will display the number of letters, spaces, numbers, and other.
 * I use a class because that is how it should be done.
 * This program will use both the String class and Character classes
 * I will control the program using a while loop
 * @author lee_c
 */
public class LetterCounterMain {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String inputString;
       Scanner keyboard = new Scanner(System.in);
       do{
           
           //sentinal loop until user enters Done
           //look at the methods that drop
           System.out.println("Please enter a sentence. Type Done to quit");
           inputString = keyboard.nextLine();
           if(inputString.equalsIgnoreCase("done")){
               //ignore 
           }
           else{
                   System.out.println("You entered " + inputString);
                   LetterCount stats = new LetterCount(inputString);
                   System.out.println(stats.toString());
           }
 
       }while(!inputString.equalsIgnoreCase("Done"));
    }
    
}

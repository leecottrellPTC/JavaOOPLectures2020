package chapter9lecture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * This program will build lists by length of word. Duplicate words will not be
 * permitted. It will then sort and display the lists.
 *
 * @author lee_c
 */
public class BuildWordListByLength {

    ArrayList<String> shortWords = new ArrayList<String>();
    ArrayList<Integer> numbers = new ArrayList<Integer>();//must be a class with a constructor
    ArrayList<String> longWords = new ArrayList<String>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> shortWords = new ArrayList<String>();
        ArrayList<Integer> numbers = new ArrayList<Integer>();//must be a class with a constructor
        ArrayList<String> longWords = new ArrayList<String>();

        String input;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println("Enter a word, 'done' to quit");
            input = keyboard.nextLine().toLowerCase();
            System.out.println(input.length());
            if (input.length() < 6) {
                if (!shortWords.contains(input)) {
                    shortWords.add(input);
                }
            }   //if length < 6
            if (input.length() >= 6) {
                if (!longWords.contains(input)) {
                    longWords.add(input);
                }
            }//if length >= 6
        } while (!input.equals("done"));

        shortWords.remove("done");
        //sort using collections class
        Collections.sort(shortWords);
        Collections.sort(longWords);

        //display the arraylist
        System.out.println(shortWords.size() + " short words entered");
        for (int w = 0; w < shortWords.size(); w++) {
            System.out.println(shortWords.get(w));
        }

        System.out.println(longWords.size() + " long words entered");
        for (int w = 0; w < longWords.size(); w++) {
            System.out.println(longWords.get(w));
        }

        System.out.println("Bye Bye");
    }

}

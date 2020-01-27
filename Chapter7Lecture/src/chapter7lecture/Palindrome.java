package chapter7lecture;

import java.util.Scanner;

/**
 * Determines if a string is a palindrome Utilizes string class racecar madam
 * i'm adam able was i ere i saw elba
 *
 * @author lee_c
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    private static String phrase, fixedPhrase;
    private static Scanner keyboard = new Scanner(System.in);

    public static void fixString() {
        //remove spaces and punctuation
        //lower case the entire string
        fixedPhrase = phrase.toLowerCase().replaceAll(" ", "");//lose the spaces and lowercase
        //you can chain string functions
        //could do all of these at once
        fixedPhrase = fixedPhrase.replaceAll("'","" );
        fixedPhrase = fixedPhrase.replaceAll("\\.", "");//lose the .
            //need to escape the . otherwise the . replaces all chars from reg expression
        
    }
            

    public static boolean isPalindrome() {
        //walk backwards through phrase and build reverse one letter at a time
        String reverse = "";
        for (int c = fixedPhrase.length() - 1; c >= 0; c--) {
            reverse += fixedPhrase.charAt(c);    //concatenate the letter to the end
        }

        return reverse.equals(fixedPhrase);
    }

    public static void main(String[] args) {
        //logic, remove spaces and punctuation
        System.out.println("Enter a phrase");
        phrase = keyboard.nextLine();
        fixString();

        if (isPalindrome()) {
            System.out.println(phrase + " is a palindrome");
        } else {
            System.out.println(phrase + " is NOT a palindrome");
        }

    }

}

package chapter7lecture;

import java.util.Scanner;

/**
 *This program introduces students to Regular Expressions in Java
 * The program will ask input and verify that it matches the correct format
 * Use regexlib.com to simplify your life
 * @author lee_c
 */
public class RegExExample {

    /**
     * @param args the command line arguments
     */
    public static String numbers;
    public static Scanner keyboard = new Scanner(System.in);
    
    public static void getNumbersOnly(){
        //http://regexlib.com/Search.aspx?k=numbers+only&c=-1&m=-1&ps=20
        do{
            System.out.println("Enter a string of just numbers");
            numbers = keyboard.nextLine();
        }while(!numbers.matches("^[+]?\\d*$"));
    }
    
    public static boolean verifySSN(String SSN){
        if(SSN.matches("^\\d{3}-\\d{2}-\\d{4}$")){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
       // getNumbersOnly();
        if(verifySSN("123-456-6789")){
            System.out.println("Valid SSN");
        }
        else{
            System.out.println("Not a valid SSN");
        }
        
    }
    
}

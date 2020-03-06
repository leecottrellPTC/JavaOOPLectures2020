/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author lee_c
 */
public class Chapter12ExceptionHandling {

    static String input;
    static int number;
    static Scanner keyboard = new Scanner(System.in);
    static int total = 0;

    public static void inputData1() {
        //input numbers, on input error set the number to 0
        //look at p616
        System.out.println("Enter an integer number");
        try {
            number = keyboard.nextInt();//throws a InputMismatchException
        } catch (InputMismatchException ime) {
            System.out.println(ime.toString() + "\nNumber converted to 0");
            number = 0;
        } finally {
            total += number;
        }
    }

    public static void inputData2() {
        //input data as a string
        System.out.println("Enter an integer number");
        input = keyboard.nextLine();
        //after 2 examples, show the surround with example
        try {
            number = Integer.parseInt(input);
        } catch (NumberFormatException numberFormatException) {
            //check to see if input starts with a digit
            System.out.println(numberFormatException.getMessage());//sometimes you get a message
            number = 0;
        } finally {
            //executes regardless of try or cath executiny
            total += number;
        }

    }

    public static void inputData3() {
        //loop to get valid input
        boolean bad = false;
        do {
            bad = false;
            System.out.println("Enter  number");
            input = keyboard.nextLine();
            //after 2 examples, show the surround with example
            try {
                number = Integer.parseInt(input);
            } catch (NumberFormatException numberFormatException) {
                //check to see if input starts with a digit
                number = 0;
                bad = true;
            } finally {
                //executes regardless of try or cath executiny
                total += number;
            }
        } while (bad);
    }

    //having a method throw an exception
    //the idea is to simply throw the exception back to the calling program
    //let the programmer handle it
    public static void inputData4() throws NumberFormatException {
        System.out.println("Enter  number");
        input = keyboard.nextLine();
        number = Integer.parseInt(input);
    }

    public static void inputData5() throws NegativeNumberException{
        System.out.println("Enter  number");
        input = keyboard.nextLine();
        number = Integer.parseInt(input);
        if(number < 0){
            number = 0;
            
            //throw(new NegativeNumberException());
            throw(new NegativeNumberException("Dude, positive numbers only"));
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      //  inputData1();
      //  keyboard.nextLine();
        //inputData3();
      //  System.out.println("Value in number " + number);
      //  System.out.println("Total is " + total);
        
        try {
            inputData5();
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Error found with " + numberFormatException.getMessage());
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }

    }

}

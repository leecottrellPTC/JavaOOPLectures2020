package chapter8arrayslecture;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * This program shows how to use an array. I will enter values, then randomly
 * fill
 *
 * @author lee_c
 */
public class DemoSimpleArray {

    static Random rnd = new Random();
    static double numbers[] = new double[50];
    static Scanner keyboard = new Scanner(System.in);
    static String output ="";   //use for simple output

    public static void fillArray() {
        //first do as input, then do with Random numbers just to simplfy runs
        for (int n = 0; n < numbers.length; n++) {
            //System.out.print("Enter number " + n + " -> ");
            //numbers[n] = keyboard.nextDouble();
            numbers[n] = rnd.nextDouble()*100;  //generate between 0 and 99
        }
    }

    public static void printArray() {
        
        for (int n = 0; n < numbers.length; n++) {
            output = String.format("%5d %7.2f", n, numbers[n]);
            System.out.println(output);
        }
    }

    public static double averageArray(){
        //how calc average
        double total = 0;
        for (int n = 0; n < numbers.length; n++) {
            total += numbers[n];
        }
        return total / numbers.length;
    }
    
    public static void showNumbersAbove(double num){
        System.out.println("Numbers above " + num);
        for (int n = 0; n < numbers.length; n++) {
            if(numbers[n] > num){
                output = String.format("%.3f", numbers[n]);
                System.out.println(output);
            }
        }
    }
    public static void main(String[] args) {
        // do basic Array first, then sort, then other processing
        double avg;
        
        fillArray();
        Arrays.sort(numbers);
        printArray();
        avg = averageArray();

        output = String.format("Average of array is %.2f", avg);
        System.out.println(output);
        
        showNumbersAbove(90);
        
        

    }

}

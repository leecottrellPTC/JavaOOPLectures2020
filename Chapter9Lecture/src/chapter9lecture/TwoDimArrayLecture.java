package chapter9lecture;

import java.util.Scanner;

/**
 * Create a two dimensional array to store two temperatures in a day
 *
 * @author lee_c
 */
public class TwoDimArrayLecture {

    static Scanner keyboard = new Scanner(System.in);
    static double temperatures[][] = new double[7][2];//7 days, 2 temps - morning, night
    //book does double [][] temperatures = new double[7][2];//7 days, 2 temps - morning, night

    public static void fillArrayValues() {
        temperatures[0][0] = 75;
        temperatures[0][1] = 93;
        temperatures[1][0] = 82;
        temperatures[1][1] = 72;
        temperatures[2][0] = 93;
        temperatures[2][1] = 108;
        temperatures[3][0] = 36;
        temperatures[3][1] = 82;
        temperatures[4][0] = 23;
        temperatures[4][1] = 47;
        temperatures[5][0] = 31;
        temperatures[5][1] = 50;
        temperatures[6][0] = 77;
        temperatures[6][1] = 53;

    }

    public static void showArray() {
        int row;
        int col;

        for (row = 0; row < 7; row++) {
            System.out.printf("%2d | ", row);
            for (col = 0; col < 2; col++) {
                System.out.printf("%8.2f | ", temperatures[row][col]);
            }
            System.out.print("\n");
        }
    }

    public static void fillArrayPrompt() {
        int row;
        int col;
        for (row = 0; row < 7; row++) {
            for (col = 0; col < 2; col++) {
                System.out.printf("Enter row %d col %d-->", row, col);
                temperatures[row][col] = keyboard.nextInt();
            }//end col
        }//end row
    }
    
    //example of processing array
    public static void differenceInTemps(){
        double diff;
        for(int row=0; row < 7; row ++){
            System.out.printf("%2d difference = ", row);
            
                //diff = temperatures[row][1] - temperatures[row][0];
                diff = Math.abs(temperatures[row][1] - temperatures[row][0]);
                System.out.printf("%6.2f\n", diff);
    
        }//end row
    }
public static void showATemp(){
    int day = 1, col = 0;
        System.out.println("Enter day (0-6) and column (0-1) to show");
        day = keyboard.nextInt();
        col = keyboard.nextInt();
        if ((day >= 0 && day < 7) && (col >= 0 && col < 2)) {
            System.out.println("Temp is " + temperatures[day][col]);
        }
}
    /**
     * Array of arrays columns will be temperatures rows will be the days in the
     * week (eventually year) program will allow you to find temps ona day
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // fillArrayPrompt();
        fillArrayValues();
        showArray();
        differenceInTemps();
        
        //show a particular day
        showATemp();

    }

}

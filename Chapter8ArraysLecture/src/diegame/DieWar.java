/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegame;

import java.util.Scanner;

/**
 *
 * @author lee_c
 */
public class DieWar {

    static Die player1[] = new Die[5];
    static Die player2[] = new Die[5];

    static int player1Counts[] = new int[7];   //0 will be unused
    static int player2Counts[] = new int[7];
    static Scanner keyboard = new Scanner(System.in);

    public static void rollTheDice() {
        for (int x = 0; x < player1.length; x++) {
            player1[x] = new Die();
            player2[x] = new Die();
        }
    }

    public static void showDice(Die diceHand[]) {
        for (int x = 0; x < diceHand.length; x++) {
            System.out.print(diceHand[x].getDieValue() + " ");
        }
        System.out.println();
    }

    public static void countDice() {
        //reset the counter - run once before resetting
        for (int x = 0; x < player1Counts.length; x++) {
            player1Counts[x] = 0;
            player2Counts[x] = 0;
        }
        for (int x = 0; x < player1.length; x++) {
            player1Counts[player1[x].getDieValue()]++;
            player2Counts[player2[x].getDieValue()]++;
        }
    }

    public static void showCounts(int dieCount[]){
        String output;
         for (int x = 1; x < dieCount.length; x++) {
             output = String.format("%d = %d; ", x, dieCount[x]);
             System.out.print(output);
         }
         System.out.println();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String keepPlaying = "yes";

        do {

            rollTheDice();
            System.out.print("Player 1: ");
            showDice(player1);

            System.out.print("Player 2: ");
            showDice(player2);

            countDice();
            System.out.print("Player 1: ");
            showCounts(player1Counts);

            System.out.print("Player 2: ");
            showCounts(player2Counts);
            
            System.out.println("Keep playing? ");
            keepPlaying = keyboard.nextLine().toLowerCase();
        } while (keepPlaying.startsWith("y"));
        System.out.println("Bye Bye!");
    }

}

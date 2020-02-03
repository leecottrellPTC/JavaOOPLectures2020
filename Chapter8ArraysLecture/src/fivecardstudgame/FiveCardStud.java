/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//Modify Deck, create getCardNum, hide values in showCard
package fivecardstudgame;

import java.util.Scanner;

/**
 *
 * @author leecottrell
 */
public class FiveCardStud {

    static final int NUMCARDS = 5;
    static Card player[] = new Card[NUMCARDS];
    static Card dealer[] = new Card[NUMCARDS];
    static Deck theDeck = new Deck();
    static int topOfDeck = 0;
    //  static int playerCount[][] = new int[5][15];//same structure as deck
    //  static int dealerCount[][] = new int[5][15];//same structure as deck
    static int playerAnalysis[] = new int[10];
    static int dealerAnalysis[] = new int[10];
    static int playerSuitTotals[] = {0, 0, 0, 0, 0};
    static int dealerSuitTotals[] = {0, 0, 0, 0, 0};
    static int playerCountCards[] = {0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0};//15 0
    static int dealerCountCards[] = {0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 0, 0, 0, 0, 0, 0};//15 0
    static int dealt = 0;
    static final int ROYAL = 0;
    static final int STRAIGHTFLUSH = 1;
    static final int FOUR = 2;
    static final int FULL = 3;
    static final int FLUSH = 4;
    static final int STRAIGHT = 5;
    static final int THREE = 6;
    static final int TWO = 7;
    static final int PAIR = 8;
    static final int HIGH = 9;
    static Scanner keyboard = new Scanner(System.in);

    public static void checkHands() {

        /*for (int s = 0; s < 5; s++) {
        for (int c = 0; c < 15; c++) {
        playerCount[s][c] = 0;
        dealerCount[s][c] = 0;
        }
        }*/

        System.out.println("\n\nChecking hands...");
        for (int c = 0; c < 10; c++) {
            playerAnalysis[c] = 0;
            dealerAnalysis[c] = 0;
        }
        //count all cards
        for (int c = 0; c < dealt; ++c) {
            /*playerCount[
            player[c].getSuitValue()][player[c].getCardValue()] = 1;
            dealerCount[
            dealer[c].getSuitValue()][dealer[c].getCardValue()] = 1;*/
            playerSuitTotals[player[c].getSuitValue()] += 1;
            dealerSuitTotals[dealer[c].getSuitValue()] += 1;
            playerCountCards[player[c].getCardValue()] += 1;
            dealerCountCards[dealer[c].getCardValue()] += 1;

        }
        for (int c = 2; c < 15; c++) {
            if (playerCountCards[c] == 2) {

                if (playerAnalysis[PAIR] == 0) {
                    playerAnalysis[PAIR] = c;//hold onto the value
                    System.out.println("Player has a pair");
                } else {
                    playerAnalysis[TWO] = c;//hold onto the value
                    System.out.println("Player has two pair");
                }
            }
            if (playerCountCards[c] == 3) {
                System.out.println("Player has three of a kind");
                playerAnalysis[THREE] = c;
            }
            if (playerCountCards[c] == 4) {
                System.out.println("Player has four of a kind");
                playerAnalysis[FOUR] = c;
            }


            //check for pairs....
            if (dealerCountCards[c] == 2) {

                if (dealerAnalysis[PAIR] == 0) {
                    dealerAnalysis[PAIR] = c;//hold onto the value
                    System.out.println("dealer has a pair");
                } else {
                    dealerAnalysis[TWO] = c;//hold onto the value
                    System.out.println("dealer has two pair");
                }
            }
            if (dealerCountCards[c] == 3) {
                System.out.println("dealer has three of a kind");
                dealerAnalysis[THREE] = c;
            }
            if (dealerCountCards[c] == 4) {
                System.out.println("dealer has four of a kind");
                dealerAnalysis[FOUR] = c;
            }

        }//end for pairs

        //check full house
        if (playerAnalysis[PAIR] > 0 && playerAnalysis[THREE] > 0) {
            System.out.println("Player has a full house");
            playerAnalysis[FULL] = playerAnalysis[THREE];
        }

        if (dealerAnalysis[PAIR] > 0 && dealerAnalysis[THREE] > 0) {
            System.out.println("Dealer has a full house");
            dealerAnalysis[FULL] = dealerAnalysis[THREE];
        }

        //check for flush
        for (int c = 0; c < 5; c++) {
            if (dealerSuitTotals[c] == 5) {
                System.out.println("Dealer has a flush");
                dealerAnalysis[FLUSH] = c;
            }

            if (playerSuitTotals[c] == 5) {
                System.out.println("Player has a flush");
                playerAnalysis[FLUSH] = c;
            }
        }//end flush

        //check for straight
        for (int c = 0; c < 15; c++) {
              if (playerCountCards[c] == 1) {
                if (playerCountCards[c + 1] == 1 
                        && playerCountCards[c + 2] == 1
                        && playerCountCards[c + 3]== 1 
                        && playerCountCards[c + 4]== 1) {
                    System.out.println("Player has a straight");
                    playerAnalysis[STRAIGHT] = c + 4;
                  
                }//end if
                
            }
             
             if (dealerCountCards[c] == 1) {
                if (dealerCountCards[c + 1] == 1 
                        && dealerCountCards[c + 2] == 1
                        && dealerCountCards[c + 3]== 1 
                        && dealerCountCards[c + 4]== 1) {
                    System.out.println("Dealer has a straight");
                    dealerAnalysis[STRAIGHT] = c + 4;
                    
                }//end for
              
            }
        }//end straight
        
        //check for straight flush
        if(playerAnalysis[FLUSH] > 0 && playerAnalysis[STRAIGHT] > 0){
            System.out.println("Player has a straight flush");
                   playerAnalysis[STRAIGHTFLUSH] = playerAnalysis[STRAIGHT];
        }
        
        if(dealerAnalysis[FLUSH] > 0 && dealerAnalysis[STRAIGHT] > 0){
            System.out.println("Dealer has a straight flush");
                    dealerAnalysis[STRAIGHTFLUSH] =dealerAnalysis[STRAIGHT];
        }
        
        //end straight flush
        
        //check for royalFlush
        if(playerAnalysis[STRAIGHTFLUSH] == 14){
            System.out.println("Player has a royal flush");
                   playerAnalysis[ROYAL] = 14;
        }
        
         if(dealerAnalysis[STRAIGHTFLUSH] == 14){
            System.out.println("Dealer has a royal flush");
                   dealerAnalysis[ROYAL] = 14;
        }
    }

    public static void newHand() {
        for (int c = 0; c < NUMCARDS; c++) {
            player[c] = new Card();
            dealer[c] = new Card();
        }
        theDeck.shuffle();

    }

    public static void deal(int cards) {
        //  int cardCounter = theDeck.getCardNum();
        for (int c = dealt; c < dealt + cards; c++) {

            player[c] = theDeck.nextCard();

            dealer[c] = theDeck.nextCard();

            //   cardCounter = theDeck.getCardNum();
        }

        dealt = theDeck.getCardNum() / 2;
    }


    public static void showHands() {
        System.out.println("Dealer Cards");
        System.out.println("Card Back");
        System.out.println("Card Back");
        for (int c = 2; c < dealt; c++) {
            System.out.println(dealer[c].toString());
        }

        System.out.println("Player Cards");
        for (int c = 0; c < dealt; c++) {
            System.out.println(player[c].toString());
        }
    }

    public static void revealHands() {
        System.out.println("Dealer Cards");
        for (int c = 0; c < dealt; c++) {
            System.out.println(dealer[c].toString());
        }

        System.out.println("Player Cards");
        for (int c = 0; c < dealt; c++) {
            System.out.println(player[c].toString());
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int bet = 10;
        //start
        newHand();
        deal(5);//need modified for betting
       /* showHands();
        System.out.println("Enter your bet, 0 to quit");
        bet = keyboard.nextInt();
        while (dealt < 5 && bet > 0) {
        deal(1);
        showHands();
        System.out.println("Enter your bet, 0 to quit");
        bet = keyboard.nextInt();
        }
        System.out.println("Final hands");*/

        //after coding modify the methods 
        //setSuitValue, setCardValue - add this.convertCard();
        //Modify Deck, create getCardNum, hide values in showCard
        player[0].setSuitValue(1);
        player[1].setSuitValue(1);
        player[2].setSuitValue(1);
        player[3].setSuitValue(2);
        player[4].setSuitValue(1);
        
        player[0].setCardValue(10);
        player[1].setCardValue(10);
        player[2].setCardValue(10);
        player[3].setCardValue(14);
        player[4].setCardValue(14);
        
        revealHands();
        checkHands();
    }
}
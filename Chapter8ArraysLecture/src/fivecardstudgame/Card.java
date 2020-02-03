/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fivecardstudgame;

/**
 *
 * @author lee_c
 */
public class Card {

    private String suit;
    private String card;
    private int cardValue;
    private int suitValue;

    //<editor-fold defaultstate="collapsed" desc="Methods">
    public void dealCard() {
        //randomly pick the card
        cardValue = (int) (Math.random() * 13 + 2); //between 2 and 14
        suitValue = (int) (Math.random() * 4 + 1);
        convertCard();
    }

    private void convertCard() {
        //do not want users using this method
        switch (suitValue) {
            case 1:
                suit = "Hearts";
                break;
            case 2:
                suit = "Diamonds";
                break;
            case 3:
                suit = "Clubs";
                break;
            case 4:
                suit = "Spades";
                break;
            default:
                suit = "Error";
                break;
        }

        switch (cardValue) {
            case 2:
                card = "Two";
                break;
            case 3:
                card = "Three";
                break;
            case 4:
                card = "Four";
                break;
            case 5:
                card = "Five";
                break;
            case 6:
                card = "Six";
                break;
            case 7:
                card = "Seven";
                break;
            case 8:
                card = "Eight";
                break;
            case 9:
                card = "Nine";
                break;
            case 10:
                card = "Ten";
                break;
            case 11:
                card = "Jack";
                break;
            case 12:
                card = "Queen";
                break;
            case 13:
                card = "King";
                break;
            case 14:
                card = "Ace";
                break;
            default:
                card = "Error";
                break;
        }
    }

    @Override
    public String toString() {
        String showHand = card + " of  " + suit;
        //showHand += "\nValues of " + cardValue + " suit value " + suitValue;
        return showHand;
    }

    public int compareCard(Card secondCard) {
        int result = 0;

        if (this.cardValue < secondCard.cardValue) {
            result = -1;
        } else if (this.cardValue == secondCard.cardValue) {
            result = 0;
        } else if (this.cardValue > secondCard.cardValue) {
            result = 1;
        }

        return result;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    public Card(int cardValue, int suitValue) {
        this.setSuitValue(suitValue);
        this.setCardValue(cardValue);
    }

    public Card() {
        suit = "Hearts";
        card = "Two";

        cardValue = 2;
        suitValue = 1;
        /*
         * 1 = Hearts
         * 2 = Diamonds
         * 3 = Clubs
         * 4 = Spades
         */

    }

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="setters and getters">
    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public int getCardValue() {
        return cardValue;
    }

    public void setCardValue(int cardValue) {
        this.cardValue = cardValue;
        convertCard();
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getSuitValue() {
        return suitValue;
    }

    public void setSuitValue(int suitValue) {
        this.suitValue = suitValue;
        convertCard();
    }

    public void setACard(int card, int suit) {
        this.setSuitValue(suit);
        this.setCardValue(card);
    }

//</editor-fold>
    
}

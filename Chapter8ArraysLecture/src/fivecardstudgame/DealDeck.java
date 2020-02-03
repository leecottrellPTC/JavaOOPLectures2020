package fivecardstudgame;

public class DealDeck {

    public static void main(String[] args) {
        Card aCard = new Card();
        Deck theDeck = new Deck();
        
        theDeck.shuffle();
        for(int deal = 0; deal < 55; deal++){
            aCard = theDeck.nextCard();
            System.out.println(aCard.toString());
        }
        
     /**   aCard = theDeck.nextCard();
        System.out.println(aCard.showCards());
        
        aCard = theDeck.nextCard();
        System.out.println(aCard.showCards());
        
        aCard = theDeck.nextCard();
        System.out.println(aCard.showCards());
        
        aCard = theDeck.nextCard();
        System.out.println(aCard.showCards());
        
        aCard = theDeck.nextCard();
        System.out.println(aCard.showCards());*/
        
    }
}
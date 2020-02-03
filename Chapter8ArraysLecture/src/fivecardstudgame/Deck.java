package fivecardstudgame;

public class Deck {

    private Card pack[] = new Card[52];
    private int cardNum = 0;
    private boolean dealt[][] = new boolean[5][15];

    public int getCardNum() {
        return cardNum;
    }

    public Deck() {
        for (int c = 0; c < 52; c++) {
            pack[c] = new Card();
            //pack[c].dealCard(); //some random cards, some repeats
        }

        for (int s = 0; s < 5; s++) {
            for (int c = 0; c < 15; c++) {
                dealt[s][c] = false;
            }
        }
    }

    public void shuffle() {
        for (int s = 0; s < 5; s++) {
            for (int c = 0; c < 15; c++) {
                dealt[s][c] = false;
            }
        }

        int suit, card;
        int deal;
        for (deal = 0; deal < 52; deal++) {
            do {
                pack[deal].dealCard();
                suit = pack[deal].getSuitValue();
                card = pack[deal].getCardValue();
            } while (dealt[suit][card] == true);

            dealt[suit][card] = true;

        }
    }

    public Card nextCard() {
        Card theCard = new Card();

        if (cardNum > 51) {
            theCard.setSuit("Nothing");
            theCard.setCard("3 and a half");
        } else {
            theCard = pack[cardNum];
            cardNum++;
        }


        return theCard;

    }
}
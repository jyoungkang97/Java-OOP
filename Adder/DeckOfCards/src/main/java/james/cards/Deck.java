/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package james.cards;
import java.util.Random;
/**
 *
 * @author jyoun
 */
public class Deck {
    Card [] deck = new Card[52];
    
    public Deck() {
        int deckCounter = 0;
        for (int i = 0; i < 4; i++) { //suit
            for (int j = 0; j < 13; j++) { //rank
                deckCounter ++;
            }
        }
    }
    public Card[] getHand(int handSize) {
        Random r = new Random();
        Card [] hand = new Card[handSize];
        for (int i = 0; i < handSize; i++) {
            Card c = deck[r.nextInt(52)];
            while (c.isUsed()) {
                c = deck[r.nextInt(52)];
            }
            c.setUsed(true);
            hand[i] = c;
        }
        return hand;
    }
    public Card [] getDeck () {
        return deck;
    }
}

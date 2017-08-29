/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package james.cards;

/**
 *
 * @author jyoun
 */
public class Card {
    private int rank;
    private int suit;
    
    private boolean used = false;
    
    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;
        
    }
    public String getRankString() {
        String retVal = "";
        switch(rank) {
            case 0:
                retVal = "Ace";
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: 
            case 6:
            case 7: 
            case 8:
            case 9:
                retVal = Integer.toString(rank + 1);
                break;
            case 10:
                retVal = "Jack";
                break;
            case 11:
                retVal = "Queen";
                break;
            case 12: 
                retVal = "King";
                break;
        }
        return retVal;
    }
    public String getSuitString() {
        String retVal = "";
        switch(suit) {
            case 0:
                retVal = "Hearts";
                break;
            case 1:
                retVal = "Diamonds";
                break;
            case 2:
                retVal = "Spades";
                break;
            case 3:
                retVal = "Clubs";
                break;      
        }
        return retVal;
    }
    public int getRank() {
        return rank;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }
    public int getSuit() {
        return suit;
    }
    public void setSuit(int suit) {
        this.suit = suit;
    }
    public boolean isUsed() {
        return used;
    }
    public void setUsed (boolean used) {
        this.used = used;
    }
    
}

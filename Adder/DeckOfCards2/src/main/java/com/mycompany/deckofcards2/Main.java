/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.deckofcards2;

/**
 *
 * @author jyoun
 */
public class Main {
    
    public static void main(String[] args) {
        Deck deck = new Deck();
        
//        for(Card c : deck.getDeck()) {
//            System.out.println(c.getRankString() + " of " + c.getSuitString());
//        }
        
        Card[] hand1 = deck.getHand(5);
        System.out.println("Hand 1");
//        for(int i = 0;i<hand1.length;i++) {
//            Card c = hand1[i];
//            System.out.println(c.getRankString() + " of " + c.getSuitString());
//        }
        
        for(Card c : hand1) {
            System.out.println(c.getRankString() + " of " + c.getSuitString());
        }

        Card[] hand2 = deck.getHand(5);
        System.out.println("");
        System.out.println("Hand 2");
        for(Card c : hand2) {
            System.out.println(c.getRankString() + " of " + c.getSuitString());
        }

        
    }
}
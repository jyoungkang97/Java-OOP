/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rockpaperscissors.players;

/**
 *
 * @author jyoun
 */
public class EnumImpl {
    Choices choices;
    
    public EnumImpl(Choices choices) {
        this.choices = choices;
    }
    public void choiceEnum() {
        switch (choice) {
            case ROCK:
                System.out.println("");
        }
    }
}

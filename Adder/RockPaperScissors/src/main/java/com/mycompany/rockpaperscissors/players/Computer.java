/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rockpaperscissors.players;

import java.util.Random;

/**
 *
 * @author jyoun
 */
public class Computer implements Player {

    public static int[] CHOICES = new int[]{Choices.ROCK, Choices.PAPER, Choices.SCISSORS};
    
    private String userComputer;
    
    public Computer(String userComputer) {
        this.userComputer = userComputer;
    }

    @Override

    public String getUser() {
        return userComputer;
    }

    @Override
    public int getChoice() {
        Random r = new Random();
        return CHOICES[r.nextInt(CHOICES.length)];
    }

}

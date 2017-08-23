/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.guessme;

import java.util.Scanner;

/**
 *
 * @author jyoun
 */
public class GuessMe {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Guess a number 1 - 100.");
        int guess = inputReader.nextInt();
        // guess = inputReader.nextInt();
        
        if (guess == 90) {
        System.out.println("genius!");  }
        else if (guess > 90) {
        System.out.println("too high!"); }
        else if (guess < 90) {
        System.out.println("Too low!");  }
        
    }
}

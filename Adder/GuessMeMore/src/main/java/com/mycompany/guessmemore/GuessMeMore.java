/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.guessmemore;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jyoun
 */
public class GuessMeMore {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        Random r = new Random();
        int answer = r.nextInt(201) - 100;
        Boolean running = true;
        
        while(running) {
        System.out.println("Guess a number -100 through 100.");
        int guess = inputReader.nextInt();
        if ( guess == answer) {
        System.out.println("genius!");  }
        else if (guess > answer) {
        System.out.println("too high!"); }
        else if (guess < answer) {
        System.out.println("Too low!");  }
        
        } running = false;
        
    }
}
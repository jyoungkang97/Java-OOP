/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jyoun
 */
public class RockPaperScissors {

    public static boolean KeepPlaying = true;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Let's play Rock, Paper, Scissors! First, what is your name?");

        String userName = sc.next();
        Random r = new Random();
        int userScore = 0;
        int computerScore = 0;
        int roundsPlayed = 0;

        while (KeepPlaying) {
            System.out.println("Hello " + userName + " Type 1 for rock, 2 for paper, or 3 for scissors");
            int userChoice = sc.nextInt();
            System.out.println("You chose: " + userChoice);
            int[] computerOptions = {1, 2, 3};
            int computerRandom = r.nextInt(computerOptions.length);
            System.out.println("The computer got : " + computerOptions[computerRandom]);
            int computerChoice = computerOptions[computerRandom];

            if (computerChoice == userChoice) {
                System.out.println("It's a draw");
                System.out.println("Amount of rounds : " + roundsPlayed);
                System.out.println("User score: " + userScore + " Computer score : " + computerScore);

            } else if (computerChoice == 1 && userChoice == 2) {
                System.out.println("User wins!");
                userScore++;
                System.out.println("Amount of rounds : " + roundsPlayed);
                System.out.println("User score: " + userScore + " Computer score : " + computerScore);
            } else if (computerChoice == 2 && userChoice == 3) {
                System.out.println("User wins!");
                userScore++;
                System.out.println("Amount of rounds : " + roundsPlayed);
                System.out.println("User score: " + userScore + " Computer score : " + computerScore);
            } else if (computerChoice == 3 && userChoice == 1) {
                System.out.println("User wins");
                userScore++;
                System.out.println("Amount of rounds : " + roundsPlayed);
                System.out.println("User score: " + userScore + " Computer score : " + computerScore);
            } else if (computerChoice == 1 && userChoice == 3) {
                System.out.println("Computer wins");
                computerScore++;
                System.out.println("Amount of rounds : " + roundsPlayed);
                System.out.println("User score: " + userScore + " Computer score : " + computerScore);
            } else if (computerChoice == 2 && userChoice == 1) {
                System.out.println("Computer wins");
                computerScore++;
                System.out.println("Amount of rounds : " + roundsPlayed);
                System.out.println("User score: " + userScore + " Computer score : " + computerScore);
            } else if (computerChoice == 3 && userChoice == 2) {
                System.out.println("Computer wins");
                computerScore++;
                System.out.println("Amount of rounds : " + roundsPlayed);
                System.out.println("User score: " + userScore + " Computer score : " + computerScore);
            }

            if (roundsPlayed == 10) {
                KeepPlaying = false;
            }
            roundsPlayed++;
        }

    }
}

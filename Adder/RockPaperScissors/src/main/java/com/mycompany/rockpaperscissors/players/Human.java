/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rockpaperscissors.players;

import java.util.Scanner;

/**
 *
 * @author jyoun
 */
public class Human implements Player {

    @Override
    public String getUser() {
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        return user;
    }

    @Override
    public int getChoice() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type 1 for rock, 2 for paper, and 3 for scissors.");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        int userChoice = sc.nextInt();

        boolean valid = true;

        while (valid) {
            if (userChoice <= 3 || userChoice > 0) {
                switch (userChoice) {
                    case 1:
                        userChoice = Choices.ROCK;
                        break;
                    case 2:
                        userChoice = Choices.PAPER;
                        break;
                    case 3:
                        userChoice = Choices.SCISSORS;
                        break;
                    default:
                        break;
                }
            } else {
                valid = false;
            }

        }
        return userChoice;
    }
}

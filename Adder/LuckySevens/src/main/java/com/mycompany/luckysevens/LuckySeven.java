/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.luckysevens;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jyoun
 */
public class LuckySeven {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int walletPeak = 0;
        int wallet;
        int rollsPeak = 0;
        int numRolls = 1;
        System.out.println("How much money are you going to play with?");
        wallet = sc.nextInt();

        System.out.println("Betting money $ " + wallet);

        while (wallet > 0) {
            int Dice1 = r.nextInt(6) + 1;
            int Dice2 = r.nextInt(6) + 1;
            rollsPeak++;

            int roll = Dice1 + Dice2;

            if (roll == 7) {
                System.out.println("Nice! +$4");
                wallet += 4;
                numRolls++;
            } else {
                System.out.println("Aww, you lost! -$1");
                wallet -= 1;
                numRolls++;
            }
            if (wallet > walletPeak) {
                walletPeak = wallet;

            }
        }
        System.out.println("You are broke after: " + numRolls + " rolls");
        System.out.println("You should have quit once you had $ " + walletPeak );
    }
}
    

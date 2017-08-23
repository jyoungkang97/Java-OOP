/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.coinflipper;

import java.util.Random;

/**
 *
 * @author jyoun
 */

public class CoinFlipper {

    public static void main(String[] args) {

        Random flip = new Random();

        Boolean heads = true;
        Boolean tails = false;
        Boolean result = flip.nextBoolean();

        if (result == true) {
            System.out.println("you got heads");
        } else if (result == false) {
            System.out.println("you got tails!");
        }

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.perfectnumbers;

import java.util.Scanner;

/**
 *
 * @author jyoun
 */
public class PerfectNumbers {

   public static void main(String[] args) {
       Scanner inputReader = new Scanner(System.in);
       int userNumber;
       int sum = 0;
       System.out.println("What number would you like me to factorize?");
       
       //initialized a scanner to ask the user for a number.
       userNumber = inputReader.nextInt();
       System.out.println("you chose the number " + userNumber);

       for (int i = 1; i < userNumber; i++) {
           if (userNumber % i == 0) {
               System.out.println(i);
               sum = sum + i;
           }
       }
       if (sum == userNumber) {
           System.out.println(userNumber + " is a perfect number");
       } else {
           System.out.println(userNumber + " is not a perfect number");
       }
       if (sum == 1) {
           System.out.println(userNumber + " is a prime number dude!!!!");
       } else {
           System.out.println(userNumber + " is not a prime number");
       }
   }
}






/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fizzbuzz;

/**
 *
 * @author jyoun
 */
public class Fizz {
    public static void main(String[] args) {
        System.out.println("Type in a number 0-100.");
            for (int i = 0; i <= 100; ++i)
                if (i % 3 == 0) { 
        System.out.println("Fizz"); 
            } else if (i % 5==0) {
            System.out.println("Buzz");
        }
            

    }
}

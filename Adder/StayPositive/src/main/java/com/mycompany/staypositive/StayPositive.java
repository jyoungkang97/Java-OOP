/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.staypositive;
import java.util.Scanner;
/**
 *
 * @author jyoun
 */
public class StayPositive {
    public static void main(String[] args) {
        System.out.println("Type in a starting number to count down from.");  
        Scanner input = new Scanner(System.in);
        int num = input.nextInt(); 
        
        while (num > 0)  {
            System.out.println(num);
            num--;
        }      
    }
}

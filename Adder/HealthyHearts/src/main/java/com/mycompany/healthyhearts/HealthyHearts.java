/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.healthyhearts;
import java.util.Scanner;

/**
 *
 * @author jyoun
 */
public class HealthyHearts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age?");
        
        int age = sc.nextInt();
        int maxRate = 220 - age;
        int low = (int) (maxRate *.5);
        int high =  (int) (maxRate * .85);
        
        System.out.println("Your target heartrate zone is " + low + "-" + high + " beats per minute");
    }
}

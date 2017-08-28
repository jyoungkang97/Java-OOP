/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.summativesums;

import java.util.Arrays;

/**
 *
 * @author jyoun
 */
public class SummativeSums {

    public static void main(String[] args) {

        int[] numbers = {1, 90, -33, -55, 67, -16, 28, -55, 15};
        int[] numbers2 = {999, -60, -77, 14, 160, 301};
        int[] numbers3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99};

        int sum = 0;
        for (int i = 0; i < 1; i++) {
            sum += numbers[i];
            System.out.println("#1 Array Sum: " + sum);
        }
        
        int sum2 = 0;
        for (int i = 0; i < numbers2.length; i++) {
            sum2 += numbers2[i];
            System.out.println("#2 Array Sum : " + sum2 );
        }
        
        int sum3 = 0;
        for (int i = 0; i < numbers3.length; i++) {
            sum3 += numbers3[i];
            System.out.println("#3 Array Sum : " + sum3);
        }
    }
}


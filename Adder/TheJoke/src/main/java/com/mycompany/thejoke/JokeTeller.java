package com.mycompany.thejoke;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jyoun
 */
public class JokeTeller {
    
    public void tellJoke(Joke joke){
        joke.tell();
        System.out.println("Please rate this joke 1-10");
        Scanner sc = new Scanner(System.in);
        int rating = sc.nextInt();
        joke.rate(rating);
    }
}

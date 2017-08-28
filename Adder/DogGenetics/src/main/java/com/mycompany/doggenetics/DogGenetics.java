/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.doggenetics;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author jyoun
 */
public class DogGenetics {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
    
            System.out.println("What is your dog's name?");
            
        String dogName = sc.next();
            
            System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");
        

            
            int percentage = 100;
            int dog1 = 0;
            int dog2 = 0;
            int dog3 = 0;
            int dog4 = 0;
            int dog5 = 0;
            
            dog1 = r.nextInt(percentage);
            percentage -= dog1;
            
            dog2 = r.nextInt(percentage);
            percentage -=dog2;
            
            dog3 = r.nextInt(percentage);
            percentage -=dog3;
            
            dog4 = r.nextInt(percentage);
            percentage -=dog4;
            
            dog5 = percentage;
            percentage -=dog5;
            
            System.out.println("Your dog is " + dog1 + "% Golden Retriever, " + dog2 + "% Husky, " + dog3 + "% Golden Lab, " + dog4 + "% Shiba Inu, " + dog5 + "%Doberman"  );
            }
    }
    
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.madlibs;

/**
 *
 * @author jyoun
 */
import java.util.Scanner;

    public class Madlibs {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Type in a noun.");
              String noun1 = sc.nextLine();
              
            System.out.println("Type in an adjective."); 
              String adj1 = sc.nextLine();
            
            System.out.println("Type in a noun.");
              String noun2 = sc.nextLine();
              
            System.out.println("Type in a number");
              String num = sc.nextLine();
            
            System.out.println("Type in an adjective.");
              String adj2 = sc.nextLine();
            
            System.out.println("Type in a plural noun.");
              String pn1 = sc.nextLine();
              
            System.out.println("Type in another plural noun.");
              String pn2 = sc.nextLine();
            
            System.out.println("Ok, last plural noun.");
              String pn3 = sc.nextLine();
              
            System.out.println("Now a present tense verb.");
              String v1 = sc.nextLine();
              
            System.out.println("Type in a past tense verb.");
              String v2 = sc.nextLine();
              
            System.out.println(noun1 + ": the " + adj1 + " frontier.  These are the voyages of the starship " + noun2 + ". Its " + num + "-year mission: to explore strange" + adj2);
           
              
            
    }
}

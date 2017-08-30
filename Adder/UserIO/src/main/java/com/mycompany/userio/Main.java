/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.userio;

/**
 *
 * @author jyoun
 */
public class Main {
    public static void main(String[] args) {
        UserIO io = new UserIOImpl();
        
        io.print("Testing message.");
        
        double d = io.readDouble("Enter a double 1-10");
        System.out.println(d);
    }
}

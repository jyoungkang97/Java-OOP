/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shapesandperimeters;

/**
 *
 * @author jyoun
 */
public class App {
    public static void main(String[] args) {
        Square sq = new Square(5);
        System.out.println(sq.getPerimeter());
        
        Rectangle rec = new Rectangle(5, 10);
        System.out.println(rec.getPerimeter());
    }
}

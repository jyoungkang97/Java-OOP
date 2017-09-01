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
public class Rectangle extends Shapes{
    
    double side;
    double side2;
    
    public Rectangle (double side, double side2) {
        this.side = side;
        this.side2 = side2;
        
}

    @Override
    public double getArea() {
        return side * side2;
    }

    @Override
    double getPerimeter() {
        return side * 2 + side2 * 2;
    }
}
    

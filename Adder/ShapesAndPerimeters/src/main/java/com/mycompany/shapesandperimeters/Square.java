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
public class Square extends Shapes{
    
    double side;
    
    public Square (double side) {
        this.side = side;
    }
    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    double getPerimeter() {
        return side + side + side + side;
    }
    
}

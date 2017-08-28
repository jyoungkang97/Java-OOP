/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
package com.mycompany.firstdayofobjects;
/**
package com.mycompany.firstdayofobjects;
 *
 * @author jyoun
 */
package com.mycompany.firstdayofobjects;
public class Main {
    public static void main(String[] args) {
        FirstCar Car = new FirstCar();
        Car.setMake("BMW");
        Car.setModel("3 series");
        Car.setMpg(25.5f);
        Car.setSurroundSound(false);
        System.out.println(Car.getModel());
        System.out.println(Car.getMpg());
        System.out.println(Car.getMake());
        System.out.println(Car.getSurroundSound());
        
        FirstCar Audi = new FirstCar();
        Audi.setMake("Audi");
        Audi.setModel("S5");
        Audi.setMpg(30.2f);
        Audi.setSurroundSound(true);
        System.out.println(Audi.getModel());
        System.out.println(Audi.getMake());
        System.out.println(Audi.getMpg());
        System.out.println(Audi.getSurroundSound());
        
        FirstCar Lexus = new FirstCar();
        Lexus.setSurroundSound(true);
        Lexus.setMake("Lexus");
        Lexus.setModel("IS350");
        Lexus.setMpg(34.2f);
        System.out.println(Lexus.getMake());
        System.out.println(Lexus.getMpg());
        System.out.println(Lexus.getModel());
        System.out.println(Lexus.getSurroundSound());
    }
}

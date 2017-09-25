/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.Scanner;

/**
 *
 * @author jyoun
 */
public class UserIOImpl {

    public UserIOImpl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public UserIOImpl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public UserIOImpl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public class UserIoImpl implements UserIO {

    public void print(String message) {

        System.out.println(message);
    }


    public double readDouble(String prompt) {

        System.out.println(prompt);
        Scanner firstDoubleScanner = new Scanner(System.in);
        double double01 = firstDoubleScanner.nextDouble();

        return double01;
    }


    public double readDouble(String prompt, double min, double max) {

        double double02 = 0;

        boolean getDouble = false;
        while (!getDouble) {

            System.out.println("\n" + prompt);
            Scanner secondDoubleScanner = new Scanner(System.in);
            double02 = secondDoubleScanner.nextDouble();

            if(double02 < max || double02 > min) {
                getDouble = true;
            } else {
                System.out.println("This value is not within range.");
            }
        }

        return double02;

    }


    public float readFloat(String prompt) {

        System.out.println(prompt);
        Scanner firstFloatScanner = new Scanner(System.in);
        float float01 = firstFloatScanner.nextFloat();

        return float01;
    }


    public float readFloat(String prompt, float min, float max) {

        float float02 = 0;

        boolean getFloat = false;
        while (!getFloat) {

            System.out.println(prompt);
            Scanner secondFloatScanner = new Scanner(System.in);
            float02 = secondFloatScanner.nextFloat();

            if(float02 < max || float02 > min) {
                getFloat = true;
            } else {
                System.out.println("This value is not within range.");
            }
        }

        return float02;

    }


    public int readInt(String prompt) {

        System.out.println(prompt);
        Scanner firstIntScanner = new Scanner(System.in);
        int int01 = firstIntScanner.nextInt();

        return int01;
    }


    public int readInt(String prompt, int min, int max) {

        int int02 = 0;

        boolean getInt = false;
        while(!getInt) {
            System.out.println(prompt);
            Scanner secondIntScanner = new Scanner(System.in);
            int02 = secondIntScanner.nextInt();

            if(int02 < max || int02 > min) {
                getInt = true;
            } else {
                System.out.println("This value is not within range.");
            }
        }

        return int02;
    }


    public long readLong(String prompt) {

        System.out.println(prompt);
        Scanner firstLongScanner = new Scanner(System.in);
        long long01 = firstLongScanner.nextLong();

        return long01;
    }


    public long readLong(String prompt, long min, long max) {

        long long02 = 0;

        boolean getLong = false;
        while(!getLong) {
            System.out.println(prompt);
            Scanner secondLongScanner = new Scanner(System.in);
            long02 = secondLongScanner.nextLong();

            if(long02 < max || long02 > min) {
                getLong = true;
            } else {
                System.out.println("This value is not within range.");
            }
        }

        return long02;
    }


    public String readString(String prompt) {

        System.out.println(prompt);
        Scanner promptScanner = new Scanner(System.in);
        String userInput = promptScanner.nextLine();

        return userInput;
    }
}
}

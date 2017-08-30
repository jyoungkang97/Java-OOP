package com.mycompany.thejoke;

/**
 *
 * @author jyoun
 */
public class FunniestUniversalJoke implements Joke{ 
    private int totalRating;
    private int ratingCount;
    
    @Override
    public void tell() {
        System.out.println("Two hunters have a hunting accident.");
        System.out.println("One calls 911.");
        System.out.println("");
    }

    @Override
    public void rate(int rating) {
        ratingCount++;
        totalRating += rating;
        
    }
}

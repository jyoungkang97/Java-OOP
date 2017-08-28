/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.firstdayofobjects;

/**
 *
 * @author jyoun
 */
public class FirstCar {

    private String make;
    private String model;
    private Boolean surroundSound;
    private float mpg;

    /**
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the surroundSound
     */
    public Boolean getSurroundSound() {
        return surroundSound;
    }

    /**
     * @param surroundSound the surroundSound to set
     */
    public void setSurroundSound(Boolean surroundSound) {
        this.surroundSound = surroundSound;
    }

    /**
     * @return the mpg
     */
    public float getMpg() {
        return mpg;
    }

    /**
     * @param mpg the mpg to set
     */
    public void setMpg(float mpg) {
        this.mpg = mpg;
    }
}

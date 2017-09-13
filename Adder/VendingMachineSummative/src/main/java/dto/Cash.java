/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author jyoun
 */
public class Cash {
    private double wallet;
    private double change;
    private double addedMoney;

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public double getChange() {
        return change;
    }

    public void setChange(double change) {
        this.change = change;
    }

    public double getAddedMoney() {
        return addedMoney;
    }

    public void setAddedMoney(double addedMoney) {
        this.addedMoney = addedMoney;
    }
}

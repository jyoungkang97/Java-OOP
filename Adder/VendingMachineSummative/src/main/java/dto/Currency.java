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
public enum Currency {
    DOLLAR_BILL(100),
    QUARTER(25),
    DIME(10),
    NICKEL(5),
    PENNY(1);
    int value;

    private Currency(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}

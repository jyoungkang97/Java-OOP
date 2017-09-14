/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.math.BigDecimal;

/**
 *
 * @author jyoun
 */
public class Cash {
    private BigDecimal wallet;
    private BigDecimal change;
    private BigDecimal addedMoney;

    public BigDecimal getWallet() {
        return wallet;
    }

    public void setWallet(BigDecimal wallet) {
        this.wallet = wallet;
    }

    public BigDecimal getChange() {
        return change;
    }

    public void setChange(BigDecimal change) {
        this.change = change;
    }

    public BigDecimal getAddedMoney() {
        return addedMoney;
    }

    public void setAddedMoney(BigDecimal addedMoney) {
        this.addedMoney = addedMoney;
    }
}

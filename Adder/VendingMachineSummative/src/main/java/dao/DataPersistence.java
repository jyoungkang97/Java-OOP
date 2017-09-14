/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import ui.UserIO;

/**
 *
 * @author jyoun
 */
public class DataPersistence {
    UserIO io;
    public String insufficientFundsExceptions(){
        io.print("Not enough money!");
        return null;
    }
}

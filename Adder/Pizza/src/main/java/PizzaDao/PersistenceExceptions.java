/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PizzaDao;

/**
 *
 * @author jyoun
 */
public class PersistenceExceptions extends Exception{
    
    public PersistenceExceptions(String message) {
        super(message);
    }
}

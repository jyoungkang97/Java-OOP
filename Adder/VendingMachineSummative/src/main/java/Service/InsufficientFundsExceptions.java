/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

/**
 *
 * @author jyoun
 */
public class InsufficientFundsExceptions extends Exception {

    public InsufficientFundsExceptions(String prompt, Exception ex) {
        super(prompt, ex);
    }
    public InsufficientFundsExceptions() {
        super();
    }

}

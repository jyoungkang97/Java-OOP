/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package error;

/**
 *
 * @author jyoun
 */
public class VendOutOfStock extends Exception{

    private String message;

    public VendOutOfStock(String message) {
        this.message = message;
    }

}
}

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
public class InsufficientQuantity extends Exception{
    public InsufficientQuantity (String message) {
        super(message);
    }
    public InsufficientQuantity (String message,
            Throwable cause) {
        super(message, cause);
    }
}

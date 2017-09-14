/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import dao.ExceptionsDAO;
import dao.InsufficientFundsExceptions;
import dto.Item;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author jyoun
 */
public interface Service {
    List<Item> getAllItems () throws ExceptionsDAO;
    
    Item getUserChoiceItemPrice(String itemId) throws ExceptionsDAO;
      
    BigDecimal checkIfEnoughMoney (Item item, BigDecimal bd) throws InsufficientFundsExceptions;
    
    Item getItemCost(String itemId) throws ExceptionsDAO;
            
    
    

}

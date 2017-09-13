/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Item;
import java.util.List;

/**
 *
 * @author jyoun
 */
public interface Inventory {
    List<Item> getAllItems () throws ExceptionsDAO;
    
    
    Item getItemCost(String itemId) throws ExceptionsDAO;
            
    
    double buy(String itemId, double money) throws ExceptionsDAO;

}

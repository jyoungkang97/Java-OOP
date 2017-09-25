/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Service.ExceptionsDAO;
import Service.InsufficientQuantity;
import dto.Item;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author jyoun
 */
public interface Inventory {

    List<Item> getAllItems() throws ExceptionsDAO;

    BigDecimal BigDecimal(String currentToken) throws ExceptionsDAO;

    Item getItem(String itemId) throws ExceptionsDAO, InsufficientQuantity;

    void update(Item item) throws ExceptionsDAO;

}

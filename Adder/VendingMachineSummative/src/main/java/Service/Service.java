/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import dto.Item;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author jyoun
 */
public interface Service {

    List<Item> getAllItems() throws ExceptionsDAO;

    BigDecimal getUserChoiceItemPrice(String itemId) throws ExceptionsDAO, InsufficientQuantity;

    BigDecimal getChange(Item item, BigDecimal bd) throws InsufficientFundsExceptions, InsufficientQuantity;

    Item getItemCost(String itemId) throws ExceptionsDAO, InsufficientQuantity;

    BigDecimal checkSufficientFunds(Item item, BigDecimal userMoney) throws InsufficientFundsExceptions, InsufficientQuantity;

    public void pullItem(Item item) throws InsufficientQuantity, ExceptionsDAO;

}

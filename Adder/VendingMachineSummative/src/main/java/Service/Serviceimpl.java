/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import controller.Controller;
import dao.Inventory;
import dto.Item;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author jyoun
 */
public class Serviceimpl implements Service {

    Inventory dao;
    Controller controller;
    BigDecimal itemPrice;
    int quantityException;
    public Serviceimpl(Inventory dao) {

        this.dao = dao;
    }

    @Override
    public List<Item> getAllItems() throws ExceptionsDAO {
        return dao.getAllItems();
    }

    @Override
    public Item getItemCost(String itemId) throws ExceptionsDAO, InsufficientQuantity {
        return dao.getItem(itemId);
    }

    @Override
    public BigDecimal getUserChoiceItemPrice(String itemId) throws ExceptionsDAO, InsufficientQuantity {
        Item item = dao.getItem(itemId);
        itemPrice = item.getItemPrice();
        return itemPrice;
    }

    @Override
    public BigDecimal getChange(Item item, BigDecimal userMoney) throws InsufficientFundsExceptions {
        BigDecimal itemPrice = item.getItemPrice();
        return userMoney.subtract(itemPrice);
    }

    @Override
    public BigDecimal checkSufficientFunds(Item item, BigDecimal userMoney) throws InsufficientFundsExceptions {
        BigDecimal itemPrice = item.getItemPrice();
        if (userMoney.compareTo(itemPrice) >= 0) {
            return userMoney;
        } else {
            throw new InsufficientFundsExceptions ();
        }
    }

    /**
     *
     * @param item
     * @throws dao.ExceptionsDAO
     */
    @Override
    public void pullItem(Item item) throws ExceptionsDAO {
        if(item.getQuantity() > 0) {
                item.setQuantity((item.getQuantity() )-1 ) ;
        
        dao.update(item);
    }

    }
}
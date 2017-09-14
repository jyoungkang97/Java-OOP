/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import dao.ExceptionsDAO;
import dao.InsufficientFundsExceptions;
import dao.Inventory;
import dto.Item;
import java.math.BigDecimal;
import java.util.List;
import ui.UserIO;

/**
 *
 * @author jyoun
 */
public class Serviceimpl implements Service {

    UserIO io;
    Inventory dao;

    public Serviceimpl(Inventory dao) {

        this.dao = dao;
    }

    @Override
    public List<Item> getAllItems() throws ExceptionsDAO {
        return dao.getAllItems();
    }

    @Override
    public Item getItemCost(String itemId) throws ExceptionsDAO {
        return dao.getItem(itemId);
    }

    
    @Override
    public Item getUserChoiceItemPrice(String itemId) throws ExceptionsDAO {
        Item item = dao.getItem(itemId);
        return item;
    }

    @Override
    public BigDecimal checkIfEnoughMoney(Item item, BigDecimal userMoney) throws InsufficientFundsExceptions {
        BigDecimal itemPrice = item.getItemPrice();
        if (itemPrice.compareTo(userMoney) <= -1) {
            throw new InsufficientFundsExceptions();
        }
        BigDecimal change = userMoney.subtract(itemPrice);
        return change;

    }

}

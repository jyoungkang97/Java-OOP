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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jyoun
 */
public class InventoryStubImpl implements Inventory {
    Item onlyItem;
    List<Item> itemList = new ArrayList<>();
    
    public InventoryStubImpl() {
        onlyItem = new Item("B05");
        onlyItem.setItemName("Snickers");
        onlyItem.setItemPrice(BigDecimal.TEN);
        onlyItem.setQuantity(4);
        
        itemList.add(onlyItem);
    }

    @Override
    public List<Item> getAllItems() throws ExceptionsDAO {
        return itemList;
    }

    @Override
    public java.math.BigDecimal BigDecimal(String currentToken) throws ExceptionsDAO {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Item getItem(String itemId) throws ExceptionsDAO, InsufficientQuantity {
        if(itemId.equals(onlyItem.getItemId())) {
            return onlyItem;
        } else {
            return null;
        }
    }

    @Override
    public void update(Item item) throws ExceptionsDAO {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

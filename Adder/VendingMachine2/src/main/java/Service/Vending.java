/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import dao.VendPersistence;
import dto.Item;
import error.VendInsufficientFunds;
import error.VendOutOfStock;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author jyoun
 */
public interface Vending {
    List<Item> getProducts();

    void removeInventory(Item vendingProduct) throws VendPersistence;

    Item getAvailableProduct(String productNumber) throws VendPersistence, VendOutOfStock;

    String purchase(Item product, BigDecimal money) throws VendPersistence, VendInsufficientFunds, VendOutOfStock;
}



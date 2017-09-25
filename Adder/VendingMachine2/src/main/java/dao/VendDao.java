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
public interface VendDao {

    /**
     * @return string array of the VM's inventory
     */
    List<Item> getAllProducts();

    /**
     * @param productNumber with which the product is associated
     * @return info about the product associated with the given product number
     */
    Item getProduct(String productNumber);

    /**
     * @param productNumber associated with the product to be removed from the VM inventory
     * @return product that was removed or null if no product is associated with the given product number
     */
    void removeProduct(String productNumber) throws VendPersistence;


}

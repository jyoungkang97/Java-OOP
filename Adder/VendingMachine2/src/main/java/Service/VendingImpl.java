/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import dao.VendDao;
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
public class VendingImpl implements Vending{
    private VendDao dao;

    @Override
    public Item getAvailableProduct(String productNumber) throws VendPersistence, VendOutOfStock {
        Item chosenProduct = dao.get(productNumber);
        if (chosenProduct == null || chosenProduct.getProductInventory() <= 0) {
            throw new VendOutOfStock("No inventory.");
        }

        return chosenProduct;

    }

    @Override
    public List<Item> getProducts() {
        return dao.getAllProducts();
    }

    @Override
    public String purchase(Item product, BigDecimal money) throws VendPersistence, VendInsufficientFunds, VendOutOfStock {

        if (product == null || product.getProductInventory() <= 0) {
            throw new VendOutOfStock("No inventory.");
        }

        double priceDouble = Double.valueOf(product.getProductPrice());
        BigDecimal price = BigDecimal.valueOf(priceDouble);

        if (money.compareTo(price) >= 0) {
            BigDecimal change = money.subtract(price);
            removeInventory(product);
            return change(change);
        } else {
            throw new VendInsufficientFunds();
        }

    }

    @Override
    public void removeInventory(Item vendingProduct) throws VendPersistence {
        dao.removeProduct(String.valueOf(vendingProduct.getProductNumber()));
    }

    private String change(BigDecimal change) {
        double amt = Double.valueOf(String.valueOf(change));
        int cents, quarter, dime, nickle, penny;

        cents = (int) (amt * 100);

        quarter = cents / 25;
        cents = cents % 25;

        dime = cents / 10;
        cents = cents % 10;

        nickle = cents / 5;
        cents %= 5;

        penny = cents;

        String displayChangeCoins = ("Please collect your change: \n" + quarter + " quarters, " + dime + " dimes, " + nickle + " nickles and " + penny + " pennies");

        return displayChangeCoins;
    }

}

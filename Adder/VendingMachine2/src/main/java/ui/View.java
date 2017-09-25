/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import dto.Item;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author jyoun
 */
public class View {

    private UserIO io;

    public View(UserIO io) {
        this.io = io;
    }

    public int printMenuAndGetSelection(List<Item> product) {

        for (Item p : product) {
            io.print(p.getProductNumber() + " " + p.getProductName() + " $" + p.getProductPrice());
        }
        io.print("6 EXIT");

        return io.readInt("Please enter the no. ID of the product you would like to purchase or enter 6 to exit.", 1, 6);
    }

    public void displayProductBanner() {
        io.print("=== YOU HAVE CHOSEN ===");
    }

    public void displayProduct(Item selectedProduct) {

        if (selectedProduct != null) {
            io.print(selectedProduct.getProductNumber() + " " + selectedProduct.getProductName() + " $" + selectedProduct.getProductPrice());
        } else {
            io.print("Sorry, we don't sell that here.");
        }
    }

    public BigDecimal askForMoney() {
        double enteredMoneyDouble = io.readDouble("How much money are you entering?", 0, Double.MAX_VALUE);
        // Check for valid money
        String text = Double.toString(Math.abs(enteredMoneyDouble));
        int integerPlaces = text.indexOf('.');
        int decimalPlaces = text.length() - integerPlaces - 1;
        if (decimalPlaces > 2 || enteredMoneyDouble < 0) {
            displayErrorMessage();
        }

        BigDecimal enteredMoney = BigDecimal.valueOf(enteredMoneyDouble);
        return enteredMoney;
    }

    public void displayChangeBanner() { io.print("=== CHANGE ==="); }

    public void displayChange(String change) {
        io.print(change);
        io.print(" ");
    }

    public void displayUnknownCommandBanner() {
        io.print("ERROR: unknown command");
    }

    public void displayExitBanner() {
        io.print("Goodbye!");
    }

    public void displayErrorMessage() {
        throw new UnsupportedOperationException("That's not a valid entry.");
    }

    public void displayFundsErrorMessage() {
        io.print("Sorry, that isn't enough money.");
        io.print(" ");
    }

    public void displayInventoryErrorMessage() {
        io.print("Sorry, we're out of that right now.");
        io.print(" ");
    }

    public void printChange(String change) {

    }
}
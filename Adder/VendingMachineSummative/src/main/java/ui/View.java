/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import dto.Cash;
import dto.Item;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author jyoun
 */
public class View {

    private UserIO io;

    public View(UserIO io) {
        this.io = io;

    }

    public String displayItemMenu(List<Item> items) {
        Scanner sc = new Scanner(System.in);
        for (Item Items : items) {
            io.print(Items.getItemId()
                    + Items.getItemName()
                    + Items.getItemPrice());

        }
        return null;
    }

    public BigDecimal addMoney() {
        String money = io.readString("Insert money between 1 cent: .01, up to 100 dollars: 100 ");

        io.print("Your current balance: $" + money);
        BigDecimal userMoney = new BigDecimal(money);
        return userMoney;

    }

    public String makeSelection() {

        String userChoice = io.readString("Enter the item ID you want.");
        System.out.println("You selected: " + userChoice);

        return userChoice;

    }

    public void displayChange(BigDecimal change) {
        io.print("This is your change: " + change);
    }

    public void displayDisplayAllBanner() {
        io.print("===== VENDING MACHINE =====");
        io.print("=== Display All Items ===");
    }

    public BigDecimal displayItemPrice(Item item) {
        BigDecimal itemPrice = item.getItemPrice();
        if (item != null) {
            io.print(String.format("%s", item.getItemPrice()));
        } else {
            io.print("make another selection");
        }
        return itemPrice;
    }

    public void displaySnackBanner() {
        io.print("=== Display Snack ===");
    }

    public void displayItemId(Item item) {
        io.print(item.getItemId());

    }

    public void displayItemMenu(double money) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void displayWallet(Cash money, String wallet) {
        io.print(wallet);
    }
}

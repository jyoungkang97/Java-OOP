/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import dto.Item;
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
        for (Item Items : items) {
            io.print(Items.getItemId()
                    + Items.getItemName()
                    + Items.getItemPrice());
        }
        String itemId = io.readString("Which item would you like? Please type in ID Ex. b03");
        return itemId;
    }


    

    public void displayDisplayAllBanner() {
        io.print("===== VENDING MACHINE =====");
        io.print("=== Display All Items ===");
    }

    public void displayItemPrice(Item item) {

        if (item != null) {
            io.print(item.getItemPrice());
        } else {
            io.print("make another selection");
        }
    }

    public void displaySnackBanner() {
        io.print("=== Display Snack ===");
    }
    public void displayItemId(Item item) {
        io.print(item.getItemId());

    }
}

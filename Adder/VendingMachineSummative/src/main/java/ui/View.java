/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import dto.Cash;
import dto.Item;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author jyoun
 */
public class View {
    
    private UserIO io;
    private double money;
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
    public double addMoney(){
            money = io.readDouble("Insert money between 1 cent: .01, up to 100 dollars: 100 ", .01, 100);
            System.out.println("Your current balance: $" + money);
            return money;
    }
    

    public String makeSelection() {
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select an item based on item ID.  Ex. B02.");
        String userChoice = sc.next();
        System.out.println("You selected: " + userChoice );
        
                return userChoice;

    }


    public void displayDisplayAllBanner() {
        io.print("===== VENDING MACHINE =====");
        io.print("=== Display All Items ===");
    }

    public double displayItemPrice(Item item) {
        double itemPrice = item.getItemPrice();
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import dto.Cash;
import dto.Currency;
import static dto.Currency.DIME;
import static dto.Currency.NICKEL;
import static dto.Currency.QUARTER;
import static dto.Currency.DOLLAR_BILL;
import static dto.Currency.PENNY;
import dto.Item;
import java.math.BigDecimal;
import java.math.MathContext;
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
            if (Items.getQuantity() > 0) {
            io.print(" | Item I.D.: " + Items.getItemId() + " | Item Name: "
                    + Items.getItemName() + " | Price: "
                    + Items.getItemPrice() + " | Quantity: "
                    + Items.getQuantity() + " | ");
            }
        }
        return null;
    }

    public BigDecimal addMoney() {
        String money = io.readString("Insert money between 1 cent: .01, up to 100 dollars: 100 ");

        io.print("Your current balance: $" + money);
        BigDecimal userMoney = new BigDecimal(money);
        return userMoney;

    }

    public String makeAnotherSelection() {
        String displayAgain = io.readString("Would you like to make another selection? Input " + "'Y' " + "for yes." + " Enter anything else " + "for no.");
        return displayAgain;
    }

    public String makeSelection() {

        String userChoice = io.readString("Enter the item ID you want.");
        System.out.println("You selected: " + userChoice);

        return userChoice;

    }

    public void displayChange(BigDecimal change) {
        double money = 100 * change.doubleValue();
        BigDecimal moneyBigDec = new BigDecimal(money);
        io.print("Giving you back $" + moneyBigDec.movePointLeft(2).round(MathContext.UNLIMITED) + " in:");

        int numbDollars = (int) (money / Currency.DOLLAR_BILL.getValue());
        for (double i = 0; i < numbDollars; i++) {
            System.out.println(DOLLAR_BILL);
        }
        money -= numbDollars * Currency.DOLLAR_BILL.getValue();
        int numbQuarters = (int) (money / Currency.QUARTER.getValue());
        for (double i = 0; i < numbQuarters; i++) {
            System.out.println(QUARTER);
        }
        money -= numbQuarters * Currency.QUARTER.getValue();
        int numbDimes = (int) (money / Currency.DIME.getValue());
        for (double i = 0; i < numbDimes; i++) {
            System.out.println(DIME);
        }
        money -= numbDimes * Currency.DIME.getValue();
        int numbNickels = (int) (money / Currency.NICKEL.getValue());
        for (double i = 0; i < numbNickels; i++) {
            System.out.println(NICKEL);
        }
        money -= numbNickels * Currency.NICKEL.getValue();
        int numbPennies = (int) (money / Currency.PENNY.getValue());
        for (double i = 0; i < numbPennies; i++) {
            System.out.println(PENNY);
        }
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
    
    public void displayErrorMessage() {
        io.print("=== ERROR ====");
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

    public void displayItemVended(String userChoice) {
        io.print("here is your item: " + userChoice);
    }

    public void displayErrorMessage(String errorMsg) {
        io.print(errorMsg);
    }

}

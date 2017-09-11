/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ExceptionsDAO;
import dao.Inventory;
import dto.Item;
import java.util.List;
import java.util.Scanner;
import ui.View;

/**
 *
 * @author jyoun
 */
public class Controller {
    
    Inventory dao;
    View view;
 
    boolean keepGoing = true;
    
    public Controller (Inventory dao, View view) {
        this.dao = dao;
        this.view = view;
    }
    
    public void run() throws ExceptionsDAO {
        while (keepGoing) {
            listItems();
            
        }
    }
    
    private void listItems() throws ExceptionsDAO {
    view.displayDisplayAllBanner();
    List <Item> items = dao.getAllItems();
    view.displayItemMenu(items);
    }
    public void getSelectedItemInfo() {
    view.displaySnackBanner();
    
    }
        public static int moneyInserted(int Price){
    Scanner keyboard = new Scanner(System.in);
    int money = 0;
    System.out.println("Your item costs: " + Price + " Please enter the amount of money:");
    money = keyboard.nextInt();
    while (money < Price){
        System.out.println("Please insert sufficient funds");
        money = money + keyboard.nextInt();
    }
    return money - Price ;
    }
    
    public static void changeOut(int change) {
    int quarters = 0;
    int dimes = 0;
    int nickels = 0;
    while (change >= 25){
        quarters = quarters + 1;
        change = change - 25;
    }
    while (change >= 10){
        nickels = dimes + 1;
        change = change - 10;
        while (change >= 5){
            nickels = nickels + 1;
            change = change - 5;
        }
    }
}
}

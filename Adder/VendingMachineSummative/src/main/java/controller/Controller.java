/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Service.Service;
import dao.ExceptionsDAO;
import dao.InsufficientFundsExceptions;
import dto.Cash;
import dto.Item;
import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;
import ui.UserIO;
import ui.View;

/**
 *
 * @author jyoun
 */
public class Controller {
    Service service;
    View view;
    UserIO io;
    Cash cash;
    BigDecimal money;

    public Controller(Service service, View view) {
        this.service = service;
        this.view = view;
        
    }
    


    public void run() throws ExceptionsDAO, InsufficientFundsExceptions {
        listItems();
        addMoney();
        getSelectedItemPrice();
    }
   

    
    private BigDecimal getSelectedItemPrice() throws ExceptionsDAO {
        String itemId = view.makeSelection();
        Item userChoice = service.getItemCost(itemId);
        return view.displayItemPrice(userChoice);
    }
    
    
   
      
     
    private BigDecimal addMoney() throws ExceptionsDAO {
        BigDecimal money = view.addMoney();
        return money;
    }

    private void listItems() throws ExceptionsDAO {
        view.displayDisplayAllBanner();
        List<Item> items = service.getAllItems();
        view.displayItemMenu(items);
    }

    private void vendItem(Item item) throws InsufficientFundsExceptions, ExceptionsDAO {
       service.checkIfEnoughMoney(item, money);
       view.displayChange(money);
    } 
  

    

    public static void changeOut(BigDecimal money) {
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int change = 0;
        while (change >= 25) {
            quarters = quarters + 1;
            change = change - 25;
        }
        while (change >= 10) {
            nickels = dimes + 1;
            change = change - 10;
            while (change >= 5) {
                nickels = nickels + 1;
                change = change - 5;
            }
        }
    }
}

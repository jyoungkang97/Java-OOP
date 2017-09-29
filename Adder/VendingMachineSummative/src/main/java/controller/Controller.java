/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Service.Service;
import Service.ExceptionsDAO;
import Service.InsufficientFundsExceptions;
import Service.InsufficientQuantity;
import dto.Item;
import java.math.BigDecimal;
import java.util.List;
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
    Item item;
    BigDecimal money;

    public Controller(Service service, View view) {
        this.service = service;
        this.view = view;
    }

    public void run() throws ExceptionsDAO, InsufficientFundsExceptions, InsufficientQuantity {
        boolean keepGoing = true;
        while (keepGoing == true) {
            try {
                
                listItems();
                money = addMoney();
                BigDecimal itemPrice = getSelectedItemPrice(money);
                try {
                    vendItem(item, money);
          
                    break;
                } catch (InsufficientFundsExceptions e) {
                    view.displayErrorMessage(e.getMessage());
                }
                service.getChange(item, money);
            } catch (ExceptionsDAO | InsufficientQuantity e) {
                view.displayErrorMessage(e.getMessage());
            }
        } 
    }

    private BigDecimal getSelectedItemPrice(BigDecimal money) throws ExceptionsDAO, InsufficientFundsExceptions, InsufficientQuantity {
        String itemId = view.makeSelection();
        item = service.getItemCost(itemId);
        view.displayItemPrice(item);
        return money;
    }

    private String repeat() throws ExceptionsDAO, InsufficientFundsExceptions, InsufficientQuantity {
        String repeat = view.makeAnotherSelection();
        if (repeat.equals("Y")) {
            listItems();
            money = addMoney();
            BigDecimal itemPrice = getSelectedItemPrice(money);
            vendItem(item, money);
            service.getChange(item, money);
            repeat();
        } else {
            return repeat;
        }
        return null;
    }

    private BigDecimal addMoney() throws InsufficientFundsExceptions {

        money = view.addMoney();

        return money;
    }

    private void listItems() throws ExceptionsDAO {
        view.displayDisplayAllBanner();
        List<Item> items = service.getAllItems();
        view.displayItemMenu(items);
    }

    private String runAgain(String userChoice) throws ExceptionsDAO {
        view.makeAnotherSelection();
        return userChoice;

    }

    private Item vendItem(Item item, BigDecimal money) throws InsufficientFundsExceptions, ExceptionsDAO, InsufficientQuantity {

        service.checkSufficientFunds(item, money);
        view.displayItemVended(item.getItemName());
        view.displayChange(service.getChange(item, money));
        service.pullItem(item);
        return item;

    }

}

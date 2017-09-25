/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controller.Controller;
import Service.Vending;
import dao.VendDao;
import dao.VendDaoImpl;
import dao.VendPersistence;
import error.VendInsufficientFunds;
import error.VendOutOfStock;
import ui.UserIO;
import ui.UserIOImpl;
import ui.View;

/**
 *
 * @author jyoun
 */
public class App {

    public static void main(String[] args) throws VendPersistence, VendOutOfStock, VendInsufficientFunds {
        UserIO myIo = new UserIOImpl();
        View myView = new View(myIo);
        VendDao myDao = new VendDaoImpl();
        Vending myService = new VendingImpl(myDao);
        Controller controller = new Controller(myService, myView);
        controller.run();
    }
}


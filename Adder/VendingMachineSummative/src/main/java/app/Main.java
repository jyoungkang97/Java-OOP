/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Service.Service;
import Service.Serviceimpl;
import controller.Controller;
import dao.ExceptionsDAO;
import dao.InsufficientFundsExceptions;
import dao.Inventory;
import dao.InventoryImpl;
import ui.UserIO;
import ui.UserIOImpl;
import ui.View;

/**
 *
 * @author jyoun
 */
public class Main {
    public static void main(String[] args) throws ExceptionsDAO, InsufficientFundsExceptions {
        
        UserIO myIo = new UserIOImpl();
        View myView = new View(myIo);
        Inventory myDao = new InventoryImpl();
        Service service = new Serviceimpl(myDao);
        Controller controller = new Controller (service, myView);
        controller.run();
    }
 
}

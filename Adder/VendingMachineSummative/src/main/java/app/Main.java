/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import controller.Controller;
import dao.ExceptionsDAO;
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
    public static void main(String[] args) throws ExceptionsDAO {
        UserIO myIo = new UserIOImpl();
        View myView = new View(myIo);
        Inventory myDao = new InventoryImpl();
        Controller controller = new Controller (myDao, myView);
        controller.run();
    }
 
}

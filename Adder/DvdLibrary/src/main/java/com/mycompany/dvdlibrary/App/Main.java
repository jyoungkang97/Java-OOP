/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvdlibrary.App;

import com.mycompany.dvdlibrary.Controller.DvdLibraryController;
import com.mycompany.dvdlibrary.Dao.DvdLibraryDAO;
import com.mycompany.dvdlibrary.Dao.DvdLibraryDAOImpl;
import com.mycompany.dvdlibrary.UI.UserIO;
import com.mycompany.dvdlibrary.UI.UserIOImpl;
import com.mycompany.dvdlibrary.UI.View;

/**
 *
 * @author jyoun
 */
public class Main {
    public static void main(String[] args) {
        UserIO myIo = new UserIOImpl();
        View myView = new View(myIo);
        DvdLibraryDAO myDao = new DvdLibraryDAOImpl();
        DvdLibraryController controller = new DvdLibraryController(myDao, myView);
        controller.run();
    }
}

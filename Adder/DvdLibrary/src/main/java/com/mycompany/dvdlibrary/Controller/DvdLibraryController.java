/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvdlibrary.Controller;

import com.mycompany.dvdlibrary.DTO.Dvd;
import com.mycompany.dvdlibrary.Dao.DvdLibraryDAO;
import com.mycompany.dvdlibrary.Dao.DvdLibraryDAOImpl;
import com.mycompany.dvdlibrary.UI.UserIO;
import com.mycompany.dvdlibrary.UI.UserIOImpl;
import com.mycompany.dvdlibrary.UI.View;

/**
 *
 * @author jyoun
 */
public class DvdLibraryController {
    View view = new View();
    DvdLibraryDAO dao = new DvdLibraryDAOImpl();
    private UserIO io = new UserIOImpl();
    
    public void run () {
        boolean keepGoing = true;
        int menuSelection = 0;
        
        while (keepGoing) {

            
            menuSelection = getMenuSelection();
   
            switch (menuSelection) {
                case 1:
                    createDvd();
                    break; 
                case 2:
                    io.print("Remove DVD");
                    break;
                case 3:
                    io.print("Edit DVD");
                    break;
                case 4: 
                    io.print("List all DVD");
                    break;
                case 5:
                    io.print("List particular DVD");
                    break;
                case 6:
                    keepGoing = false;
                    break;
                
                default:
                    io.print("Unknown input");
                    
            }
        }
        io.print("Bye");
    }
    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }
    private void createDvd() {
        view.displayCreateDvdBanner();
        Dvd newDvd = view.getNewDvdInfo();
        dao.addDvd(newDvd.getTitle(), newDvd);
        view.displayCreateSuccessBanner();
    }
    
    
}

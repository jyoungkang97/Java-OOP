/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvdlibrary.Controller;

import com.mycompany.dvdlibrary.DTO.Dvd;
import com.mycompany.dvdlibrary.Dao.DvdExceptionsDAO;
import com.mycompany.dvdlibrary.Dao.DvdLibraryDAO;
import com.mycompany.dvdlibrary.UI.UserIO;
import com.mycompany.dvdlibrary.UI.View;
import java.util.List;

/**
 *
 * @author jyoun
 */
public class DvdLibraryController {

    DvdLibraryDAO dao;
    View view;
    UserIO io;

    public DvdLibraryController(DvdLibraryDAO dao, View view) {

        this.dao = dao;
        this.view = view;
    }

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;

        try {
            while (keepGoing) {

                menuSelection = getMenuSelection();

                switch (menuSelection) {
                    case 1:
                        createDvd();
                        break;
                    case 2:
                        removeDvd();
                        break;
                    case 3:
                        editDvd();
                        break;
                    case 4:
                        listDvds();
                        break;
                    case 5:
                        viewDvd();
                        break;
                    case 6:
                        keepGoing = false;
                        break;

                    default:
                        unknownCommand();

                }
            }
            exitMessage();
        } catch (DvdExceptionsDAO e) {
            view.displayErrorMessage(e.getMessage());
        }
    }

    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }

    private void createDvd() throws DvdExceptionsDAO {
        view.displayCreateDvdBanner();
        Dvd newDvd = view.getNewDvdInfo();
        dao.addDvd(newDvd.getTitle(), newDvd);
        view.displayCreateSuccessBanner();
    }

    private void listDvds() throws DvdExceptionsDAO {
        view.displayDisplayAllBanner();
        List<Dvd> dvdList = dao.getAllDvds();
        view.displayDvdList(dvdList);
    }

    private void viewDvd() throws DvdExceptionsDAO {
        view.displayDisplayDvdBanner();
        String title = view.getDvdTitleChoice();
        Dvd dvd = dao.getDvd(title);
        view.displayDvd(dvd);

    }

    private void removeDvd() throws DvdExceptionsDAO {
        view.displayRemoveDvd();
        String title = view.getDvdTitleChoice();
        dao.removeDvd(title);
        view.displayRemoveSuccessBanner();
       
    }

    private void unknownCommand() {
        view.displayUnknownCommandBanner();
    }

    private void exitMessage() {
        view.displayExitBanner();
    }

    private void editDvd() throws DvdExceptionsDAO {

        List<Dvd> dvdList = dao.getAllDvds();
        if (dvdList.size() > 0) {
            view.displayDvdList(dvdList);
            String title = view.getDvdTitle();

        if (dvdList.contains(title)) {   
            Dvd editDvd = view.getNewDvdInfo();
            dao.removeDvd(title);
            dao.editDvd(editDvd.getTitle(), editDvd);
            view.displayEditDvdSuccessBanner();
        } else {
            view.noDvdToEdit();
            createDvd();

        }
    }
}
}

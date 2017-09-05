/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvdlibrary.Controller;

import com.mycompany.dvdlibrary.DTO.Dvd;
import com.mycompany.dvdlibrary.Dao.DvdLibraryDAO;
import com.mycompany.dvdlibrary.UI.View;
import java.util.List;

/**
 *
 * @author jyoun
 */

public class DvdLibraryController  {
    DvdLibraryDAO dao;
    View view;

    public DvdLibraryController(DvdLibraryDAO dao, View view) {
        
    this.dao = dao;
    this.view = view;
    }



    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;

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

    private void listDvds() {
        view.displayDisplayAllBanner();
        List<Dvd> studentList = dao.getAllDvds();
        view.displayDvdList(studentList);
    }

    private void viewDvd() {
        view.displayDisplayDvdBanner();
        String title = view.getDvdTitleChoice();
        Dvd dvd = dao.getDvd(title);
        view.displayDvd(dvd);

    }
    private void removeDvd() {
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
    private void editDvd(){
        view.displayEditDvdBanner();
        String title = view.getDvdTitle();
        Dvd editDvd = view.getNewDvdInfo();
        dao.editDvd(editDvd.getTitle(), editDvd);
        view.displayEditDvdSuccessBanner();
        
    }
}
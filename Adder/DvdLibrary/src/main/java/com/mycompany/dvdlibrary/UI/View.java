/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvdlibrary.UI;

import com.mycompany.dvdlibrary.DTO.Dvd;
import java.util.List;

/**
 *
 * @author jyoun
 */

public class View{
    
    private UserIO io;    
    public View(UserIO io) {
        this.io = io;
    }
    
    public int printMenuAndGetSelection() {
            io.print("Main Menu");
            io.print("1. Add DVDs");
            io.print("2. Remove DVD");
            io.print("3. Edit info");
            io.print("4. List all DVD's");
            io.print("5. List info for particular DVD");
            io.print("6. Exit");
            
            return io.readInt("Please select from one of the choices", 1, 6);
    }
    
    public Dvd getNewDvdInfo() {
        String title = io.readString("Please enter a title");
        String releaseDate = io.readString("Please enter a release date, example : " + "May 18, 2015");
        String rating = io.readString("Please enter a rating.");
        String directorName = io.readString("Please enter director name.");
        String studio = io.readString("Please enter the studio.");
        String note = io.readString("Please enter any notes or comments.");
        Dvd currentDvd = new Dvd(title);
        currentDvd.setTitle(title);
        currentDvd.setReleaseDate(releaseDate);
        currentDvd.setRating(rating);
        currentDvd.setDirectorName(directorName);
        currentDvd.setStudio(studio);
        currentDvd.setNote(note);
        return currentDvd;
    }
    public String getDvdTitle() {
        return io.readString("Enter the DVD Title.");
    }
    public void displayCreateDvdBanner() {
        io.print("=== Create Dvd ===");
    }
    public void displayCreateSuccessBanner() {
        io.print("DVD created successfully, please hit enter to continue.");
    }
    public void displayDvdList(List<Dvd> dvdList) {
        for(Dvd currentDvd : dvdList) {
            io.print(currentDvd.getReleaseDate() + ": "
                    + currentDvd.getTitle() + ", Director: "
                    + currentDvd.getDirectorName() + ", Rating: "
                    + currentDvd.getRating() + " Studio: "
                    + currentDvd.getStudio() + " Notes: "
                    + currentDvd.getNote());
        }
    }
    public void displayDisplayAllBanner() {
        io.print("=== Display All DVD's ===");
    }
    public void displayDisplayDvdBanner () {
        io.print("=== Display DVD ===");
    }
    public String getDvdTitleChoice() {
        return io.readString("Enter a DVD title");
    }
    public void displayDvd(Dvd dvds) {
        if (dvds != null) {
            io.print(dvds.getTitle());
            io.print(dvds.getDirectorName());
            io.print(dvds.getStudio());
            io.print(dvds.getReleaseDate());
            io.print(dvds.getNote());
            io.print(dvds.getRating());
            io.print("");
        } else {
            io.print("No such DVD");
        }
    }
    public void displayRemoveDvd () {
        io.print("=== Remove DVD ===");
    }
    public void displayRemoveSuccessBanner () {
        io.print("DVD successfully removed.");
    }
    public void displayExitBanner () {
        io.print("Good Bye!");
    }
    public void displayUnknownCommandBanner () {
        io.print("Unknown command, please input one of the given commands!");
    }
    public void displayEditDvdBanner() {
        io.print("=== Edit DVD ===");
    }
    
    public void displayEditDvdSuccessBanner() {

        io.print("The DVD was edited and updated in the library. Please hit enter to continue.");
    }
    public void displayErrorMessage(String errorMsg) {
        io.print("=== ERRROR ===");
        io.print(errorMsg);
        
    }
    public void noDvdToEdit() {
        io.print("There is no DVD to edit.  Please add DVD to the library");
    }
    public void enterNewInfo() {
        io.print("Please input updated information for this DVD.");
    }


}


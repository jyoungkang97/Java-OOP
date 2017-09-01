/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvdlibrary.UI;

import com.mycompany.dvdlibrary.DTO.Dvd;

/**
 *
 * @author jyoun
 */
public class View {
    UserIO io = new UserIOImpl();
    
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
        Integer rating = io.readInt("Please enter a number 1-10.");
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
    public void displayCreateDvdBanner() {
        io.print("=== Create Dvd ===");
    }
    public void displayCreateSuccessBanner() {
        io.print("DVD created successfully, please hit enter to continue.");
    }
}


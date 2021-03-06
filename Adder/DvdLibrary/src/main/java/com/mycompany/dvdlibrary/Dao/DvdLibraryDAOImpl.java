/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvdlibrary.Dao;

import com.mycompany.dvdlibrary.DTO.Dvd;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author jyoun
 */
public class DvdLibraryDAOImpl implements DvdLibraryDAO {

    public static final String ROSTER_FILE = "Library.txt";
    public static final String DELIMITER = "::";

    private final Map<String, Dvd> Dvds = new HashMap<>();

    @Override
    public Dvd addDvd(String title, Dvd dvd)
            throws DvdExceptionsDAO {
        Dvd newDvd = Dvds.put(title, dvd);
        writeRoster();
        return newDvd;
    }

    @Override
    public List<Dvd> getAllDvds()
            throws DvdExceptionsDAO {
        loadRoster();
        return new ArrayList<Dvd>(Dvds.values());
    }

    @Override
    public Dvd getDvd(String title)
            throws DvdExceptionsDAO {
        loadRoster();
        return Dvds.get(title);
    }

    @Override
    public Dvd removeDvd(String title)
            throws DvdExceptionsDAO {
        Dvd removedDvd = Dvds.remove(title);
        writeRoster();
        return removedDvd;
    }

    public Dvd editDvd(String title, Dvd dvd) {
        Dvd editedDvd = Dvds.put(title, dvd);
        return editedDvd;
    }

    private void loadRoster() throws DvdExceptionsDAO {
        Scanner sc;
        try {
            sc = new Scanner(
                    new BufferedReader(
                            new FileReader(ROSTER_FILE)));
        } catch (FileNotFoundException e) {
            throw new DvdExceptionsDAO(
                    "Could not load roster data into memory.");
        }
        String currentLine;
        String[] currentTokens;
        while (sc.hasNextLine()) {
            currentLine = sc.nextLine();
            currentTokens = currentLine.split(DELIMITER);
            Dvd currentDvd = new Dvd(currentTokens[0]);
            currentDvd.setDirectorName(currentTokens[1]);
            currentDvd.setReleaseDate(currentTokens[2]);
            currentDvd.setStudio(currentTokens[3]);
            currentDvd.setRating(currentTokens[4]);
            currentDvd.setNote(currentTokens[5]);
            
            Dvds.put(currentDvd.getTitle(), currentDvd);
        }
        sc.close();
    }

    private void writeRoster() throws DvdExceptionsDAO {
        PrintWriter out;
        try {
            out = new PrintWriter(new FileWriter(ROSTER_FILE));
        } catch (IOException e) {
            throw new DvdExceptionsDAO(
                    "Could not save student Data.");
        }

        List<Dvd> dvdList = this.getAllDvds();
        for (Dvd currentDvd : dvdList) {
            out.println(currentDvd.getTitle() + DELIMITER
                    + currentDvd.getDirectorName() + DELIMITER
                    + currentDvd.getReleaseDate() + DELIMITER
                    + currentDvd.getStudio() + DELIMITER
                    + currentDvd.getRating() + DELIMITER
                    + currentDvd.getNote());
            out.flush();
        }
        out.close();
    }
}

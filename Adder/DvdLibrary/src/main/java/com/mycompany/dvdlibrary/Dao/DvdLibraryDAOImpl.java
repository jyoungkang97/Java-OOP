/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvdlibrary.Dao;

import com.mycompany.dvdlibrary.DTO.Dvd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author jyoun
 */
public class DvdLibraryDAOImpl implements DvdLibraryDAO {
    private Map<String, Dvd> Dvds = new HashMap<>();
    
    
    @Override
    public Dvd addDvd(String title, Dvd dvd) {
        Dvd newDvd = Dvds.put(title, dvd);
        return newDvd;
    }

    @Override
    public List<Dvd> getAllDvds() {
        return new ArrayList<Dvd>(Dvds.values());
    }

    @Override
    public Dvd getDvd(String title) {
        return Dvds.get(title);
    }

    @Override
    public Dvd removeDvd(String title) {
        Dvd removedDvd = Dvds.remove(title);
        return removedDvd;
    }
    public Dvd editDvd(String title, Dvd dvd) {
        Dvd editedDvd = Dvds.put(title, dvd);
        return editedDvd;
    }
}


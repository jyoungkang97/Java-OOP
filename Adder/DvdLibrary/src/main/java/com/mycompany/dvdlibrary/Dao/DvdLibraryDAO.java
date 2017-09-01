/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvdlibrary.Dao;

import com.mycompany.dvdlibrary.DTO.Dvd;
import java.util.List;

/**
 *
 * @author jyoun
 */
public interface DvdLibraryDAO {

    Dvd addDvd(String title, Dvd dvd);

    List<Dvd> getAllDvds();
    
    Dvd getDvd(String dvd);
    
    Dvd removeDvd(String dvd);
}
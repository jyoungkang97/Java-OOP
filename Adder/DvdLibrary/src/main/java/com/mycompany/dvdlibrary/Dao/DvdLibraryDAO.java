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

    Dvd addDvd(String title, Dvd dvd) throws DvdExceptionsDAO;
    
    List<Dvd> getAllDvds() throws DvdExceptionsDAO;
    
    Dvd getDvd(String dvd) throws DvdExceptionsDAO;
    
    Dvd removeDvd(String dvd) throws DvdExceptionsDAO;
    
    Dvd editDvd(String title, Dvd dvd) throws DvdExceptionsDAO;
}
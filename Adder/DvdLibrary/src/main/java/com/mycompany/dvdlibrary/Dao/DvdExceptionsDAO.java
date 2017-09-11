/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvdlibrary.Dao;

/**
 *
 * @author jyoun
 */
public class DvdExceptionsDAO extends Exception {

    public DvdExceptionsDAO(String message) {
        super(message);
    }

    public DvdExceptionsDAO(String message, Throwable cause) {
        super(message, cause);
    }
}

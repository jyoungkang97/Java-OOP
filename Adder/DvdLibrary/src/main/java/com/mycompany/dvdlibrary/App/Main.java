/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dvdlibrary.App;

import com.mycompany.dvdlibrary.Controller.DvdLibraryController;

/**
 *
 * @author jyoun
 */
public class Main {
    public static void main(String[] args) {
         DvdLibraryController controller = new DvdLibraryController();
         controller.run();
    }
}

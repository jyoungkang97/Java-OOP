/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.main;

import com.mycompany.classroster.dao.ClassRosterAuditDAO;
import com.mycompany.classroster.dao.ClassRosterAuditDAOImpl;
import com.mycompany.classroster.dao.ClassRosterDAO;
import com.mycompany.classroster.dao.ClassRosterDAOImpl;
import com.mycompany.controller.Controller;
import com.mycompany.service.ServiceLayer;
import com.mycompany.service.ServiceLayerImpl;
import com.mycompany.ui.View;
import com.mycompany.ui.userIO;
import com.mycompany.ui.userIOImpl;

/**
 *
 * @author jyoun
 */
public class Main {
    
    public static void main(String[] args) {
    userIO myIo = new userIOImpl();
    View myView = new View(myIo);
    ClassRosterDAO myDao = new ClassRosterDAOImpl();
    ClassRosterAuditDAO myAuditDao = new ClassRosterAuditDAOImpl();
    ServiceLayer myService = new ServiceLayerImpl(myDao, myAuditDao);
    Controller controller = new Controller(myService, myView);
    controller.run();
}
}

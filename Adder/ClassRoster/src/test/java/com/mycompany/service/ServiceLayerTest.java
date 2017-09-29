/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.classroster.dao.ClassRosterAuditDAO;
import com.mycompany.classroster.dao.ClassRosterAuditDAOStubImpl;
import com.mycompany.classroster.dao.ClassRosterDAO;
import com.mycompany.classroster.dao.ClassRosterDAOStubImpl;
import com.mycompany.classroster.dto.Student;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author jyoun
 */
public class ServiceLayerTest {
    private final ServiceLayer service;
    
    public ServiceLayerTest() {
        ClassRosterDAO dao = new ClassRosterDAOStubImpl();
        ClassRosterAuditDAO auditDao = new ClassRosterAuditDAOStubImpl();
        
        service = new ServiceLayerImpl(dao, auditDao);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of createStudent method, of class ServiceLayer.
     * @throws java.lang.Exception
     */
    @Test
    public void testCreateStudent() throws Exception {
        Student student = new Student("004");
        student.setFirstName("John");
        student.setLastName("Doe");
        student.setCohort("Minneapolis Java");
        service.createStudent(student);
    }
    
    @Test
    public void createStudentDuplicateId() throws Exception {
        Student student = new Student("001");
        student.setFirstName("John");
        student.setLastName("Doe");
        student.setCohort("Minneapolis Java");
        
        
        try {
            service.createStudent(student);
            fail("Expected ClassRosterDuplicateIdException was not thrown.");
        } catch (ClassRosterDuplicateIdException e) {
            return;
        }
    }
    @Test
    public void testCreateStudentInvalidData() throws Exception {
        Student student = new Student("004");
        student.setFirstName("");
        student.setLastName("Doe");
        student.setCohort("Minneapolis Java");
        
        
        try {
        service.createStudent(student);
        fail("Expected ClassRosterDataValidationException was not thrown.");
        } catch (ClassRosterDataValidationException e) {
            return;
            }
    }
    /**
     * Test of getAllStudents method, of class ServiceLayer.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetAllStudents() throws Exception {
        assertEquals(1, service.getAllStudents().size());
    }

    /**
     * Test of getStudent method, of class ServiceLayer.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetStudent() throws Exception {
        Student student = service.getStudent("001");
        assertNotNull(student);
        student = service.getStudent("999");
        assertNull(student);
    }

    /**
     * Test of removeStudent method, of class ServiceLayer.
     */
    @Test
    public void testRemoveStudent() throws Exception {
        Student student = service.removeStudent("001");
        assertNotNull(student);
        student = service.removeStudent("999");
        assertNull(student);
    }
}

    

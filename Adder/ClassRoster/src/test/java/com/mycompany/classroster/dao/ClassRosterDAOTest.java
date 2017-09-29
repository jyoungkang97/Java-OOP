/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classroster.dao;

import com.mycompany.classroster.dto.Student;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jyoun
 */
public class ClassRosterDAOTest {
    private ClassRosterDAO dao = new ClassRosterDAOImpl();
    
    public ClassRosterDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception{
        List<Student>studentList = dao.getAllStudents();
        for (Student student : studentList) {
            dao.removeStudent(student.getStudentId());
        }
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addStudent method, of class ClassRosterDAO.
     */
    @Test
    public void testAddGetStudent() throws Exception {
        Student student = new Student("001");
        student.setFirstName("Joe");
        student.setLastName("Doe");
        student.setCohort("Minneapolis Java");
        
        dao.addStudent(student.getStudentId(), student);
        
        Student fromDao = dao.getStudent(student.getStudentId());
        
        assertEquals(student, fromDao);
    }

    /**
     * Test of getAllStudents method, of class ClassRosterDAO.
     */
    @Test
    public void testGetAllStudents() throws Exception {
        Student student1 = new Student("002");
        student1.setFirstName("James");
        student1.setLastName("Kang");
        student1.setCohort("Minneapolis Java");
        dao.addStudent(student1.getStudentId(), student1);
        
        Student student2 = new Student("003");
        student2.setFirstName("Mckenna");
        student2.setLastName("Carter");
        student2.setCohort("Minneapolis .NET");
        dao.addStudent(student2.getStudentId(), student2);
        
        assertEquals(2, dao.getAllStudents().size());
    }

    /**
     * Test of removeStudent method, of class ClassRosterDAO.
     */
    @Test
    public void testRemoveStudent() throws Exception {
        Student student1 = new Student("002");
        student1.setFirstName("James");
        student1.setLastName("Kang");
        student1.setCohort("Minneapolis Java");
        dao.addStudent(student1.getStudentId(), student1);
        
        Student student2 = new Student("003");
        student2.setFirstName("Mckenna");
        student2.setLastName("Carter");
        student2.setCohort("Minneapolis .NET");
        dao.addStudent(student2.getStudentId(), student2);
        
        
        dao.removeStudent(student1.getStudentId());
        assertEquals(1, dao.getAllStudents().size());
        assertNull(dao.getStudent(student1.getStudentId()));
        
        dao.removeStudent(student2.getStudentId());
        assertEquals(0, dao.getAllStudents().size());
        assertNull(dao.getStudent(student2.getStudentId()));
        
       
    }

    
}

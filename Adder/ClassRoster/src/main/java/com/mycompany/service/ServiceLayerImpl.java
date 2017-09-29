/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.service;

import com.mycompany.classroster.dao.ClassRosterAuditDAO;
import com.mycompany.classroster.dao.ClassRosterDAO;
import com.mycompany.classroster.dao.ClassRosterPersistenceException;
import com.mycompany.classroster.dto.Student;
import java.util.List;

/**
 *
 * @author jyoun
 */



public class ServiceLayerImpl implements ServiceLayer {
    ClassRosterDAO dao;
    private ClassRosterAuditDAO auditDao;
   
public ServiceLayerImpl(ClassRosterDAO dao, ClassRosterAuditDAO auditDao) {
    this.auditDao = auditDao;
    this.dao = dao;
}

    @Override
    public void createStudent(Student student) throws ClassRosterDuplicateIdException, ClassRosterDataValidationException, ClassRosterPersistenceException {
         if (dao.getStudent(student.getStudentId()) != null) {
        throw new ClassRosterDuplicateIdException(
                "ERROR: Could not create student.  Student Id "
                + student.getStudentId()
                + " already exists");
    }
         validateStudentData(student);
         dao.addStudent(student.getStudentId(), student);
         auditDao.writeAuditEntry("Student " + student.getStudentId() + " CREATED.");
    }

    @Override
    public List<Student> getAllStudents() throws ClassRosterPersistenceException {
        return dao.getAllStudents();
    }

    @Override
    public Student getStudent(String studentId) throws ClassRosterPersistenceException {
        return dao.getStudent(studentId);
    }

    @Override
    public Student removeStudent(String studentId) throws ClassRosterPersistenceException {
        Student removedStudent = dao.removeStudent(studentId);
        auditDao.writeAuditEntry("Student " + studentId + " REMOVED.");
        return dao.removeStudent(studentId);
    }
    private void validateStudentData(Student student) throws
        ClassRosterDataValidationException {

    if (student.getFirstName() == null
            || student.getFirstName().trim().length() == 0
            || student.getLastName() == null
            || student.getLastName().trim().length() == 0
            || student.getCohort() == null
            || student.getCohort().trim().length() == 0) {

        throw new ClassRosterDataValidationException(
                "ERROR: All fields [First Name, Last Name, Cohort] are required.");
    }
}

}

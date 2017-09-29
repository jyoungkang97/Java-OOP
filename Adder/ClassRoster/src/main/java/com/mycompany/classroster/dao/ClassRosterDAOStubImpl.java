/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.classroster.dao;

import com.mycompany.classroster.dto.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jyoun
 */
public class ClassRosterDAOStubImpl implements ClassRosterDAO {

    Student onlyStudent;
    List<Student> studentList = new ArrayList<>();

    public ClassRosterDAOStubImpl() {
        onlyStudent = new Student("001");
        onlyStudent.setFirstName("James");
        onlyStudent.setLastName("Kang");
        onlyStudent.setCohort("Minneapolis Java");

        studentList.add(onlyStudent);
    }

    @Override
    public Student addStudent(String studentId, Student student) throws ClassRosterPersistenceException {
        if (studentId.equals(onlyStudent.getStudentId())) {
            return onlyStudent;
        } else {
            return null;
        }
    }

    @Override
    public List<Student> getAllStudents() throws ClassRosterPersistenceException {
        return studentList;
    }

    @Override
    public Student getStudent(String studentId) throws ClassRosterPersistenceException {
        if (studentId.equals(onlyStudent.getStudentId())) {
            return onlyStudent;
        } else {
            return null;
        }
    }

    @Override
    public Student removeStudent(String studentId) throws ClassRosterPersistenceException {
        if (studentId.equals(onlyStudent.getStudentId())) {
            return onlyStudent;
        } else {
            return null;
        }
    }

}

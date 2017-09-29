/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ui;

import com.mycompany.classroster.dto.Student;
import java.util.List;

/**
 *
 * @author jyoun
 */
public class View {
    private userIO io;
    
    public View (userIO io) {
        this.io = io;
    }



    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. List Student IDs");
        io.print("2. Create New Student");
        io.print("3. View a Student");
        io.print("4. Remove a Student");
        io.print("5. Exit");

        return io.readInt("Please select from the above choices.", 1, 5);
    }
    
    public Student getNewStudentInfo() {
        String studentId = io.readString("Please enter Student ID");
        String firstName = io.readString("Please enter the First Name");
        String lastName = io.readString("Please eneter the Last Name");
        String cohort = io.readString("Please enter the Cohort attended");
        
        Student currentStudent = new Student(studentId);
        
        currentStudent.setFirstName(firstName);
        currentStudent.setLastName(lastName);
        currentStudent.setCohort(cohort);
        return currentStudent;
    }
    public void displayDisplayStudentBanner() {
        io.print("=== DISPLAY STUDENT ===");
    }
    public void displayCreateStudentBanner() {
        io.print("=== CREATE STUDENT ===");
    }
    public void displayCreateSuccessBanner(){
        io.print("=== STUDENT SUCCESSFULLY CREATED. HIT ENTER TO CONTINUE");
    }
    public void displayDisplayAllBanner() {
        io.print("=== DISPLAY ALL STUDENTS ===");
    }
    public void displayStudentList(List<Student> studentList) {
        for (Student currentStudent : studentList)
        {
            io.print(currentStudent.getStudentId()
            + ": "
            + currentStudent.getFirstName()
            + ": "
            + currentStudent.getLastName()
            + ": "
            + currentStudent.getCohort());
        }
        io.readString("Please hit enter to continue.");
    }
    public String getStudentIdChoice() {
        return io.readString("Please enter the Student ID.");
    }
    public void displayStudent(Student student) {
        if (student != null) {
            io.print(student.getStudentId());
            io.print(student.getFirstName() + " " + student.getLastName());
            io.print(student.getCohort());
            io.print("");
        } else {
            io.print("No such student exists.");
              
        }
        io.readString("Please hit enter to continue.");
    }
    public void displayRemoveSuccessBanner () {
            io.readString("Student succesfully removed, enter ok to continue.");
    }
    public void displayRemoveStudentBanner () {
            io.readString("=== REMOVE STUDENT ===");
    }
    public void displayExitBanner() {
        io.print("GOOD BYE!");
    }
    public void displayUnknownCommandBanner () {
        io.print("Unknown Command!!");
    }
    public void displayErrorMessage(String errorMsg) {
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }
}

package com.wwsis.sss.dao;

import java.util.List;

public interface StudentDao {
    List<Student> getAllStudents();
    Student getStudentById(int studentId);
    void addStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(int studentId);
}
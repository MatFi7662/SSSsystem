package com.wwsis.sss.dao;

import com.wwsis.sss.entity.Student;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
    private List<Student> students = new ArrayList<>();

    @Override
    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public Student getStudentById(int studentId) {
        return students.stream().filter(s -> s.getId() == studentId).findFirst().orElse(null);
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void updateStudent(Student student) {
        int index = students.indexOf(getStudentById(student.getId()));
        if (index >= 0) {
            students.set(index, student);
        }
    }

    @Override
    public void deleteStudent(int studentId) {
        students.removeIf(s -> s.getId() == studentId);
    }
}

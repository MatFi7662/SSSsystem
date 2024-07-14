package com.wwsis.sss.dao;

import com.wwsis.sss.entity.Grade;
import java.util.ArrayList;
import java.util.List;

public class GradesDaoImpl implements GradesDao {
    private List<Grade> grades = new ArrayList<>();

    @Override
    public List<Grade> getAllGrades() {
        return grades;
    }

    @Override
    public Grade getGradeById(int gradeId) {
        return grades.stream().filter(g -> g.getId() == gradeId).findFirst().orElse(null);
    }

    @Override
    public void addGrade(Grade grade) {
        grades.add(grade);
    }

    @Override
    public void updateGrade(Grade grade) {
        int index = grades.indexOf(getGradeById(grade.getId()));
        if (index >= 0) {
            grades.set(index, grade);
        }
    }

    @Override
    public void deleteGrade(int gradeId) {
        grades.removeIf(g -> g.getId() == gradeId);
    }
}

package com.wwsis.sss.dao;

import java.util.List;

public interface GradesDao {
    List<Grade> getAllGrades();
    Grade getGradeById(int gradeId);
    void addGrade(Grade grade);
    void updateGrade(Grade grade);
    void deleteGrade(int gradeId);
}

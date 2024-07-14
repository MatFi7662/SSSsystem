package com.wwsis.sss.dao;

import java.util.List;

public interface SubjectsDao {
    List<Subject> getAllSubjects();
    Subject getSubjectDetails(int subjectId);
    void addSubject(Subject subject);
    void updateSubject(Subject subject);
    void deleteSubject(int subjectId);
}

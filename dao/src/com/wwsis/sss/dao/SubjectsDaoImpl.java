package com.wwsis.sss.dao;

import com.wwsis.sss.entity.Subject;
import java.util.ArrayList;
import java.util.List;

public class SubjectsDaoImpl implements SubjectsDao {
    private List<Subject> subjects = new ArrayList<>();

    @Override
    public List<Subject> getAllSubjects() {
        return subjects;
    }

    @Override
    public Subject getSubjectDetails(int subjectId) {
        return subjects.stream().filter(s -> s.getId() == subjectId).findFirst().orElse(null);
    }

    @Override
    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    @Override
    public void updateSubject(Subject subject) {
        int index = subjects.indexOf(getSubjectDetails(subject.getId()));
        if (index >= 0) {
            subjects.set(index, subject);
        }
    }

    @Override
    public void deleteSubject(int subjectId) {
        subjects.removeIf(s -> s.getId() == subjectId);
    }
}

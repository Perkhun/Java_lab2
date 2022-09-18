package task3.service;

import task2.Group;
import task2.Student;
import task2.Subject;

import java.util.HashMap;

public class AddNewSubjectService {
   // private University university;
    private Group group;

    public AddNewSubjectService(final Group group) {
        this.group = group;
    }

    public void addSubject(final String nameOfGroup, final String nameOfSubject) {
        for (final Student student : group.getStudent()) {
            if (student.getGroup().equals(nameOfGroup)) {
                student.getSubject().add(new Subject(nameOfSubject, new HashMap<>()));
            }
        }
    }
}

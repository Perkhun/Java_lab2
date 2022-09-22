package task3.service;

import task2.Group;
import task2.Student;
import task2.Subject;


public class AddNewSubjectService {

    final private Group group;

    public AddNewSubjectService(final Group group) {
        this.group = group;
    }

    public void addSubject(final Subject subject) {
        if (!group.getStudent().isEmpty()) {
            group.getStudent().get(0).getSubject().add(subject); //because all subjects of students in the same group must be the same
        }
    }
}

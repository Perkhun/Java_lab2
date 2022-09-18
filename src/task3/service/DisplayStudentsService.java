package task3.service;

import task2.Group;
import task2.Student;
import task2.Subject;

import java.util.ArrayList;
import java.util.List;

public class DisplayStudentsService {
    private Group group;

    public DisplayStudentsService(final Group group) {
        this.group = group;
    }

    public List<Student> getStudents(final String nameOfSubject) {
        final List<Student> studentList = new ArrayList<>();
        for (final Student student : group.getStudent()) {
           final List<Subject> subjectList = new ArrayList<>();
            for (final Subject subject : student.getSubject()) {
                if (subject.getNameOfSubject().equals(nameOfSubject))
                studentList.add(student);
            }

        }
        return studentList;
    }

    public void displayStudents(final List<Student> students) {
        for (final Student student : students) {
            System.out.println((student.getSurnameOfStudent() + student.getGroup()));
        }
    }


}

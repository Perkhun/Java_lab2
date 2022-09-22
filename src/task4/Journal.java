package task4;

import task2.Group;
import task2.Student;
import task2.Subject;
import task2.University;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Journal {
    private Student student;
    private Map<Subject, Integer> marksPerSubject;
    public Student getStudent() {
        return student;
    }

    public void setStudent(final Student student) {
        this.student = student;
    }

    public Map<Subject, Integer> getMarksPerSubject() {
        return marksPerSubject;
    }

    public void setMarksPerSubject(final Map<Subject, Integer> marksPerSubject) {
        this.marksPerSubject = marksPerSubject;
    }

    public Journal(final Student student, final Map<Subject, Integer> marksPerSubject) {
        this.student = student;
        this.marksPerSubject = marksPerSubject;
    }

    public Journal(final University university, final Student student) {
        this.student = student;
        this.marksPerSubject = new HashMap<Subject, Integer>();
        final Group group = university.getGroups().stream().filter(e -> e.getStudent().contains(student)).findFirst().orElse(null);
        if (group == null) {
            throw new InvalidParameterException();
        }
        final int index = group.getStudent().indexOf(student);
        final Student searchedStudent = group.getStudent().get(index);

        for (final Subject subject : searchedStudent.getSubject()) {
            marksPerSubject.put(subject, subject.getMapStudentMark().get(student));
        }
    }

    @Override
    public String toString() {
        String string = "";
        string += student.getNameOfStudent() + '\n';
        for (final Map.Entry<Subject, Integer> subjectIntegerEntry : marksPerSubject.entrySet()) {
            string += subjectIntegerEntry.getKey().getNameOfSubject() + ": " + subjectIntegerEntry.getValue() + '\n';
        }
        return string;
    }

    public static List<Journal> getAllStudents(final University university) {
        final List<Journal> journals = new ArrayList<Journal>();
        for (final Group group : university.getGroups()) {
            group.getStudent().forEach(e -> journals.add(new Journal(university, e)));
        }
        return journals;
    }

    public static void displayAllStudents(final University university) {
        getAllStudents(university).forEach(System.out::println);
    }

    public static List<Integer> getAllSubject(final University university, final Subject subject) {
        final List<Integer> marks = new ArrayList<Integer>();
        final List<Journal> journals = Journal.getAllStudents(university);
        for (final Journal journal : journals) {
            final Integer mark = journal.marksPerSubject.get(subject);
            if (mark != null) {
                marks.add(mark);
            }
        }
        return marks;
    }

    public static void displayAllSubject(final University university, final Subject subject) {
        getAllSubject(university, subject).forEach(e -> System.out.print(e + ","));
        System.out.println();
    }
}


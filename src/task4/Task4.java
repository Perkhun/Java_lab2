package task4;

import task2.Student;
import task2.Subject;
import task2.Task2;
import task2.University;

public class Task4 {
    public static void main(final String[] args) {
        final University university = Task2.ourUniversity();
        final Student student = university.getGroups().get(1).getStudent().get(1); // second student of second group
        final Subject subject = university.getGroups().get(0).getStudent().get(0).getSubject().get(0); // first subject of first group
        final Journal journal = new Journal(university, student);
        System.out.println(journal);
        System.out.println();
        Journal.displayAllStudents(university);
        System.out.println();
        Journal.displayAllSubject(university, subject);
    }
}

package task3.service;

import task2.Group;
import task2.Student;
import task2.Subject;
import task2.University;

import java.time.LocalDate;

public class AddDateService {
    final private University university;

    public AddDateService(final University university) {
        this.university = university;
    }

    public void addDate(final Group group, final Subject subject, final LocalDate date) {
        for(final Student student : group.getStudent()) {
            student.getSchedule().getMapSubjectDates().get(subject).add(date);
        }
    }
}

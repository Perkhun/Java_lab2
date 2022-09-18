package task2;

import java.util.List;
import java.util.Objects;

public class Student {
    private Schedule schedule;
    private Group group;
    private String nameOfStudent;
    private String surnameOfStudent;
    private List<Subject> subject;



    public Student() {
    }

    public Student(final String nameOfStudent, final String surnameOfStudent, final Group group, final Schedule schedule, final List<Subject> subject) {
        this.schedule = schedule;
        this.nameOfStudent = nameOfStudent;
        this.surnameOfStudent = surnameOfStudent;
        this.group = group;
        this.subject = subject;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setTimeTables(final Schedule schedule) {
        this.schedule = schedule;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public void setNameOfStudent(final String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public String getSurnameOfStudent() {
        return surnameOfStudent;
    }

    public void setSurnameOfStudent(final String surnameOfStudent) {
        this.surnameOfStudent = surnameOfStudent;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(final Group group) {
        this.group = group;
    }

    public void setSchedule(final Schedule schedule) {
        this.schedule = schedule;
    }

    public List<Subject> getSubject() {
        return subject;
    }

    public void setSubject(final List<Subject> subject) {
        this.subject = subject;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Student student = (Student) o;
        return schedule.equals(student.schedule) && group.equals(student.group) && nameOfStudent.equals(student.nameOfStudent) && surnameOfStudent.equals(student.surnameOfStudent) && subject.equals(student.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schedule, nameOfStudent, surnameOfStudent);
    }

    @Override
    public String toString() {
        return "Student{" +
                "schedule=" + schedule +
                ", group=" + group.getNameOfGroup() +
                ", nameOfStudent='" + nameOfStudent + '\'' +
                ", surnameOfStudent='" + surnameOfStudent + '\'' +
                '}';
    }
}

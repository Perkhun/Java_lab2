package task2;

import java.util.Map;
import java.util.Objects;

public class Subject {
    private String nameOfSubject;
    private Map<Student, Integer> mapStudentMark;

    public Subject() {
    }

    public Subject(final String nameOfSubject, final Map<Student, Integer> mapStudentMark) {
        this.mapStudentMark = mapStudentMark;
        this.nameOfSubject = nameOfSubject;
    }

    public String getNameOfSubject() {
        return nameOfSubject;
    }

    public void setNameOfSubject(final String nameOfSubject) {
        this.nameOfSubject = nameOfSubject;
    }

    public Map<Student, Integer> getMapStudentMark() {
        return mapStudentMark;
    }

    public void setMapStudentMark(final Map<Student, Integer> mapStudentMark) {
        this.mapStudentMark = mapStudentMark;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Subject subject = (Subject) o;
        return nameOfSubject.equals(subject.nameOfSubject) && mapStudentMark.equals(subject.mapStudentMark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfSubject);
    }

    @Override
    public String toString() {
        return "Subject: " +
                "nameOfSubject: '" + nameOfSubject + '\''  +
                System.lineSeparator() +
                ", mapStudentMark: " + mapStudentMark +
                System.lineSeparator() +
                '}';
    }
}
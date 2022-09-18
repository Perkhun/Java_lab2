package task4;

import task2.Subject;

import java.util.List;
import java.util.Objects;

public class Days {
    private String nameOfDay;
    private List<Subject> subjects;

    public Days(final String nameOfDay, final List<Subject> subjects) {
        this.nameOfDay = nameOfDay;
        this.subjects = subjects;
    }

    public String getNameOfDay() {
        return nameOfDay;
    }

    public void setNameOfDay(final String nameOfDay) {
        this.nameOfDay = nameOfDay;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(final List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Days days = (Days) o;
        return nameOfDay.equals(days.nameOfDay) && subjects.equals(days.subjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfDay, subjects);
    }

    @Override
    public String toString() {
        return "Days: " +
                System.lineSeparator() +
                "nameOfDay: '" + nameOfDay + '\'' +
                System.lineSeparator() +
                ", subjects: " + subjects +
                System.lineSeparator() +
                '}';
    }
}

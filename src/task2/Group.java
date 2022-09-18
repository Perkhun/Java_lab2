package task2;

import java.util.List;


public class Group {
    private String nameOfGroup;
    private List<Student> student;


    public Group() {
    }

    public Group(final String nameOfGroup, final List<Student> student) {
        this.nameOfGroup = nameOfGroup;
        this.student = student;
    }

    public String getNameOfGroup() {
        return nameOfGroup;
    }

    public void setNameOfGroup(final String nameOfGroup) {
        this.nameOfGroup = nameOfGroup;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(final List<Student> student) {
        this.student = student;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Group group = (Group) o;
        return nameOfGroup.equals(group.nameOfGroup) && student.equals(group.student);
    }


    @Override
    public String toString() {
        return "Group: " +
                System.lineSeparator() +
                "nameOfGroup: '" + nameOfGroup + '\'' +
                System.lineSeparator() +
                ", student: " + student +
                System.lineSeparator() +
                '}';
    }
}

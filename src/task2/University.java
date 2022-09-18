package task2;

import java.util.List;

public class University {
    private List<Group> groups;
    private String nameOfUniversity;

    public University() {
    }

    public University(final String nameOfUniversity, final List<Group> groups) {
        this.groups = groups;
        this.nameOfUniversity = nameOfUniversity;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(final List<Group> groups) {
        this.groups = groups;
    }

    public String getNameOfUniversity() {
        return nameOfUniversity;
    }

    public void setNameOfUniversity(final String nameOfUniversity) {
        this.nameOfUniversity = nameOfUniversity;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final University that = (University) o;
        return groups.equals(that.groups) && nameOfUniversity.equals(that.nameOfUniversity);
    }


    @Override
    public String toString() {
        return "University: " +
                System.lineSeparator() +
                "nameOfUniversity: '" + nameOfUniversity + '\'' +
                System.lineSeparator() +
                "groups:" + groups +
                System.lineSeparator() +
                '}';
    }
}

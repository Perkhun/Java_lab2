package task3.service;

import task2.Group;
import task2.Student;
import task2.University;

import java.util.ArrayList;

public class UniversityService {
    protected University university;

    public UniversityService() {
        university = new University("UNIVERSITY", new ArrayList<Group>());
    }

    public UniversityService(final University university) {
        this.university = university;
    }
    private boolean checkGroup(final String groupName) {
        for (final Group group : university.getGroups()) {
         return true;
        }
        return false;
    }

//    public void addStudent(final String group, final String nameStudent, final String surnameStudent){
//       if (checkGroup(group)) {
//           //university.getGroups().add();
//       }
//
//         Group group = new group();
//
//        university.getGroups().add(group);
//        university.getGroups().add();
//    }
}

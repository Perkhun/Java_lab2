package task3.service;

import task2.Group;
import task2.Student;
import task2.University;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DisplaySortStudentService {
    private Group group;


    public DisplaySortStudentService(final Group group) {
        this.group = group;
    }

    public List<Student> getStudents() {
        final List<Student> studentList = new ArrayList<Student>(group.getStudent());
        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(final Student o1,final Student o2) {
                return o1.getSurnameOfStudent().compareTo(o2.getSurnameOfStudent());}
        }); return studentList;
    }


    public void displaySortStudent(final List<Student> students) {
      for (final Student student : students) {
          System.out.println(student.getSurnameOfStudent() + student.getGroup());
      }
    }

}




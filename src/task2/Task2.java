package task2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2 {
    public static University ourUniversity() {
        final University university = new University();
        university.setNameOfUniversity("UNIVERSITY");
        university.setGroups(new ArrayList<Group>());
        final Group group1 = new Group();
        group1.setNameOfGroup("IT-11");
        group1.setStudent(new ArrayList<>());
        final List<Subject> subject1 = List.of(
                new Subject("math", new HashMap<>()),
                new Subject("programming", new HashMap<>())
        );

        final Schedule schedule1 = new Schedule(
                Map.of(
                        subject1.get(0), List.of(LocalDate.of(2022, 10, 20)),
                        subject1.get(1), List.of(LocalDate.of(2022, 10, 21), LocalDate.of(2022, 10, 22))
                )

        );

        group1.getStudent().add(new Student("Sany", "Per", group1, schedule1, subject1));
         group1.getStudent().add(new Student("Mary", "Dub", group1, schedule1, subject1));

        subject1.get(0).getMapStudentMark().put(group1.getStudent().get(0), 70);
        subject1.get(0).getMapStudentMark().put(group1.getStudent().get(1), 60);
        subject1.get(1).getMapStudentMark().put(group1.getStudent().get(0), 55);
        subject1.get(1).getMapStudentMark().put(group1.getStudent().get(1), 63);


        university.getGroups().add(group1);


        final Group group2 = new Group();
        group2.setNameOfGroup("КН-21");
        group2.setStudent(new ArrayList<>());

        final List<Subject> subject2 = List.of(
                new Subject("programming", new HashMap<>()),
                new Subject("english", new HashMap<>())
        );
        final Schedule schedule2 = new Schedule(
                Map.of(
                        subject1.get(0), List.of(LocalDate.of(2022, 10, 11)),
                        subject1.get(1), List.of(LocalDate.of(2022, 10, 21), LocalDate.of(2022, 10, 19))
                )

        );

        group2.getStudent().add(
                new Student("Dave", "Rat", group2, schedule2, subject2));
        group2.getStudent().add(
                new Student("Mike", "Jonson", group2, schedule2, subject2));

        subject2.get(0).getMapStudentMark().put(group2.getStudent().get(0), 33);
        subject2.get(0).getMapStudentMark().put(group2.getStudent().get(1), 43);
        subject2.get(1).getMapStudentMark().put(group2.getStudent().get(0), 78);
        subject2.get(1).getMapStudentMark().put(group2.getStudent().get(1), 62);

        university.getGroups().add(group2);


        return university;
    }


    public static void main(final String[] args) {

        final University university = ourUniversity();
        System.out.println(university);
    }
}

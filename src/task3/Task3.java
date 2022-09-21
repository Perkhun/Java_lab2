package task3;

import task2.*;
import task3.service.AddDateService;
import task3.service.AddNewSubjectService;
import task3.service.DisplaySortStudentService;
import task3.service.DisplayStudentsService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Task3 {

    public static void main(final String[] args) {
//        final University university = ourUniversity();
//        System.out.println(university);

        //final Group group = new Group();

//        final AddNewSubjectService addNewSubject = new AddNewSubjectService(new Group());
//        addNewSubject.addSubject("IT-11", "English");
//        System.out.println(university);

//        final DisplaySortStudentService sortStudentService = new DisplaySortStudentService(group);
//        final List<Student> students = sortStudentService.getStudents();
//        sortStudentService.displaySortStudent(students);


        final University university = Task2.ourUniversity();
        ///////////////////////////////////////////////
        System.out.println(university);
        /////////////////////////////////////////////
        final AddNewSubjectService addNewSubject = new AddNewSubjectService(university.getGroups().get(1));
        addNewSubject.addSubject(new Subject("English", new HashMap<>())); // subject without marks yet
        //System.out.println(university);


        //checked by Sanya ;)
        final Group group0 = university.getGroups().get(0);
        final DisplaySortStudentService sortDis = new DisplaySortStudentService(group0);
        sortDis.displaySortStudent(sortDis.getStudents());

        final DisplayStudentsService displayStudentsService = new DisplayStudentsService(group0);
        System.out.println(displayStudentsService.getStudents("math"));

        final AddDateService addDateService = new AddDateService(university);
        addDateService.addDate(group0, group0.getStudent().get(0).getSubject().get(1), LocalDate.parse("2022-10-17"));
        System.out.println(university);

        /*////////////////////////////////////////////
        System.out.println(university);
        //////////////////////////////////////////////////////
        final DisplaySortStudentService sortStudentService = new DisplaySortStudentService(group1);
        final List<Student> students = sortStudentService.getStudents();
        sortStudentService.displaySortStudent(students);
        //////////////////////////////////////////////////////
        System.out.println(university);
        ///////////////////////////////////////////////////
        final DisplayStudentsService displayStudentsService = new DisplayStudentsService(group1);
        final List<Student> students1 = displayStudentsService.getStudents("math");
        displayStudentsService.displayStudents(students1);
        /////////////////////////////////
        System.out.println(university);
*/




    }
}

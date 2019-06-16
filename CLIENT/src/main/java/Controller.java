import Controllers.RequestController;
import DataBases.*;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;


public class Controller {

    public static void main(String args[]){
        Gson gson = new Gson();
        System.out.println("Deleting everything from DataBase");
        deleteAll();

        System.out.println("##############################################################################\n\n");
        System.out.println("University created...\n\n");
        System.out.println("Creating Courses");

        RequestController.post(URL.ADMIN_COURSE_URL, gson.toJson(new Course("Informatyka")));
        RequestController.post(URL.ADMIN_COURSE_URL, gson.toJson(new Course("Technologia Chemiczna")));
        RequestController.post(URL.ADMIN_COURSE_URL, gson.toJson(new Course("Mechanika i budowa maszyn")));

        System.out.println("There are created courses:\n");
        Course[] courses = gson.fromJson(RequestController.get(URL.COURSES_URL), Course[].class);
        Utils.printClass(courses);
        System.out.println("##############################################################################\n\n");


        System.out.println("Creating Subjects");
        RequestController.post(URL.ADMIN_SUBJECT_URL, gson.toJson(new Subject("Matematyka", "Cwiczenia", 4)));
        RequestController.post(URL.ADMIN_SUBJECT_URL, gson.toJson(new Subject("Matematyka", "Wyklad", 4)));

        RequestController.post(URL.ADMIN_SUBJECT_URL, gson.toJson(new Subject("Technologie Sieciowe 2", "Wyklad", 6)));
        RequestController.post(URL.ADMIN_SUBJECT_URL, gson.toJson(new Subject("Technologie Sieciowe 2", "Laboratioria", 6)));

        RequestController.post(URL.ADMIN_SUBJECT_URL, gson.toJson(new Subject("Systemy Operacyjne 2", "Laboratioria", 6)));
        RequestController.post(URL.ADMIN_SUBJECT_URL, gson.toJson(new Subject("Systemy Operacyjne 2", "Wyklad", 6)));


        RequestController.post(URL.ADMIN_SUBJECT_URL, gson.toJson(new Subject("Chemia ciała stałego", "Wyklad", 6)));
        RequestController.post(URL.ADMIN_SUBJECT_URL, gson.toJson(new Subject("Chemia ciała stałego", "Laboratiora", 6)));

        RequestController.post(URL.ADMIN_SUBJECT_URL, gson.toJson(new Subject("Technologia materiałów polimerowych", "Wyklad", 6)));
        RequestController.post(URL.ADMIN_SUBJECT_URL, gson.toJson(new Subject("Technologia materiałów polimerowych", "Cwiczenia", 6)));
        RequestController.post(URL.ADMIN_SUBJECT_URL, gson.toJson(new Subject("Technologia materiałów polimerowych", "Laboratoria", 6)));

        RequestController.post(URL.ADMIN_SUBJECT_URL, gson.toJson(new Subject("Technologia chemiczno organiczna", "Wyklad", 8)));
        RequestController.post(URL.ADMIN_SUBJECT_URL, gson.toJson(new Subject("Technologia chemiczno organiczna", "Laboratoria", 8)));

        RequestController.post(URL.ADMIN_SUBJECT_URL, gson.toJson(new Subject("Rysunek techniczny", "Cwiczenia", 2)));
        RequestController.post(URL.ADMIN_SUBJECT_URL, gson.toJson(new Subject("Rysunek techniczny", "Wyklad", 2)));

        RequestController.post(URL.ADMIN_SUBJECT_URL, gson.toJson(new Subject("Materialy Konstrukcyjne", "Wyklad", 3)));
        RequestController.post(URL.ADMIN_SUBJECT_URL, gson.toJson(new Subject("Materialy Konstrukcyjne", "Laboratoria", 3)));



        System.out.println("There are created subjects:");
        Subject[] subjects = gson.fromJson(RequestController.get(URL.SUBJECTS_URL), Subject[].class);
        Utils.printClass(subjects);
        System.out.println("##############################################################################\n\n");

        System.out.println("So... we've got University, Courses, Subjects. It' time to employee some teachers");
        System.out.println("Employing Teachers");

        RequestController.post(URL.ADMIN_TEACHER_URL, gson.toJson(
                new Teacher("dr", "Zenon Zbaszyniak", "zenon.zbaszyniak@put.poznan.pl",
                        new ArrayList<Integer>(Arrays.asList(1, 2, 3)),
                        new ArrayList<Integer>(Arrays.asList(4, 5)))));

        RequestController.post(URL.ADMIN_TEACHER_URL, gson.toJson(
                new Teacher("dr inż.", "Andrzej Szwabe", "andrzej.szwabe@put.poznan.pl",
                        new ArrayList<Integer>(Arrays.asList(1)),
                        new ArrayList<Integer>(Arrays.asList(6, 7)))));

        RequestController.post(URL.ADMIN_TEACHER_URL, gson.toJson(
                new Teacher("dr inż.", "Krzysztof Bucholc", "krzysztof.bucholc@put.poznan.pl",
                        new ArrayList<Integer>(Arrays.asList(1)),
                        new ArrayList<Integer>(Arrays.asList(8, 9)))));

        RequestController.post(URL.ADMIN_TEACHER_URL, gson.toJson(
                new Teacher("Profesor", "Maria Skłodowska-Curie", "maria.sklodowska.curie@put.poznan.pl",
                        new ArrayList<Integer>(Arrays.asList(2)),
                        new ArrayList<Integer>(Arrays.asList(10, 11, 12, 13, 14, 15, 16)))));

        RequestController.post(URL.ADMIN_TEACHER_URL, gson.toJson(
                new Teacher(null, "Leonardo da Vinci", "leonardo.da.vinci@put.poznan.pl",
                        new ArrayList<Integer>(Arrays.asList(3)),
                        new ArrayList<Integer>(Arrays.asList(17, 18, 19, 20)))));

        System.out.println("There are employeed teachers:\n");
        Teacher[] teachers = gson.fromJson(RequestController.get(URL.TEACHERS_URL), Teacher[].class);
        Utils.printClass(teachers);
        System.out.println("##############################################################################\n\n");


        System.out.println("We've got almost everything. There is just only lack of students");
        System.out.println("Recruiting Students");
        RequestController.post(URL.ADMIN_STUDENT_URL,
                gson.toJson(new Student(1, "Krzysztof Czarnecki", "Male", 22, "krzysztof.r.czarnecki@student.put.poznan.pl", "Kutno")));

        RequestController.post(URL.ADMIN_STUDENT_URL,
                gson.toJson(new Student(2, "Sylwia Modlinska", "Female", 22, "sylwia.modlinska@student.put.poznan.pl", "Kutno")));

        RequestController.post(URL.ADMIN_STUDENT_URL,
                gson.toJson(new Student(1, "Blazej Czekala", "Male", 20, "blazej.czekala@student.put.poznan.pl", "Pniewy")));

        RequestController.post(URL.ADMIN_STUDENT_URL,
                gson.toJson(new Student(1, "Miroslaw Blachowicz", "Male", 21, "miroslaw.blachowicz@student.put.poznan.pl", "Kopytkowo")));

        RequestController.post(URL.ADMIN_STUDENT_URL,
                gson.toJson(new Student(2, "Aneta Frycz", "Female", 21, "aneta.frycz@student.put.poznan.pl", "Poznan")));

        RequestController.post(URL.ADMIN_STUDENT_URL,
                gson.toJson(new Student(2, "Piotr Franczak", "Male", 21, "piotr.franczak@student.put.poznan.pl", "Szczebrzeszyn")));

        RequestController.post(URL.ADMIN_STUDENT_URL,
                gson.toJson(new Student(3, "Daniel Perka", "Male", 22, "daniel.perka@student.put.poznan.pl", "Kozia Gora")));

        RequestController.post(URL.ADMIN_STUDENT_URL,
                gson.toJson(new Student(3, "Alek", "Male", 24, "alek@student.put.poznan.pl", "Wydmowa Dolina")));

        Student[] students = gson.fromJson(RequestController.get(URL.STUDENTS_URL), Student[].class);
        Utils.printClass(students);
        System.out.println("Recruiting succeed");
        System.out.println("##############################################################################\n\n");


        System.out.println("Oh no. It's time for exams");
        RequestController.post(URL.ADMIN_GRADE_URL,
                gson.toJson(new Grade(26, 4, new ArrayList<>(Arrays.asList(2.0, 4.0)))));

        RequestController.post(URL.ADMIN_GRADE_URL,
                gson.toJson(new Grade(26, 5, new ArrayList<>(Arrays.asList(4.5)))));

        RequestController.post(URL.ADMIN_GRADE_URL,
                gson.toJson(new Grade(26, 6, new ArrayList<>(Arrays.asList(5.0)))));

        RequestController.post(URL.ADMIN_GRADE_URL,
                gson.toJson(new Grade(26, 7, new ArrayList<>(Arrays.asList(5.0)))));

        RequestController.post(URL.ADMIN_GRADE_URL,
                gson.toJson(new Grade(26, 8, new ArrayList<>(Arrays.asList(4.0)))));

        RequestController.post(URL.ADMIN_GRADE_URL,
                gson.toJson(new Grade(26, 9, new ArrayList<>(Arrays.asList(2.0, 5.0)))));

        RequestController.post(URL.ADMIN_GRADE_URL,
                gson.toJson(new Grade(29, 4, new ArrayList<>(Arrays.asList(2.0, 4.0)))));

        RequestController.post(URL.ADMIN_GRADE_URL,
                gson.toJson(new Grade(28, 5, new ArrayList<>(Arrays.asList(4.5)))));

        RequestController.post(URL.ADMIN_GRADE_URL,
                gson.toJson(new Grade(29, 6, new ArrayList<>(Arrays.asList(5.0)))));

        RequestController.post(URL.ADMIN_GRADE_URL,
                gson.toJson(new Grade(29, 7, new ArrayList<>(Arrays.asList(5.0)))));

        RequestController.post(URL.ADMIN_GRADE_URL,
                gson.toJson(new Grade(29, 8, new ArrayList<>(Arrays.asList(4.0)))));

        RequestController.post(URL.ADMIN_GRADE_URL,
                gson.toJson(new Grade(26, 9, new ArrayList<>(Arrays.asList(2.0, 5.0)))));

        RequestController.post(URL.ADMIN_GRADE_URL,
                gson.toJson(new Grade(33, 17, new ArrayList<>(Arrays.asList(2.0, 2.0)))));

        RequestController.post(URL.ADMIN_GRADE_URL,
                gson.toJson(new Grade(33, 18, new ArrayList<>(Arrays.asList(2.0, 2.0)))));

        RequestController.post(URL.ADMIN_GRADE_URL,
                gson.toJson(new Grade(33, 19, new ArrayList<>(Arrays.asList(2.0, 2.0)))));

        RequestController.post(URL.ADMIN_GRADE_URL,
                gson.toJson(new Grade(33, 20, new ArrayList<>(Arrays.asList(2.0, 2.0)))));



        Grade[] grades = gson.fromJson(RequestController.get(URL.GRADES_URL), Grade[].class);
        Utils.printClass(grades);


        System.out.println("##############################################################################\n\n");
        System.out.println("One of the student get married. Updating");
        final long[] indexOfSylwia = new long[1];
        Arrays.asList(students).forEach(stud -> {
            if(stud.name.equals("Sylwia Modlinska")){
                indexOfSylwia[0] = stud.getIndex();
            }
        });

        Student sylwiaStudent = gson.fromJson(RequestController.get(URL.STUDENT_URL, String.valueOf(indexOfSylwia[0])), Student.class);
        sylwiaStudent.setName("Sylwia Czarnecka");


        RequestController.put(URL.ADMIN_STUDENT_URL, gson.toJson(sylwiaStudent));
        System.out.println("Married. Name changed. Now look at students list");

        students = gson.fromJson(RequestController.get(URL.STUDENTS_URL), Student[].class);
        Utils.printClass(students);


        System.out.println("##############################################################################\n\n");
        System.out.println("One of the student fall all the exams. We have to get rid of him. Updating");

        final long[] indexOfAlek = new long[1];
        Arrays.asList(students).forEach(stud -> {
            if(stud.name.equals("Alek")){
                indexOfAlek[0] = stud.getIndex();
            }
        });
        RequestController.delete(URL.ADMIN_STUDENT_URL, String.valueOf(indexOfAlek[0]));


        System.out.println("\n Deleted. Here is actual student list");
        students = gson.fromJson(RequestController.get(URL.STUDENTS_URL), Student[].class);
        Utils.printClass(students);


    }

    public static void deleteAll(){
        RequestController.delete(URL.ADMIN_COURSES_URL);
        RequestController.delete(URL.ADMIN_SUBJECTS_URL);
        RequestController.delete(URL.ADMIN_TEACHERS_URL);
        RequestController.delete(URL.ADMIN_GRADES_URL);
        RequestController.delete(URL.ADMIN_STUDENTS_URL);
    }
}

package org.example;

import org.example.enums.StudentComparatorEnum;
import org.example.enums.UniversityComparatorEnum;
import org.example.model.Student;
import org.example.model.University;
import org.example.tools.ComparatorTool;
import org.example.tools.ReadFile;

import java.io.IOException;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {

        ArrayList <University> universities = ReadFile.getUniversities();
        ArrayList <Student> students = ReadFile.getStudents(); //new ArrayList<Student>();

        System.out.println("СПИСОК УНИВЕРСИТЕТОВ");
        universities.stream()
                .sorted(ComparatorTool.getUniversityComparator(UniversityComparatorEnum.FULL_NAME))
                .forEach(System.out::println);
        System.out.println("СПИСОК СТУДЕНТОВ");
        students.stream()
                .sorted(ComparatorTool.getStudentComparator(StudentComparatorEnum.FULL_NAME))
                .forEach(System.out::println);
    }
}
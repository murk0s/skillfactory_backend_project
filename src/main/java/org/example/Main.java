package org.example;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        University agtu = new University("01", "Астраханский Государственный Технический Университет", "АГТУ", StudyProfile.TECHNIC, 1978);
        University agma = new University("02", "Астраханская Государственная Медицинская Академия", "АГМА", StudyProfile.MEDICINE, 1970);
        University akvt = new University("03", "Астраханский Колледж Вычислительной Техники", "АКВТ", StudyProfile.PROGRAMMING, 1980);

        ArrayList <Student> students = new ArrayList<Student>();
        students.add(new Student("Иванов Иван Иванович", agtu.getId(), 1, 0));
        students.add(new Student("Петров Петр Иванович", agtu.getId(), 1, 0));
        students.add(new Student("Сидоров Арсений Игнатович", agtu.getId(), 1, 0));
        students.add(new Student("Попов Алексей Владиславович", agtu.getId(), 1, 0));

        students.add(new Student("Корсаков Сергей Сергеевич", agma.getId(), 1, 0));
        students.add(new Student("Павлов Иван Петрович", agma.getId(), 1, 0));
        students.add(new Student("Пирогов Николай Иванович", agma.getId(), 1, 0));
        students.add(new Student("Мечников Илья Ильич", agma.getId(), 1, 0));

        students.add(new Student("Дуров Павел Валерьевич", akvt.getId(), 1, 0));
        students.add(new Student("Касперский Евгений Валентинович", akvt.getId(), 1, 0));
        students.add(new Student("Марк Цукерберг", akvt.getId(), 1, 0));
        students.add(new Student("Джеймс Гослинг", akvt.getId(), 1, 0));

        for (Student student: students){
            System.out.println(student);
        }
    }
}
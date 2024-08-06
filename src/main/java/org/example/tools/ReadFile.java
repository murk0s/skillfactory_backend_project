package org.example.tools;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.example.model.Student;
import org.example.enums.StudyProfile;
import org.example.model.University;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ReadFile {
    private static final String fileName = "src\\main\\resources\\universityInfo.xlsx";
    private ReadFile() {
    }
    public static ArrayList<Student> getStudents() throws IOException {
        ArrayList<Student> students = new ArrayList<Student>();
        XSSFWorkbook wb = getWorkbookFromFile();
        XSSFSheet sheet = wb.getSheetAt(0);
        Iterator <Row> iterator = sheet.iterator();
        Row row = iterator.next();

        while (iterator.hasNext()) {
            row = iterator.next();
            String universityId = row.getCell(0).getStringCellValue();
            if (universityId.equals("")) break;
            students.add(new Student(row.getCell(1).getStringCellValue(),
                    universityId,
                    (int) row.getCell(2).getNumericCellValue(),
                    (float) row.getCell(3).getNumericCellValue()));
        }
        return students;
    }

    public static ArrayList<University> getUniversities() throws IOException {
        ArrayList<University> universities = new ArrayList<University>();
        XSSFWorkbook wb = getWorkbookFromFile();
        XSSFSheet sheet = wb.getSheetAt(1);
        int countRows = sheet.getPhysicalNumberOfRows();
        Iterator <Row> iterator = sheet.iterator();
        Row row = iterator.next();
        while (iterator.hasNext()) {
            row = iterator.next();
            String universityId = row.getCell(0).getStringCellValue();
            if (universityId.equals("")) break;
            universities.add(new University(universityId,
                    row.getCell(1).getStringCellValue(),
                    row.getCell(2).getStringCellValue(),
                    StudyProfile.valueOf(row.getCell(4).getStringCellValue()),
                    (int) row.getCell(3).getNumericCellValue()
                    ));
        }
        return universities;
    }

    private static XSSFWorkbook getWorkbookFromFile () throws IOException {
        return new XSSFWorkbook(new FileInputStream(new File(fileName)));
    }
}

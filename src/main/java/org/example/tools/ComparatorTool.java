package org.example.tools;

import org.example.comparators.*;
import org.example.enums.StudentComparatorEnum;
import org.example.enums.UniversityComparatorEnum;

import java.util.Comparator;

public class ComparatorTool {
    private ComparatorTool(){

    }
    public static StudentComparator getStudentComparator(StudentComparatorEnum typeComparator){
        switch (typeComparator){
            case FULL_NAME: return new StudentFullNameComparator();
            case UNIVERSITY_ID: return new StudentUniversityIdComparator();
            case AVG_EXAM_SCORE: return new StudentAvgExamScoreComparator();
            case CURRENT_COURSE_NUMBER: return new StudentCurrentCourseNumberComparator();
        }
        return new StudentFullNameComparator();
    }

    public static UniversityComparator getUniversityComparator(UniversityComparatorEnum typeComparator){
        switch (typeComparator) {
            case ID: return new UniversityIdComparator();
            case FULL_NAME: return new UniversityFullNameComparator();
            case SHORT_NAME: return new UniversityShortNameComparator();
            case YEAR_OF_FOUNDATION: return new UniversityYearOfFoundationComparator();
        }
        return new UniversityFullNameComparator();
    }
}

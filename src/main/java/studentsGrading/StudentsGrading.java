package studentsGrading;

import java.util.ArrayList;
import java.util.List;

public class StudentsGrading {

    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer> list = new ArrayList<Integer>();
        for (int grade : grades) {
            if (grade < 38) {
                list.add(grade);
            } else {
                if (grade % 5 > 2) {
                    list.add(grade + (5 -(grade % 5)));
                } else {
                    list.add(grade);
                }
            }
        }
        return list;
    }
}
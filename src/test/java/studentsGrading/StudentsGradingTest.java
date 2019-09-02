package studentsGrading;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class StudentsGradingTest {

    public List<Integer> prepareGivenList() {

        List<Integer> given = new ArrayList<Integer>();
        given.add(4);
        given.add(73);
        given.add(67);
        given.add(38);
        given.add(33);
        return given;
    }

    @Test
    public void gradingStudentsTest() {
        List<Integer> given = prepareGivenList();
        List<Integer> result = StudentsGrading.gradingStudents(given);

        assertEquals(5, result.size());

        int result1 = result.get(1);
        int result2 = result.get(2);
        int result3 = result.get(4);

        assertEquals(75, result1);
        assertEquals(67, result2);
        assertEquals(33, result3);

    }
}
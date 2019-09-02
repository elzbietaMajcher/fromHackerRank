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
        assertEquals(4, result.size());

    }
}
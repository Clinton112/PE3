package stackroute.PE3.practice_assessment_3_test;

import org.junit.*;
import stackroute.PE3.practice_assessment_3.StudentGradeCheck;


import static org.junit.Assert.*;

public class StudentGradeCheckTest
{
    StudentGradeCheck studentMarks;

    @Before
    public void setUp() throws Exception
    {
        studentMarks = new StudentGradeCheck();
    }

    @After
    public void tearDown() throws Exception
    {
    }

    @Test
    public void check()
    {
        String expected = "All marks are correct";
        int array[] = {62, 23, 34};
        String actual = studentMarks.check(array, 3);

        assertEquals("Following is of studentmarks class", expected, actual);
    }

    @Test
    public void checkFailure()
    {
        String expected = "Error";
        int array[] = {62, 23, 134};
        String actual = studentMarks.check(array, 3);

        assertEquals("Following is of studentmarks class", expected, actual);
    }
    @Test
    public void checksucess()
    {
        String expected = "All marks are correct";
        int array[] = {79, 53, 34};
        String actual = studentMarks.check(array, 3);

        assertEquals("Following is of studentmarks class", expected, actual);
    }
}
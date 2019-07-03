package stackroute.PE3.practice_assessment_3_test;

import org.junit.*;
import stackroute.PE3.practice_assessment_3.ConsecutiveNumbers;


import static org.junit.Assert.*;

public class ConsecutiveNumbersTest
{
    ConsecutiveNumbers consnum;

    @Before
    public void setUp() throws Exception
    {
        consnum = new ConsecutiveNumbers();
    }

    @After
    public void tearDown() throws Exception
    {
    }
    @Test
    public void checkNon()
    {
        boolean expected = false;

        boolean actual = consnum.checkConsecutive("98,96,95,94,93");

        assertEquals(expected, actual);
    }

    @Test
    public void checkConsOne()
    {
        boolean expected = true;
        boolean actual = consnum.checkConsecutive("54,53,52,51,50,49,48");

        assertEquals(expected, actual);
    }

    @Test
    public void checknonConsTwo()
    {
        boolean expected = false;
        boolean actual = consnum.checkConsecutive("1,2,3,4,5,6,6");

        assertEquals(expected, actual);
    }

}
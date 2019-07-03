package stackroute.PE3.practice_assessment_3_test;

import org.junit.*;
import stackroute.PE3.practice_assessment_3.MatrixAddition;


import static org.junit.Assert.*;

public class MatrixAdditionTest
{
    MatrixAddition ms;

    @Before
    public void setUp() throws Exception
    {
        ms = new MatrixAddition();
    }

    @After
    public void tearDown() throws Exception
    {
    }

    @Test
    public void check()
    {
        int[][] expected = {{10, 10}, {10, 10}, {10, 10}};
        int a1[][] = {{1, 2}, {3, 4}, {5, 6}};
        int a2[][] = {{9, 8}, {7, 6}, {5, 4}};
        int[][] actual = ms.checkSum(3, 2, a1, a2);

        assertArrayEquals(expected, actual);
    }
    @Test
    public void secondcheck()
    {
        int[][] expected = {{6, 9}, {7, 7}};
        int a1[][] = {{1, 3}, {3, 6}};
        int a2[][] = {{5, 6}, {4, 1}};
        int[][] actual = ms.checkSum(2, 2, a1, a2);

        assertArrayEquals(expected, actual);
    }
    @Test
    public void thirdcheck()
    {
        int[][] expected = {{6, 9, 12}, {7, 5, 10}, {14, 10, 17}};
        int a1[][] = {{1, 3, 5}, {3, 4, 4}, {7, 8, 8}};
        int a2[][] = {{5, 6, 7}, {4, 1, 6}, {7, 2, 9}};
        int[][] actual = ms.checkSum(3, 3, a1, a2);

        assertArrayEquals(expected, actual);
    }


}
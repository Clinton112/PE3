package stackroute.PE3.practice_assessment_3_test;

import org.junit.*;
import stackroute.PE3.practice_assessment_3.FirstLastDate;

import java.util.Calendar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FirstLastDateTest
{
    FirstLastDate object;

    @BeforeClass
    public static void setUpOnce()
    {
        System.out.println("Inside setup once");
    }

    @AfterClass
    public static void teardownOnce()
    {
        System.out.println("Inside teardown once");
    }

    @Before
    public void setUp()
    {
        System.out.println("Inside setup");
        object= new FirstLastDate();
    }

    @After
    public void tearDown()
    {
        System.out.println("Inside teardown");
        object = null;
    }

    @Test
    public void startDate()
    {
        //Arrange
        Calendar calendar=Calendar.getInstance();
        String result=object.startDate();
        assertEquals("Mon 01/07/2019\n"+"Sun 07/07/2019",result);
    }



}
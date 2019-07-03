package stackroute.PE3.practice_assessment_3_test;

import org.junit.*;
import stackroute.PE3.practice_assessment_3.ConsecutiveNumbers;

import static org.junit.Assert.*;

public class CountryVowelRemoveTest
{
    ConsecutiveNumbers.CountryVowelRemove cc;

    @Before
    public void setUp() throws Exception
    {
        cc = new ConsecutiveNumbers.CountryVowelRemove();
    }

    @After
    public void tearDown() throws Exception
    {
    }

    @Test
    public void check()
    {
        String[] expected = {"nd", "ntd Stts", "Grmny", "gypt", "czchslvk"};
        String[] str = {"India", "United States", "Germany", "Egypt", "czechoslovakia"};
        String[] actual = cc.remVow(str);

        assertArrayEquals(expected, actual);
    }
    @Test
    public void secondcheck()
    {
        String[] expected = {"fghnstn", "rq", "Sdn", "Rss", "Rmn"};
        String[] str = {"Afghanistan", "Iraq", "Sudan", "Russia", "Romania"};
        String[] actual = cc.remVow(str);

        assertArrayEquals(expected, actual);
    }
    @Test
    public void thirdcheck()
    {
        String[] expected = {"Sr Lnk", "nglnd", "Brzl", "strl", "Sth frc"};
        String[] str = {"Sri Lanka", "England", "Brazil", "Australia", "South Africa"};
        String[] actual = cc.remVow(str);

        assertArrayEquals(expected, actual);
    }



}
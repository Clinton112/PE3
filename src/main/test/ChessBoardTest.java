
package stackroute.PE3.practice_assessment_3_test;

import org.junit.*;
import stackroute.PE3.practice_assessment_3.ChessBoard;


import static org.junit.Assert.*;

public class ChessBoardTest
{
    ChessBoard cb;
    @Before
    public void setUp() throws Exception
    {
        cb = new ChessBoard();
    }
    @After
    public void tearDown() throws Exception
    {

    }

    @Test
    public void check()
    {
        String expected[][]={{"WW","BB","WW","BB","WW","BB","WW","BB"},
                            {"BB","WW","BB","WW","BB","WW","BB","WW"},
                            {"WW","BB","WW","BB","WW","BB","WW","BB"},
                            {"BB","WW","BB","WW","BB","WW","BB","WW"},
                            {"WW","BB","WW","BB","WW","BB","WW","BB"},
                            {"BB","WW","BB","WW","BB","WW","BB","WW"},
                            {"WW","BB","WW","BB","WW","BB","WW","BB"},
                            {"BB","WW","BB","WW","BB","WW","BB","WW"}};

        String [][] actual = cb.display(8,8);

        assertNotEquals("Following is chessPattern output",expected,actual);
    }

}
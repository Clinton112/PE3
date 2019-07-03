/*
 Write a program to create a ChessBoard pattern with the help of multidimensional array, where
 WW represents white color and BB represents Black color.
 Output:
 My Chess Board
 WW|BB|WW|BB|WW|BB|WW|BB|
 BB|WW|BB|WW|BB|WW|BB|WW|
 WW|BB|WW|BB|WW|BB|WW|BB|
 BB|WW|BB|WW|BB|WW|BB|WW|
 WW|BB|WW|BB|WW|BB|WW|BB|
 BB|WW|BB|WW|BB|WW|BB|WW|
 WW|BB|WW|BB|WW|BB|WW|BB|
 BB|WW|BB|WW|BB|WW|BB|WW|
 */
package stackroute.PE3.practice_assessment_3;

public class ChessBoard
{
    public String[][] display(int rows, int cols) //function to display the chessboard pattern
    {
        String output[][] = new String[rows][cols];//multidimensional array
        for (int i = 0; i < rows; i++) //outer loop
        {
            for (int j = 0; j < cols; j++) //inner loop
            {
                if (((i + j) % 2) == 0) //condition for boxes at even position or odd positions
                {
                    output[i][j] = "WW";
                }
                else
                {
                    output[i][j] = "BB";
                }
            }//inner loop ends here
        }//outer loop ends here
        return output;//return the multidimensional array
    }
}



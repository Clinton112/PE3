/*
 Write a program to compute the addition of two matrix, Read the number of rows and columns
 as input, also the values of each matrix
 Output:

 Input number of rows of matrix: 3
 Input number of columns of matrix: 2
 Input elements of first matrix: 1 2 3 4 5 6
 Input the elements of second matrix: 9 8 7 6 5 4

 Sum of the matrices:-

        10 10
        10 10
        10 10
 */
package stackroute.PE3.practice_assessment_3;

public class MatrixAddition
{
        public int[][] checkSum(int rows, int colums, int a1[][], int a2[][]) //function to add 2 matrices
        {
            int sum[][] = new int[rows][colums];//create an array sum containing same size as rows and columns
            for (int i = 0; i < rows; i++) //outer loop starts here
            {
                for (int j = 0; j < colums; j++) //inner loop
                {
                    sum[i][j] = a1[i][j] + a2[i][j];//sum the arrays a1 and a2
                }//inner loop ends here
            }//outer loop ends here
            return sum;//return the sum
        }

    }


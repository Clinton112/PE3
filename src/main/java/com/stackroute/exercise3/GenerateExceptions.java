/*
 Write a program that will generate exceptions of type NegativeArraySizeException,
 IndexOutOfBoundsException, NullPointerException. Record the catching of each exception by
 displaying the message stored in the exception object.
 */
package stackroute.PE3.practice_assessment_3;
public class GenerateExceptions
{
    public static void main(String[] args) //main function
    {
        try
        {
            throw new NegativeArraySizeException();//throws NegativeSizeException
        }
        catch (NegativeArraySizeException exception1) //catch part
        {
            System.out.println(exception1.toString());//print exception as string
        }

        try
        {
            throw new IndexOutOfBoundsException();//throws IndexOutOfBoundsException
        }
        catch (IndexOutOfBoundsException exception2) //catch part
        {
            System.out.println(exception2.toString());//print exception as string
        }

        try
        {
            throw new NullPointerException();//throws NullPointerException
        }
        catch (NullPointerException exception3) //catch part
        {
            System.out.println(exception3.toString());//print exception as string
        }
    }
}


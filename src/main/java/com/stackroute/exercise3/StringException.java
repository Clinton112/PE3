/*
 Create a class with a main( ) that throws an object of class Exception inside a try block.
 a. Give the constructor for Exception a String argument.
 b. Catch the exception inside a catch clause and print the String argument.
 c. Add a finally clause and print a message to prove you were there.
 */
package stackroute.PE3.practice_assessment_3;
import java.io.FileNotFoundException;

public class StringException
{
    StringException(String message)
    {
        message = "this is bound to execute";
        System.out.println(message);
    }

    public static void main(String[] args) throws Exception
    {
        try
        {
            // Suppose here you are looking for any resource for eg.File
            // If program is unable to find file
            throw new FileNotFoundException();
        }
        catch (FileNotFoundException exception)
        {
            throw new Exception("File not found");
        }
        catch (Exception exception)
        {
            System.out.println(exception.getMessage());
        }
        finally
        {
            // This block will get get executed whether exception occures or
            // not.
            System.out.println("i will get printed");
        }

    }
}
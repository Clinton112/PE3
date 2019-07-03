/*
 Create a class called StudentMarks, which prompts user for the number of students, reads it
 from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the
 grades of each of the students and saves them in an int array called stuGrades. Your program shall
 check that the grade is between 0 and 100 else has to trow an error message.
 */
package stackroute.PE3.practice_assessment_3;

public class StudentGradeCheck
{
    public String check(int stuGrades[], int numOfStudents)
    {
        for (int i = 0; i < numOfStudents; i++) //loop starts here
        {
            if (stuGrades[i] < 0 || stuGrades[i] > 100) //condition to check range of grades
            {
                return "Error";
            }
        }//loop ends here
        return "All marks are correct";
    }
}


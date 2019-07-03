/*
 Write a program to find out if a series of 7 digits are consecutive numbers. To make this easier,
 assume the digits are a string and use split()

 Input: 98,96,95,94,93
 Output: 98,96,95,94,93 non consecutive numbers

 Input: 54,53,52,51,50,49,48
 Output : 54,53,52,51,50,49,48 are consecutive numbers

 Input: 1,2,3,4,5,6,6
 Output: 1,2,3,4,5,6,6 non consecutive numbers
 */
package stackroute.PE3.practice_assessment_3;
public class ConsecutiveNumbers
{
    boolean result = false;//global variable
    public boolean checkConsecutive(String values) //function to check if there are consecutive numbers in the given string
    {
        String[] array = values.split(",");//split the given strings on the basis of ','
        for (int i = 0; i < array.length - 1; i++) //loop starts here
        {
            int difference = Integer.parseInt(array[i + 1]) - Integer.parseInt(array[i]);//calculates difference between
                                                                                        //consecutive array variables
            System.out.println(difference);//display the difference
            if (difference == 1 || difference == -1) //condition for consecutive numbers
            {
                result = true;
            }
            else
            {
                result = false;
                break;
            }
        }//loop ends here
        return result;//return the value
    }

    public static class CountryVowelRemove
    {
            public String[] remVow(String s[]) //function to replace vowel characters with ' '
            {
                for (int i = 0; i < s.length; i++) //loop starts here
                {
                    s[i] = s[i].replaceAll("[aeiouAEIOU]", "");//replace vowel occurences with ' ';
                }//loop ends here
                return s;//return value of replaced array
            }

        }
}


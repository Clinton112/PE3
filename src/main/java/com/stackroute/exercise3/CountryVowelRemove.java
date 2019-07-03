/*
 Write a program to set up an array of places, Loop round and remove the vowels. Display the new
 words in console

 Input:
 India
 United States
 Germany
 Egypt
 czechoslovakia

 Output:
 Place Name without Vowels:0 Ind
 Place Name without Vowels:1 Untd Stts
 Place Name without Vowels:2 Grmny
 Place Name without Vowels:3 Egypt
 Place Name without Vowels:4 czchslvk
 */
package stackroute.PE3.practice_assessment_3;

public class CountryVowelRemove
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
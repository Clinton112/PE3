/*
 Write a java program to calculate first and last date of a week.
 Output:
 First Date of Week: Mon 24/07/2017
 Last date of the week: Sun 30/07/2017
 */
package stackroute.PE3.practice_assessment_3;
import java.text.*;
import java.util.*;

public class FirstLastDate {
    public String startDate() {
        Calendar c = Calendar.getInstance();

// Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        System.out.println(df.format(c.getTime()));//display the time
        String result = df.format(c.getTime());
        for (int i=0;i<6;i++)
        {
            c.add(Calendar.DATE,1);
        }
        result=result+"\n"+df.format(c.getTime());
        return result;
    }
    }



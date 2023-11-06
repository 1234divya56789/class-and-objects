/* JFM1T6_Assignment4:

   Write a program to display current date-time. Hint: java.util package contains Date class.
   
   Sample Output:
   Date in Indian Timezone (IST) : 18-02-21 10:20:195 IST

*/

import java.util.Date;
import java.text.SimpleDateFormat;

public class CurrentDateTime {
    public static void main(String[] args) {
        // Create a Date object
        Date currentDate = new Date();

        // Create a SimpleDateFormat object with desired date format
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy HH:mm:ss z");

        // Format the current date and time using the SimpleDateFormat
        String formattedDate = dateFormat.format(currentDate);

        // Print the formatted date and time
        System.out.println("Date in Indian Timezone (IST) : " + formattedDate);
    }
}

//main method

/* 
capture today's date by
Date today = new Date();
*/

//create DateFormat and set TimeZone 


//display this date on IST time zone 


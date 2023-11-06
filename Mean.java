/* JFM1T6_Assignment3:

   Write a method that takes any numbers as arguments/parameters and return the mean value back to main method.
   Prompt the user for the  values to be input from the terminal.

   Sample input:
   num1 = 3
   num2 = 2
   num3 = 4

   Expected Output:
   result = 3
   
*/

import java.util.Scanner;

public class Mean {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the terminal
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Enter num1: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter num2: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter num3: ");
        int num3 = scanner.nextInt();

        // Calculate the mean value
        int mean = (num1 + num2 + num3) / 3;

        // Print the mean value
        System.out.println("result = " + mean);

        // Close the Scanner object
        scanner.close();
    }
}

//main method

//declare variables and initialize sum=0

//create scanner object

//take input from user

//check the for loop for number of values entered in input

//calculate mean

//print result

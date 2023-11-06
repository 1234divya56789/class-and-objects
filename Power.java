/* JFM1T6_Assignment2:
   Write a method that takes 2 numbers as arguments/parameters and returns the value of num2 to the power of num1 back to the main method.
   Prompt the user for the base and power values to be input from the terminal.

   Sample input:
   num1 = 3
   num2 = 2
    Expected Output:
   result = 9
   
*/
import java.util.Scanner;
public class Power {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("num1 = ");
    int p=sc.nextInt();
    System.out.print("num2 = ");
    int n=sc.nextInt();

    int r=calculatePower(n,p);
    System.out.println("result = "+r);
  }
public static int calculatePower(int n, int p) {
  int r=1;
  if (n>=0 && p==0) {
    return 1;
  } else if (n==0 && p>=1) {
    return 0;
  } else {
    for (int i=1; i<=n;i++) {
      r*=p;
    }
  }
  return r;
}}
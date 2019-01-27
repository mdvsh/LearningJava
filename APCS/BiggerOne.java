//ASSIGNMENT 
// a program which gives the larger of the 2 intgers put
//if numbers are equal the first number is returned...
import java.util.Scanner;
 public class BiggerOne{
      public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
      
         int num1;
         int num2;

         System.out.println("Enter First Number: ");
         num1 = s.nextInt();

         System.out.println("Enter Second Number: ");
         num2 = s.nextInt();

         System.out.println("The Bigger One Is: " + findBigger(num1, num2));

     }
     private static int findBigger(int n1, int n2) {
         if (n1 > n2)
         {
             return n1; //n1 is bigger
         }
         else if (n1 < n2)
         {
             return n2; //n2 is bigger
         }
         else if (n1 == n2){
             return n1;
         }
         else {
             return n2;
         }
     }
 }
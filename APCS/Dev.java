//Assignment: Employees
//Section 14, Lecture 94

/**
 * This assignment will have multiple components. It will have an abstract class Employee and a concrete subclass Dev.
 *  The abstract class Employee will have 3 private instance variables: name (String), address (String), and number (int). 
 * It will also have the abstract method computePay() that doesn't take in any parameters and returns a double.
 *  Don't forget to use the abstract keyword to indicate the use of an abstract class or abstract method. 
 */

 /**
  * The Dev subclass will have 1 private instance variable weeklySalary (int) and it will be set to a value of 2000.
   Because the superclass (Employee) of the Dev class contains an abstract method (computePay()), 
   the Dev class must provide an implementation for this method. 
  The Dev class should return the weeklySalary multiplied by 52. 
  */


public class Dev extends Employee{

    private int weeklySalary = 2000;

    public double computePay(){
        return weeklySalary * 52;
    }  
    
}
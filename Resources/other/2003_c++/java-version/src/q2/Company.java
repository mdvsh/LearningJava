public class Company
{
    // minimum age, years on job, and salary needed to retire
    
    private final static int RETIRE_AGE   = 65;
    private final static int RETIRE_YEARS = 30;
    private final static double RETIRE_SALARY = 10000.0;
    
    private ArrayList myEmployees;  // list of employees
    private double myTotalSalary;   // total salary of all employees

    // ... constructor and other methods not shown

    // postcondition: returns true if emp is eligible to retire;
    //                otherwise, returns false

    private boolean employeeIsEligible(Employee emp)
    {
        // to be implemented in part (a) 
    }

    // postcondition: all retirement-eligible employees have been
    //                removed from myEmployees; myEmployees remains
    //                sorted by employee ID; myTotalSalary has been
    //                updated to maintain invariant that it represents
    //                total of all employee salaries

    public void processRetirements()
    {
        // to be implemented in part (b) 
    }
    
}




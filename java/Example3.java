/* Example 3
talks about another data type:double(decimal places till 2 digits)
diffs. int and double data types
*/
class Example3{
  public static void main(String[] args) {
    int var; // here "int" variable is declared
    double x; //here "double" variable (x) is declared

    var = 10; // value of var assigned to 10
    x = 10; // floating type variable declared

    System.out.println("Original Value of var : " + var);
    System.out.println("Original Value of x : " + x);
    System.out.println(); // similar to <br> tag in HTML5

    //now to test both types of variables, divide both by 4.
    var = var / 4;
    x = x / 4;

    System.out.println("After Division, var: " + var);
    System.out.println("After Division, x: " + x);
    // we should see that fractional component(0.5 of 2.5) is lost in var while x retains it.
  }
}

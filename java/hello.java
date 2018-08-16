/* Revisiting Gallons TO Litres Convertor
using for, and counter funcyionns */
class hello{
  public static void main(String[] args) {
    double gallons, litres;
    int counter;

    counter = 0;
    for(gallons = 1; gallons <= 100; gallons++) {
      litres = gallons * 3.7854; // converting galllons to Litres
      System.out.println(gallons + " gallons is " + litres + " litres.");

      counter++;
      //every 10th line blank line
      if (counter == 10) {
        System.out.println();
        counter = 0; //reset
      }
    }
  }
}

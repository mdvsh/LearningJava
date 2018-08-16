/* Exercise Question 1
Gallons To Litres
*/
class GalToLit{
  public static void main(String[] args) {
    double gallons; //holds number of Gallons
    double litres; //holds number of Litres

    gallons = 10; // enter gallons
    litres = gallons * 3.7854; //converted to gallons

    System.out.println("Gallons Given: " + gallons);
      System.out.println();
    System.out.println("1 gallon = 3.7854l");
      System.out.println();
    System.out.println("Therefore we get to know that, "+ gallons + " gallons is equal to " + litres + " Litres.");
  }
}

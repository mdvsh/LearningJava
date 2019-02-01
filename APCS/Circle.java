//Assignment: Circle and Cylinder

/** In this assignment, we will have a superclass Circle and a subclass Cylinder. The Circle class will have a private instance variable of double type representing the radius. It will also have a constructor without any parameters that sets the radius variable's value to 1.0. There will also be a getRadius() and setRadius() method. Last but not least, the Circle superclass should have the findArea() method that returns a double representing the area of the circle. The formula for the area of a circle is π × r2

The Cylinder subclass will inherit the methods and variables so the Circle superclass so remember to use the extends keyword. The Cylinder class will add on a private instance variable height that is a double. Remember that the Circle class constructor is not inherited and hence, add a constructor without parameters for the Cylinder class. The constructor should give the radius and height a default value of 1.0 and remember that the Cylinder subclass cannot access the private instance variable radius so the super keyword must be used to invoke the Circle class constructor. In addition, add a setHeight() and getHeight() method. Finally, add a findVolume() method that returns a double. The method should return a value equal to the area (accessed using the findArea() method) multiplied by the height.

Once you have completed the assignment, you can run your program and make sure the output is correct. If you would like to check your answer, check out the Circle.java and Cylinder.java files attached. If you have any questions email help@apcs.tv 
 */

 public class Circle{
     private double radius;

     //default constructor

     public Circle(){
         radius = 1.0;
     }
     public Circle(double r){
         radius = r;
     }
        /**Methods
      * 1. Accesor
      * @return radius of the circle
      * 2. Mutatot
      * Sets the radius of the circle
      */

     //accessor
     public double getRadius(){
         return radius;
     }

     //mutator
     public void setRadius(double r)
     {
        radius = r;
     }

       // Method to find area (infact an accessor)

       public double findArea(){
            return radius * radius * Math.PI;
       }

 }
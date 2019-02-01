//Assignment: Circle and Cylinder

/** In this assignment, we will have a superclass Circle and a subclass Cylinder. The Circle class will have a private instance variable of double type representing the radius. It will also have a constructor without any parameters that sets the radius variable's value to 1.0. There will also be a getRadius() and setRadius() method. Last but not least, the Circle superclass should have the findArea() method that returns a double representing the area of the circle. The formula for the area of a circle is π × r2

The Cylinder subclass will inherit the methods and variables so the Circle superclass so remember to use the extends keyword. The Cylinder class will add on a private instance variable height that is a double. Remember that the Circle class constructor is not inherited and hence, add a constructor without parameters for the Cylinder class. The constructor should give the radius and height a default value of 1.0 and remember that the Cylinder subclass cannot access the private instance variable radius so the super keyword must be used to invoke the Circle class constructor. In addition, add a setHeight() and getHeight() method. Finally, add a findVolume() method that returns a double. The method should return a value equal to the area (accessed using the findArea() method) multiplied by the height.

Once you have completed the assignment, you can run your program and make sure the output is correct. If you would like to check your answer, check out the Circle.java and Cylinder.java files attached. If you have any questions email help@apcs.tv 
 */

//Subclass Cylinder

 public class Cylinder extends Circle{
     private double height; //height is unique to cylinder and is in Cyliner subclass

     public Cylinder(){   //Circle class constructor is not inherited and hence, adding a constructor without parameters for the Cylinder class.
        super();
        height = 1.0;
             }
             public Cylinder(double r, double h){
                    super();
                    height = h;
             }
                // accessor
             public double getHeight(){
                    return height;
             }
                //mutator
             public void setHeight(double h){
                 height = h;
             }

             //using findArea from super class

             public double findVolume(){
                 return findArea() * height;
             }
 }
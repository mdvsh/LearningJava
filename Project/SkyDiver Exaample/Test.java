

/**@author Madhav Shekhar Sharma
 * Date: 1/2/19
 */

public class Test{
    public static void main(String[] args) {
        Skydiver s = new Skydiver(100, 1, 500,100);  

        /**
         * in order of :
         * mass, radius (of object)
         * distance up in the sky, here 2km (up in atmosphere ! DAMN)
         * 1 KM IS THE DISTANCE (here) when our parachute opens
         */
        try {
            s.runSimulation();
        } catch (Exception e) {
            System.err.print("Whoops!");
        }
    }
    }

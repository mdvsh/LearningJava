//Assignment: Polygon Program
//Section 9, Lecture 61


public class Polygon {
    private int numSides;

    public Polygon() {
numSides = 1;
    }

    public Polygon(int n){
numSides = n;
    }

    /**
     * @return the numSides
     */
    public int getNumSides() {
        return numSides;
    }

    /**
     * @param numSides the numSides to set
     */
    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    public String toString(){
        return "Number of sides is : " + numSides;
    }

  

}
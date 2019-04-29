//Recursion Practice Problem
public class LearningRecursion
{
    /**Recursively seach an array "a" for a key
     * @param a the array of String Object
     * @param key a String object to be searched
     * @return true if a[k]=key for 0<=k<a.length
     */

     public boolean search(String a[], String Key)
     {
         if (a.length == 0) //base case so recursion is not infinite and terminates
        return false;
        else if (a[0].compareTo(Key) == 0) //base case
        return true;                        //key found

        else{
            String[] shorter = new String[a.length-1];
            for (int i = 0; i < shorter.length; i++ )
                shorter[i] = a[i+1];
                return search(shorter, Key);
        }
     }
}

public static void main(String[] args) {
    String[] list = {"Iron Man", "Captain America", "Thor", "Hulk", "Black Widow"};
    Searcher s = new Searcher();
    System.out.println("Enter Who Dies In Endgame:   ");
    String key = ....; //reads user input
    boolean result = s.search(list, key);
    if (!result)
    System.out.println(key + " dies in Endgame ;-(");
    else System.out.println(key + " SPOILERS AHEAD !!!")
}
import java.util.ArrayList;

public class Stats
{
    /**
     *  precondition:  nums.length > 0
     *  postcondition: returns the maximal value in nums
     */
    
    private static int findMax(int[] nums)
    {
	int max = nums[0];

	for(int k=1; k < nums.length; k++) {
	    if (nums[k] > max) {
		max = nums[k];
	    }
	}
	return max;
    }


    /**
     * precondition: nums.size() > 0; nums contains Integer objects
     * postcondition: returns the maximal value in nums
     */
    
    private static Integer findMax(ArrayList nums)
    {
	Integer max = (Integer) nums.get(0);
	for(int k=1; k < nums.size(); k++) {
	    Integer i = (Integer) nums.get(k);
	    if (i.compareTo(max) > 0) {
		max = i;
	    }
	}
	return max;
    }
	


    /**
     * precondition: tally.length > 0
     * postcondition: returns an int array that contains the modes(s);
     *                the array's length equals the number of modes.
     */
    
    public static int[] calculateModes(int[] tally)
    {
	int count = 0;
	int max = findMax(tally);
	for(int k=0; k < tally.length; k++) {
	    if (tally[k] == max) {
		count++;
	    }
	}
	
	int[] retval = new int[count];
	count = 0;	
	for(int k=0; k < tally.length; k++) {
	    if (tally[k] == max) {
		retval[count] = k;
		count++;
	    }
	}
	return retval;
    }


    /**
     * precondition: tally.size() > 0; tally contains Integer objects
     * postcondition: returns an ArrayList that contains the modes(s);
     *                the ArrayList's size equals the number of modes.
     */
    
    public static ArrayList calculateModes(ArrayList tally)
    {
	ArrayList retval = new ArrayList();
	Integer max = findMax(tally);
	for(int k=0; k < tally.size(); k++) {
	    if (tally.get(k).equals(max)) {
		retval.add(new Integer(k));
	    }
	}
	return retval;
    }


      /**
       * precondition: tally.length > 0;
       *               0 < k <= total number of values in data collection
       * postcondition: returns the kth value in the data collection
       *                represented by tally
       */
    
    public static int kthDataValue(int[] tally, int k)
    {
	int count = 0;
	for(int j=0; j < tally.length; j++) {
	    count += tally[j];
	    if (count >= k) {
		return j;
	    }
	}
	// error: should never reach here
	return tally.length-1;
    }

    /**
     * precondition: tally.size() > 0; tally contains Integer objects
     *               0 < k <= total number of values in data collection
     * postcondition: returns the kth value in the data collection
     *                represented by tally
     */
    
    public static int kthDataValue(ArrayList tally, int k)
    {
	int count = 0;
	for(int j=0; j < tally.size(); j++) {
	    Integer i = (Integer) tally.get(j);
	    count += i.intValue();
	    if (count >= k) {
		return j;
	    }
	}
	// error: should never reach here
	return tally.size()-1;
    }
    
}

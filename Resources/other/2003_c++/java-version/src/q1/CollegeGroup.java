mport java.util.ArrayList;

public class CollegeGroup
{
    private College[] myColleges;  // myColleges.length is # colleges


    // precondition:  there exists a College in this group
    //                whose name is collegeName, call this
    //                myColleges[index]
    // postcondition: myColleges[index].getTuition() == newTuition, i.e.,
    //                the College with collegeName has
    //                newTuition as its tuition

    public void updateTuition(String collegeName,
                              int newTuition)
    {
        // you will write this code
    }

    // precondition:  low <= high
    // postcondition: returns ArrayList of College objects
    //                from this group in specified region
    //                whose tuition is between (including)
    //                low and high, i.e., low <= tuition <= high

    public ArrayList getCollegeList(String region,
                                    int low, int high)
    {
        // you will write this code
    }
}

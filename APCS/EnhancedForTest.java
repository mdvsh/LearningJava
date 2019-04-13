//Learning the Enhanced for loop i.e for-each loop


public class EnhancedForTest{
    public static void main(String[] args) {

        int[] x = {1, 2, 3, 5, 7, 19, 69};
        int total = 0;

        for (int i : x) {
            total += i;
            System.out.println(total);
        }
    }
}
/* Answers/Output */

//1
//3
//6
//11
//18
//37
//106
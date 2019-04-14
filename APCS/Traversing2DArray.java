public class Traversing2DArray{
    public static void main(String[] args) {
        
        int[] [] firstArray = {{4, 8, 9, 3}, {7, 5, 1, 2}, {1, 8, 4, 7}};

        int [] [] secondArray = new int[3] [3];

        /** i have to print a two-D array while traversing it with both:
         * 1. nested for loop
         * 2. for each loops */
        
        System.out.println(firstArray); /** DOESN'T WORK THIS WAY; PRINTS weird things
        refrain from using this statment... */

        System.out.println();
        System.out.println("Printing an Array using nested-for loops.");

        for(int row=0; row < firstArray.length; row++)
        {
            for(int col=0; col < firstArray[row].length; col++)
            {
                System.out.print(firstArray[row][col]);
            }
            System.out.println();
        }
        
        System.out.println("Printing an Array using for-each loops.");

        for (int[] tempArray : firstArray) { //pulls out first-array and puts it in tempArray
            for (int tempValue : tempArray) { //goes out 4 times to pull int(s) from tempArray giving us elements of a row.
                System.out.print(tempValue);
            }
            System.out.println();
        }  

        /** NOTE:
         * 1. Use a for-each loop for accessing/modifying elements that are class objects; but no replacement.
         * 2. Use nested for-loops (row-column traversing) for accessing/modifying elements that are class objects and replacing them.
         */

    }
}
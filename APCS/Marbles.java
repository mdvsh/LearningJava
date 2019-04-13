import com.sun.org.apache.bcel.internal.generic.SWAP;

/*
The purpose of this program is to simulate a bag of marbles using an array. 
The job of this program is very simple.
 All you have to do within this program is create a String array called bag,
  which contains Strings that represent the colors of the different marbles.
  Some of the Strings in this array could be "Maroon" or "Red". 
  */
  
  public class Marbles{
    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
      public static void main(String[] args) {
          
         
    int[] list = {1, 2, 3, 4};
        swap(list, 0, 3);
            System.out.println("The Changed list is: ");

    for (int num : list)
        System.out.print(num + " ");

}
  }
//JavaCodePractice: Arrays: Finding minimum element in an Array.
public class Test
{

    public static int findMin(int[] arr)
    {
        int min = arr[0];
        int value = 0;

        for (int i = 0; i < arr.length; i++) {
            value = arr[i];
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static void main(String[] args)
    {
        int[] arr = {20, -3, 18, 55, 4};
        System.out.println(findMin(arr));
    }
}
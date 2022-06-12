package Pro;

import java.util.Arrays;

public class EvenOddSort {

    public static void main(String[] args) {

        int[] arr ={2,3,4,9,1,7,8};

        // Make all even numbers negative
        for (int i = 0; i < arr.length; i++)
            if (arr[i] %2 == 0) // Check for even
                arr[i] = arr[i] * (-1);

        // Sort all numbers
        Arrays.sort(arr);

        // Retaining original array
        for (int i = 0; i < arr.length; i++)
            if (arr[i] %2 == 0)
                arr[i] *= -1;

            for (int i=0;i<arr.length;i++)
                System.out.print(arr[i]+" ");
    }
}

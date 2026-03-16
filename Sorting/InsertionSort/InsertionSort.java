import java.util.Arrays;

public class InsertionSort {

    /**
     * Sorts an array of integers using Insertion Sort.
     *
     * @param arr The unsorted array
     */
    public static void sort(int[] arr) {
        
        // Start at index 1, because a list of 1 element (index 0) is already "sorted"
        for (int i = 1; i < arr.length; i++) {
            
            // The "key" is the new card we are currently holding in our right hand
            int key = arr[i];
            
            // 'j' points to the last card in our sorted left hand
            int j = i - 1;

            // Move elements of arr[0..i-1] that are GREATER than the key
            // to one position ahead of their current position to make room.
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // Shift the larger element to the right
                j = j - 1;           // Move left to check the next element
            }
            
            // We found the correct spot! Insert our key here.
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        // 1. Set up an unsorted array (maybe some playing card values!)
        int[] hand = {10, 3, 7, 2, 14, 5, 9};

        System.out.println("Hand before sorting:");
        System.out.println(Arrays.toString(hand));
        System.out.println();

        // 2. Call our sort method
        sort(hand);

        // 3. Output the results
        System.out.println("Hand after Insertion Sort:");
        System.out.println(Arrays.toString(hand));
    }
}

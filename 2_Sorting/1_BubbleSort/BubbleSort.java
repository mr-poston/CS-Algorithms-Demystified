import java.util.Arrays;

public class BubbleSort {

    /**
     * Sorts an array of integers from smallest to largest using Bubble Sort.
     *
     * @param arr The unsorted array
     */
    public static void sort(int[] arr) {
        int n = arr.length;
        
        // This boolean is an optimization! It lets us stop early if the array is sorted.
        boolean swapped; 

        // Outer loop: We need to do a pass for nearly every element in the array
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop: Go through the unsorted part of the array and swap adjacent elements.
            // Notice "n - i - 1": With each full pass, the biggest element "bubbles" to the very 
            // end, so we don't need to check those last elements again!
            for (int j = 0; j < n - i - 1; j++) {
                
                // Compare the current element with the one immediately to its right
                if (arr[j] > arr[j + 1]) {
                    
                    // They are out of order, so we swap them!
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    
                    swapped = true; // Mark that a swap happened on this pass
                }
            }

            // If we went through the whole inner loop and didn't swap anything, 
            // the array is already perfectly sorted. We can stop early!
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        // 1. Set up an unsorted array
        int[] grades = {88, 45, 92, 67, 12, 100, 75};

        System.out.println("Before Bubble Sort:");
        System.out.println(Arrays.toString(grades));
        System.out.println(); // Blank line for readability

        // 2. Call our sort method
        sort(grades);

        // 3. Output the results
        System.out.println("After Bubble Sort:");
        System.out.println(Arrays.toString(grades));
    }
}

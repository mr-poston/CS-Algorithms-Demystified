import java.util.Arrays;

public class SelectionSort {

    /**
     * Sorts an array of integers using Selection Sort.
     *
     * @param arr The unsorted array
     */
    public static void sort(int[] arr) {
        int n = arr.length;

        // Loop through the entire array. 
        // With each pass, the sorted boundary grows by one.
        for (int i = 0; i < n - 1; i++) {
            
            // Assume the first unsorted element is the smallest
            int minIndex = i;

            // Scan the rest of the unsorted array to find the ACTUAL smallest element
            for (int j = i + 1; j < n; j++) {
                
                // If we find something smaller, update our minIndex
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Now that we've found the absolute smallest item in the unsorted section,
            // swap it with the first unsorted element (at index i).
            // We only swap if the smallest item isn't already in the right place!
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        // 1. Set up an unsorted array (maybe some scrambled locker numbers)
        int[] lockers = {64, 25, 12, 22, 11};

        System.out.println("Locker numbers before sorting:");
        System.out.println(Arrays.toString(lockers));
        System.out.println();

        // 2. Call our sort method
        sort(lockers);

        // 3. Output the results
        System.out.println("Locker numbers after Selection Sort:");
        System.out.println(Arrays.toString(lockers));
    }
}

import java.util.Arrays;

public class MergeSort {

    /**
     * The main function that divides the array.
     * Notice how this function calls itself! That is called "Recursion".
     *
     * @param arr The array to be sorted
     */
    public static void sort(int[] arr) {
        int length = arr.length;

        // BASE CASE: If the array has 1 or 0 elements, it is already sorted!
        if (length < 2) {
            return;
        }

        // 1. DIVIDE: Find the middle point and create two smaller arrays
        int mid = length / 2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[length - mid];

        // Fill the left half
        for (int i = 0; i < mid; i++) {
            leftArray[i] = arr[i];
        }
        
        // Fill the right half
        for (int i = mid; i < length; i++) {
            rightArray[i - mid] = arr[i];
        }

        // 2. CONQUER: Recursively call sort() on the two halves
        sort(leftArray);
        sort(rightArray);

        // 3. MERGE: Put the two sorted halves back together into the original array
        merge(arr, leftArray, rightArray);
    }

    /**
     * A helper function that takes two sorted arrays and merges them into one.
     */
    private static void merge(int[] originalArray, int[] leftArray, int[] rightArray) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;

        // Pointers to track our current position in each array
        int i = 0; // Pointer for leftArray
        int j = 0; // Pointer for rightArray
        int k = 0; // Pointer for originalArray

        // Compare elements from left and right arrays, and copy the smaller one over
        while (i < leftSize && j < rightSize) {
            if (leftArray[i] <= rightArray[j]) {
                originalArray[k] = leftArray[i];
                i++;
            } else {
                originalArray[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // MOP UP: If there are any leftover elements in the left array, copy them over
        while (i < leftSize) {
            originalArray[k] = leftArray[i];
            i++;
            k++;
        }

        // MOP UP: If there are any leftover elements in the right array, copy them over
        while (j < rightSize) {
            originalArray[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        // 1. Set up a heavily scrambled array
        int[] highScores = {38, 27, 43, 3, 9, 82, 10, 19, 50, 12};

        System.out.println("High Scores before Merge Sort:");
        System.out.println(Arrays.toString(highScores));
        System.out.println();

        // 2. Call our sort method
        sort(highScores);

        // 3. Output the results
        System.out.println("High Scores after Merge Sort:");
        System.out.println(Arrays.toString(highScores));
    }
}

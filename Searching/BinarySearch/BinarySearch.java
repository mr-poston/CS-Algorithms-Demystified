public class BinarySearch {

    /**
     * Performs a binary search on a SORTED array of integers.
     *
     * @param arr    The sorted array to search through
     * @param target The number we are looking for
     * @return The index of the target if found, or -1 if it is not in the array
     */
    public static int search(int[] arr, int target) {
        // We need two pointers to keep track of the section of the array we are searching
        int left = 0;                  // Starts at the very beginning
        int right = arr.length - 1;    // Starts at the very end

        // As long as our left pointer hasn't crossed our right pointer, keep searching!
        while (left <= right) {
            
            // Find the middle index. 
            // (left + right) / 2 works, but this way prevents integer overflow on massive arrays!
            int mid = left + (right - left) / 2;

            // BEST CASE: We found our target right in the middle!
            if (arr[mid] == target) {
                return mid; 
            }

            // If the target is GREATER than the middle number, 
            // we can completely ignore the left half of the array.
            if (arr[mid] < target) {
                left = mid + 1; // Move our left boundary just past the middle
            } 
            // If the target is LESS than the middle number,
            // we can completely ignore the right half of the array.
            else {
                right = mid - 1; // Move our right boundary just before the middle
            }
        }

        // If the while loop finishes and we haven't returned anything, the target isn't here.
        return -1;
    }

    public static void main(String[] args) {
        // 1. Set up a SORTED array of numbers (This is required for Binary Search!)
        int[] studentIDs = {12, 19, 33, 45, 72, 89, 99};

        // 2. Pick a number to look for
        int targetID = 72;

        System.out.println("Searching for ID: " + targetID);

        // 3. Call our search method
        int resultIndex = search(studentIDs, targetID);

        // 4. Output the results
        if (resultIndex != -1) {
            System.out.println("✅ Success! Target found at index: " + resultIndex);
        } else {
            System.out.println("❌ Target not found in the array.");
        }
        
        // Let's try searching for something that isn't there
        int missingID = 100;
        System.out.println("\nSearching for ID: " + missingID);
        int missingResult = search(studentIDs, missingID);
        
        if (missingResult != -1) {
            System.out.println("✅ Success! Target found at index: " + missingResult);
        } else {
            System.out.println("❌ Target not found in the array.");
        }
    }
}

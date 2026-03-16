public class LinearSearch {

    /**
     * Performs a linear search on an array of integers.
     *
     * @param arr    The array to search through
     * @param target The number we are looking for
     * @return The index of the target if found, or -1 if it is not in the array
     */
    public static int search(int[] arr, int target) {
        // Loop through the array one element at a time
        for (int i = 0; i < arr.length; i++) {
            
            // Check if the current element matches our target
            if (arr[i] == target) {
                return i; // Target found! Return its position (index)
            }
        }
        
        // If the loop finishes and we haven't returned anything, 
        // it means the target wasn't in the array.
        return -1; 
    }

    public static void main(String[] args) {
        // 1. Set up an unsorted array of numbers
        int[] studentIDs = {45, 12, 89, 33, 72, 19, 99};

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

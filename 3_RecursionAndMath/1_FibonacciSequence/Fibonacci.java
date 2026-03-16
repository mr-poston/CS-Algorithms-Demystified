public class Fibonacci {

    /**
     * APPROACH 1: Naive Recursion
     * This is the mathematical, elegant way to write it.
     * However, it recalculates the same numbers over and over again!
     *
     * @param n The position in the Fibonacci sequence to find
     * @return The Fibonacci number at position n
     */
    public static long fibonacciNaive(int n) {
        // BASE CASES: The sequence starts with 0 and 1.
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        // RECURSIVE STEP: Add the previous two numbers together
        return fibonacciNaive(n - 1) + fibonacciNaive(n - 2);
    }

    /**
     * APPROACH 2: Memoization (Optimized Recursion)
     * We pass an array called a "cache" to remember the numbers we've already found.
     *
     * @param n     The position in the sequence
     * @param cache An array to store previously calculated answers
     * @return The Fibonacci number at position n
     */
    public static long fibonacciMemoized(int n, long[] cache) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        // CHECK THE CACHE: Have we already calculated this number?
        // If the array has something other than 0 at this index, we have!
        if (cache[n] != 0) {
            return cache[n]; // Return the saved answer immediately
        }

        // If we haven't calculated it yet, do the math...
        long answer = fibonacciMemoized(n - 1, cache) + fibonacciMemoized(n - 2, cache);
        
        // ...and SAVE it in the cache for next time before returning it!
        cache[n] = answer;
        
        return answer;
    }

    public static void main(String[] args) {
        // Let's try to find the 45th Fibonacci number.
        // (Warning: If you set this number much higher, the naive approach will freeze!)
        int n = 45; 

        System.out.println("Calculating the " + n + "th Fibonacci number...\n");

        // --- TEST 1: Memoized (Fast) ---
        long startTimeFast = System.currentTimeMillis();
        
        // We create a cache array slightly larger than 'n' to hold our saved answers
        long[] cache = new long[n + 1]; 
        long fastResult = fibonacciMemoized(n, cache);
        
        long endTimeFast = System.currentTimeMillis();
        
        System.out.println("✅ Memoized Result: " + fastResult);
        System.out.println("⚡ Time taken: " + (endTimeFast - startTimeFast) + " milliseconds\n");

        // --- TEST 2: Naive (Slow) ---
        System.out.println("Now trying the naive approach (this might take a few seconds)...");
        long startTimeSlow = System.currentTimeMillis();
        
        long slowResult = fibonacciNaive(n);
        
        long endTimeSlow = System.currentTimeMillis();
        
        System.out.println("🐢 Naive Result: " + slowResult);
        System.out.println("⏳ Time taken: " + (endTimeSlow - startTimeSlow) + " milliseconds");
    }
}

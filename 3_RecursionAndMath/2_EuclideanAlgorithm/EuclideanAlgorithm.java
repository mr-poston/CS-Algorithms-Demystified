public class EuclideanAlgorithm {

    /**
     * APPROACH 1: Recursive Approach
     * This perfectly mirrors the mathematical formula.
     *
     * @param a The first number
     * @param b The second number
     * @return The Greatest Common Divisor of a and b
     */
    public static int gcdRecursive(int a, int b) {
        // BASE CASE: If the remainder is 0, the other number is our GCD!
        if (b == 0) {
            return a;
        }
        
        // RECURSIVE STEP: Call the function again, but shift the numbers.
        // 'b' becomes the new 'a', and the remainder of 'a % b' becomes the new 'b'.
        return gcdRecursive(b, a % b);
    }

    /**
     * APPROACH 2: Iterative Approach (Using a loop)
     * Does the exact same math as the recursive version, but uses a while loop
     * instead of functions calling themselves. 
     *
     * @param a The first number
     * @param b The second number
     * @return The Greatest Common Divisor of a and b
     */
    public static int gcdIterative(int a, int b) {
        while (b != 0) {
            // Temporarily store the remainder
            int remainder = a % b; 
            
            // Shift the numbers
            a = b;
            b = remainder;
        }
        
        // When b hits 0, a holds the GCD
        return a; 
    }

    public static void main(String[] args) {
        // Let's find the GCD of 105 and 24 (like our floor tile analogy)
        int num1 = 105;
        int num2 = 24;

        System.out.println("Finding the GCD of " + num1 + " and " + num2 + "...\n");

        // Test the Recursive Method
        int recursiveResult = gcdRecursive(num1, num2);
        System.out.println("🔄 Recursive Result: " + recursiveResult);

        // Test the Iterative Method
        int iterativeResult = gcdIterative(num1, num2);
        System.out.println("🔁 Iterative Result: " + iterativeResult);
        
        // Let's try it with some massive numbers just to see how fast it is
        int massive1 = 2740;
        int massive2 = 1760;
        System.out.println("\nFinding the GCD of " + massive1 + " and " + massive2 + "...");
        System.out.println("Result: " + gcdRecursive(massive1, massive2));
    }
}

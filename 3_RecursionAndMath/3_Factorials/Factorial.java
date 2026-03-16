public class Factorial {

    /**
     * APPROACH 1: Iterative (Using a loop)
     * This is the standard, memory-efficient way to calculate a factorial.
     * Note: We use 'long' instead of 'int' because factorials get HUGE very quickly!
     *
     * @param n The number to calculate the factorial for
     * @return The factorial of n
     */
    public static long factorialIterative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorials are not defined for negative numbers.");
        }
        
        long result = 1; // Start at 1 because multiplying by 0 would ruin everything!
        
        // Loop from n down to 1, multiplying as we go
        for (int i = n; i > 0; i--) {
            result = result * i;
        }
        
        return result;
    }

    /**
     * APPROACH 2: Recursive (Functions calling themselves)
     * This is an elegant mathematical approach and a great introduction to recursion.
     *
     * @param n The number to calculate the factorial for
     * @return The factorial of n
     */
    public static long factorialRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorials are not defined for negative numbers.");
        }
        
        // BASE CASE: The factorial of 0 or 1 is simply 1.
        // This stops the recursion from going down into negative numbers forever!
        if (n == 0 || n == 1) {
            return 1;
        }
        
        // RECURSIVE STEP: Multiply n by the factorial of the number below it.
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        // Let's calculate 5! (which should be 120)
        int number = 5;

        System.out.println("Calculating the factorial of " + number + " (" + number + "!)\n");

        // Test the Iterative Method
        long iterativeResult = factorialIterative(number);
        System.out.println("🔁 Iterative Result: " + iterativeResult);

        // Test the Recursive Method
        long recursiveResult = factorialRecursive(number);
        System.out.println("🔄 Recursive Result: " + recursiveResult);
        
        // Let's demonstrate how fast these numbers grow!
        int bigNumber = 20;
        System.out.println("\nCalculating " + bigNumber + "! ...");
        System.out.println("Result: " + factorialIterative(bigNumber));
        
        // Try changing bigNumber to 21 or higher. 
        // You will see the result suddenly turn negative or completely wrong 
        // because it exceeds the maximum size a 'long' variable can hold!
    }
}

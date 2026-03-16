public class PalindromeChecker {

    /**
     * Checks if a string is a palindrome using the Two-Pointer Technique.
     * It ignores spaces, punctuation, and capitalization!
     *
     * @param text The string to check
     * @return true if it is a palindrome, false otherwise
     */
    public static boolean isPalindrome(String text) {
        // If the string is empty or just 1 character, it's technically a palindrome!
        if (text == null || text.length() <= 1) {
            return true;
        }

        // Set up our two pointers
        int left = 0;                          // Starts at the very beginning
        int right = text.length() - 1;         // Starts at the very end

        // Keep checking until the two pointers meet or cross in the middle
        while (left < right) {
            
            // 1. Skip over any non-letter/non-number characters from the left
            while (left < right && !Character.isLetterOrDigit(text.charAt(left))) {
                left++; // Take a step forward
            }
            
            // 2. Skip over any non-letter/non-number characters from the right
            while (left < right && !Character.isLetterOrDigit(text.charAt(right))) {
                right--; // Take a step backward
            }

            // 3. Grab the characters and convert them to lowercase so 'A' == 'a'
            char leftChar = Character.toLowerCase(text.charAt(left));
            char rightChar = Character.toLowerCase(text.charAt(right));

            // 4. Compare them! If they don't match, the whole thing is ruined.
            if (leftChar != rightChar) {
                return false; 
            }

            // 5. If they matched, move both pointers one step closer to the middle
            left++;
            right--;
        }

        // If the loop finishes and we never found a mismatch, it's a palindrome!
        return true;
    }

    public static void main(String[] args) {
        // Test 1: A simple, perfect palindrome
        String word1 = "racecar";
        System.out.println("Checking: '" + word1 + "'");
        System.out.println("Is Palindrome? " + isPalindrome(word1) + "\n");

        // Test 2: A messy real-world palindrome with spaces, capitals, and punctuation
        String phrase = "A man, a plan, a canal: Panama!";
        System.out.println("Checking: '" + phrase + "'");
        System.out.println("Is Palindrome? " + isPalindrome(phrase) + "\n");

        // Test 3: A standard word that is NOT a palindrome
        String word2 = "algorithm";
        System.out.println("Checking: '" + word2 + "'");
        System.out.println("Is Palindrome? " + isPalindrome(word2) + "\n");
        
        // Test 4: Numbers work too!
        String numbers = "12321";
        System.out.println("Checking: '" + numbers + "'");
        System.out.println("Is Palindrome? " + isPalindrome(numbers));
    }
}

public class CaesarCipher 
{

    /**
     * Encrypts a message using the Caesar Cipher technique.
     *
     * @param text  The secret message to encrypt
     * @param shift The number of spaces to shift the letters
     * @return The scrambled, encrypted message
     */
    public static String encrypt(String text, int shift) 
    {
        StringBuilder result = new StringBuilder();

        // 1. Normalize the shift. 
        // A shift of 28 is the exact same as a shift of 2 (because there are 26 letters).
        // This also elegantly handles negative shifts!
        shift = shift % 26;
        if (shift < 0) 
        {
            shift += 26; 
        }

        // 2. Loop through every single character in the message
        for (int i = 0; i < text.length(); i++) 
        {
            char currentChar = text.charAt(i);

            // 3. Check if the character is an uppercase letter
            if (Character.isUpperCase(currentChar)) 
            {
                // Shift the letter, wrap around if it goes past 'Z', and add it to our result
                char shiftedChar = (char) (((currentChar - 'A' + shift) % 26) + 'A');
                result.append(shiftedChar);
            } 
            // 4. Check if the character is a lowercase letter
            else if (Character.isLowerCase(currentChar)) 
            {
                // Shift the letter, wrap around if it goes past 'z', and add it to our result
                char shiftedChar = (char) (((currentChar - 'a' + shift) % 26) + 'a');
                result.append(shiftedChar);
            } 
            // 5. If it's a space, number, or punctuation mark, just leave it alone!
            else 
            {
                result.append(currentChar);
            }
        }

        return result.toString();
    }

    /**
     * Decrypts a Caesar Cipher message.
     * Fun fact: Decrypting is just encrypting in the opposite direction!
     *
     * @param text  The encrypted message
     * @param shift The key that was used to encrypt it
     * @return The original, readable message
     */
    public static String decrypt(String text, int shift) 
    {
        // Just pass a negative shift to our encrypt method!
        return encrypt(text, -shift); 
    }

    public static void main(String[] args) 
    {
        // Let's set up a secret message and a key
        String secretMessage = "Meet me at the library at 3:00 PM!";
        int key = 5;

        System.out.println("--- Caesar Cipher Encryption ---");
        System.out.println("Original:  " + secretMessage);
        System.out.println("Shift Key: " + key);
        System.out.println();

        // 1. Encrypt the message
        String encryptedMessage = encrypt(secretMessage, key);
        System.out.println("🔒 Encrypted: " + encryptedMessage);

        // 2. Decrypt the message back to normal
        String decryptedMessage = decrypt(encryptedMessage, key);
        System.out.println("🔓 Decrypted: " + decryptedMessage);
        
        System.out.println("\n--- Let's try to break a code! ---");
        String mysteriousCode = "Lipps, Asvph!";
        // If we know the shift was 4, we can read it:
        System.out.println("Code: " + mysteriousCode);
        System.out.println("Decoded: " + decrypt(mysteriousCode, 4));
    }
}

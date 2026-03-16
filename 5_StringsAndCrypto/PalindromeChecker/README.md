# 🔤 Palindrome Checker

A palindrome is a word, phrase, or sequence of numbers that reads the exact same forward and backward. Examples include "racecar," "kayak," or even "tacocat"!

To check if a string is a palindrome efficiently, we use the **Two-Pointer Technique**. Instead of creating a whole new reversed copy of the word (which wastes memory), we just point one finger at the first letter and one finger at the last letter, and slowly move them toward the middle.

### 🌎 The Real-World Analogy
Imagine a long hallway with paintings on both the left and right walls. You and a friend want to verify that the hallway is perfectly symmetrical. You stand at the very front door, and your friend stands at the very back door. You both call out the name of the painting next to you. If they match, you both take one step toward the middle and check the next ones. If you ever call out different paintings, the hallway isn't symmetrical. If you meet in the middle and everything matched, it's a perfect palindrome!

### ⏱️ Time Complexity (Big O)
* **Worst & Average Case: `O(N)`** - Where `N` is the length of the string. We only have to look at each character once. (Technically, we only look at half the characters, `N/2`, but in Big O notation, we drop the constants, so it remains `O(N)`).
* **Space Complexity: `O(1)`** - Because we are just using two tiny variables (pointers) to track our position, it uses almost zero extra memory, no matter how long the text is.

### ✅ When to Use It
* When you need to validate formatted text (like checking if a DNA sequence is symmetrical).
* When you want to learn the "Two-Pointer Technique," which is used in hundreds of more advanced algorithms.

### ❌ When NOT to Use It
* There really isn't a bad time to use this approach! It is the most time-efficient and memory-efficient way to solve this specific problem.

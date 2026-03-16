# 🧮 The Euclidean Algorithm (GCD)

The Euclidean Algorithm is a ridiculously fast way to find the Greatest Common Divisor (GCD) of two numbers. The GCD is the largest number that divides exactly into two or more numbers without leaving a remainder.

Instead of counting backward and checking every single number to see if it divides into both, this algorithm uses the remainder of division (`%` or modulo) to rapidly shrink the problem down.

The core logic is: `GCD(A, B) = GCD(B, A % B)`

### 🌎 The Real-World Analogy
Imagine you have a rectangular room that is 105 feet by 24 feet, and you want to tile it with the absolute largest square tiles possible without having to cut any tiles. 

1. You try putting down 24x24 tiles. You can fit four of them, but you are left with a 9x24 foot strip of empty floor.
2. Now, your new problem is just tiling that 9x24 strip. You try 9x9 tiles. You fit two, leaving a 6x9 foot empty strip.
3. Your new problem is the 6x9 strip. You try 6x6 tiles. You fit one, leaving a 3x6 strip.
4. You try 3x3 tiles. They fit perfectly with no leftover space! 

Because the 3x3 tiles filled the last gap perfectly, 3 is your Greatest Common Divisor.

### ⏱️ Time Complexity (Big O)
* **Worst Case: `O(log(min(A, B)))`** - This is incredibly fast. Even if you are finding the GCD of two numbers in the billions, this algorithm will usually find the answer in less than 50 steps.

### ✅ When to Use It
* When you need to simplify fractions (dividing the top and bottom by their GCD).
* When working with cryptography (like RSA encryption, which relies heavily on finding the GCD of massive prime numbers).

### ❌ When NOT to Use It
* There really isn't a scenario where you *wouldn't* use this to find the GCD. It is the gold standard for this specific math problem!

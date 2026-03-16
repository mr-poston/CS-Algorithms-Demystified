# 🧮 Factorials

The factorial of a whole number is the result of multiplying that number by every whole number below it, all the way down to 1. In math, it is written with an exclamation point: `n!`

For example: `5! = 5 * 4 * 3 * 2 * 1 = 120`

### 🌎 The Real-World Analogy
Imagine you are a photographer trying to line up 5 groomsmen for a wedding photo. How many different ways can you arrange them? 
* For the first spot, you have 5 people to choose from. 
* Once you place someone, you have 4 people left for the second spot. 
* Then 3 for the third spot, 2 for the fourth, and 1 for the last.
To find the total number of possible line-ups (permutations), you multiply those choices together: `5 * 4 * 3 * 2 * 1 = 120` different arrangements!

### ⏱️ Time Complexity (Big O)
* **Worst, Average, & Best Case: `O(N)`** - Whether you use a loop or recursion, the computer has to perform exactly `N` multiplications to get the answer.

### ✅ When to Use It
* When calculating permutations and combinations (like figuring out the odds of drawing a specific hand in poker).
* As a perfect, simple example to learn how recursive functions work.

### ❌ When NOT to Use It
* Be extremely careful calculating factorials of large numbers! Factorials grow so fast that they will quickly break the limits of standard integer variables (a concept called "Integer Overflow"). For example, `13!` is already too big to fit inside a standard 32-bit integer!

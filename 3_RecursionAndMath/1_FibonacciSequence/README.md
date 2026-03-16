# 🔁 Fibonacci Sequence

The Fibonacci sequence is a famous series of numbers where each number is the sum of the two numbers that came before it. It starts with 0 and 1. 
The sequence looks like this: 0, 1, 1, 2, 3, 5, 8, 13, 21...

In math, it is written as: $F_n = F_{n-1} + F_{n-2}$

### 🌎 The Real-World Analogy
Imagine you are a drone delivering packages, but you only have two battery settings: you can either fly forward 1 mile, or fly forward 2 miles. If you need to fly 5 miles, how many different combinations of 1-mile and 2-mile jumps can you take to get there? The answer follows the Fibonacci sequence!

### ⏱️ Time Complexity (Big O)
* **Naive Recursion (Worst Case): `O(2^N)`** - Extremely slow! Every time you ask for a number, the function splits into two more functions, which split into two more, creating a massive tree. Calculating the 50th number this way could take your computer years.
* **Memoized Recursion (Best Case): `O(N)`** - Lightning fast! By saving (caching) the answers we've already calculated, we never have to do the same math twice.

### ✅ When to Use It
* **Naive Recursion:** Only when you are first learning how functions can call themselves, or if you are calculating a very small number (like the 10th Fibonacci number).
* **Memoization:** Whenever you are writing a recursive function that calculates the same overlapping sub-problems multiple times.

### ❌ When NOT to Use It
* Never use naive, unoptimized recursion in a real-world application for large numbers. It will completely freeze your program!

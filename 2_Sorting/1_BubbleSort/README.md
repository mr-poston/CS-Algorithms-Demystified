# 🗂️ Bubble Sort

Bubble Sort is a straightforward sorting algorithm that repeatedly steps through the list, compares elements that are side-by-side, and swaps them if they are in the wrong order. 

The algorithm gets its name because the larger numbers "bubble" up to the top (the end of the array) with each pass, just like bubbles rising in a glass of soda.

### 🌎 The Real-World Analogy
Imagine a gym teacher telling a line of students to order themselves by height. The teacher points at the first two students. If the person on the left is taller than the person on the right, they swap places. The teacher then moves one step down the line and compares the next pair. They repeat this entire process over and over until they can walk down the whole line without needing to make a single swap.

### ⏱️ Time Complexity (Big O)
* **Worst & Average Case: `O(N^2)`** - If the list is completely backward, you have to compare and swap almost every single item, for every single item. This gets incredibly slow as the list grows!
* **Best Case: `O(N)`** - If the list is already sorted, our optimized version of Bubble Sort will just walk through it once, see that no swaps are needed, and finish immediately.

### ✅ When to Use It
* When you are first learning about sorting arrays.
* When your list is incredibly small.
* When you know the list is already mostly sorted and just need to double-check or fix a couple of items.

### ❌ When NOT to Use It
* Almost any real-world application with a large amount of data. Because of its `O(N^2)` time complexity, it will cause your program to lag significantly on big lists.

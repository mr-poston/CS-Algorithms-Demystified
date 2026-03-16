# 🗂️ Selection Sort

Selection Sort divides the list into two parts: a sorted section at the front and an unsorted section at the back. It repeatedly scans the unsorted section to find the absolute smallest (or largest) item, "selects" it, and swaps it into the correct position at the end of the sorted section.

### 🌎 The Real-World Analogy
Imagine you have a messy shelf of books and you want to order them by height. You scan every single book on the shelf to find the absolute shortest one. Once you find it, you pull it out and swap it with the first book on the shelf. Then, ignoring that first book, you scan all the remaining books to find the *next* shortest one, and swap it into the second spot. You keep doing this until the whole shelf is sorted.

### ⏱️ Time Complexity (Big O)
* **Worst, Average, & Best Case: `O(N^2)`** - Because it *always* scans the entire unsorted portion of the list to find the minimum value, it takes exactly the same amount of time whether the list is completely scrambled or already perfectly sorted!

### ✅ When to Use It
* When your list is very small.
* When **swapping items is extremely costly** for your computer's memory. While Selection Sort does a ton of comparing, it only makes a maximum of exactly *N* swaps. Bubble Sort, on the other hand, might make `O(N^2)` swaps!

### ❌ When NOT to Use It
* On large datasets.
* When your data is already mostly sorted. Because it always blindly scans the whole remaining list, it completely ignores the fact that the list might already be in order (making it much less efficient than Insertion Sort in these cases).

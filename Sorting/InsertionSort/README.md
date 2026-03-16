# 🗂️ Insertion Sort

Insertion Sort is a simple, intuitive algorithm that builds a final sorted list one item at a time. It works by taking an unsorted item, comparing it to the items that are already sorted, and sliding it into its exact correct position.

### 🌎 The Real-World Analogy
Imagine you are playing a card game and the dealer hands you cards one by one. You hold your sorted cards in your left hand. When the dealer gives you a new card in your right hand, you scan your left hand from right to left, find the exact spot where the new card belongs, and insert it. You repeat this until you are holding all the cards.

### ⏱️ Time Complexity (Big O)
* **Worst & Average Case: `O(N^2)`** - If the list is completely backward, you have to shift every single sorted item over to make room for every single new item. 
* **Best Case: `O(N)`** - If the list is already sorted, you just look at each item once, see it is already in the right spot, and move on.

### ✅ When to Use It
* When your dataset is small.
* When your data is **nearly sorted** already (Insertion Sort is incredibly fast at fixing just a few out-of-place items).
* When you are receiving data one piece at a time (like a live stream of numbers) and need to keep the list sorted as new data arrives.

### ❌ When NOT to Use It
* When you are dealing with large, highly randomized datasets. Just like Bubble Sort, the `O(N^2)` time complexity makes it much too slow for heavy-duty tasks.

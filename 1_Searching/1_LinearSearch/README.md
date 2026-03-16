# 🔍 Linear Search

Linear search is the simplest and most intuitive way to find an item in a list. It simply checks every single element, one by one, from start to finish until it finds what it's looking for.

### 🌎 The Real-World Analogy
Imagine you are looking for the Ace of Spades in a completely shuffled deck of cards. You flip over the top card—is it the Ace? If no, you flip the next one. You keep doing this one by one until you either find the Ace of Spades or run out of cards. 

### ⏱️ Time Complexity (Big O)
* **Worst Case: `O(N)`** - The item is at the very end of the list, or isn't in the list at all, meaning you had to check exactly *N* items.
* **Best Case: `O(1)`** - You get incredibly lucky and the item you want is the very first thing you check!

### ✅ When to Use It
* When your list is **unsorted** (the items are in random order).
* When your dataset is relatively small.
* When you only need to search the list once, so taking the time to sort it first wouldn't be worth the effort.

### ❌ When NOT to Use It
* When you have a massive dataset (like searching through a million usernames). 
* When you need to search the same dataset many times. In that case, it is much better to sort the data first and use a faster algorithm like **Binary Search**.

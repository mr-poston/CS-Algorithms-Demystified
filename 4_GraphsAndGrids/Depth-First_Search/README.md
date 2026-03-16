# 🗺️ Depth-First Search (DFS)

Depth-First Search is an algorithm that explores a map or a puzzle by going as far down a single path as it possibly can. When it finally hits a dead end, it "backtracks" to the last intersection and tries the next available path.

Unlike BFS, which searches level-by-level, DFS is aggressive. It dives straight to the bottom of the map before checking its immediate surroundings.

### 🌎 The Real-World Analogy
Imagine you are lost in a corn maze. A classic DFS strategy is to place your right hand on the wall and just start walking. You follow that specific wall as deep into the maze as it goes. If you hit a dead end, you keep your hand on the wall, turn around, and walk back (backtracking) until a new path opens up. You never check the path to your left until you have completely exhausted the path to your right.

### ⏱️ Time Complexity (Big O)
* **Worst Case: `O(V + E)`** - Just like BFS, `V` stands for Vertices (locations) and `E` stands for Edges (paths). In the worst case, you have to walk down every single path and check every single dead end before finding your target.

### ✅ When to Use It
* When you are solving puzzles that require making a sequence of choices (like Sudoku or a maze) and you just need to find *any* valid answer, not necessarily the shortest one.
* When you want to explore all possible paths in a game (like calculating all possible chess moves a few turns ahead).
* Because it usually uses recursion, the code is incredibly clean and short.

### ❌ When NOT to Use It
* **When you need the absolute shortest path.** DFS is notorious for finding a really long, winding path to a destination even if there was a straight shot right next to the starting line!
* When the map is infinitely large. Because DFS just keeps going deeper and deeper, it can get stuck walking down an infinite path and never backtrack to find the actual target.

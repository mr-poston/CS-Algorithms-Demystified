# 🗺️ Breadth-First Search (BFS)

Breadth-First Search is a way to explore a graph or a grid by radiating outward from your starting point. Instead of running down a single path as far as possible, BFS checks all of your immediate neighbors first. Then, it checks all of *their* neighbors, moving outward one layer (or "degree of separation") at a time.

Because it explores level by level, BFS is mathematically guaranteed to find the **shortest path** to your destination on an unweighted map!

### 🌎 The Real-World Analogy
Imagine spilling a bucket of water in the center of a tile floor. The water doesn't shoot out in one single, long line. Instead, it spreads outward in a growing circle. It covers all the tiles 1 foot away, then all the tiles 2 feet away, then 3 feet away. If you drop a coin somewhere on the floor, the water will eventually reach it, and the path the water took to get there is guaranteed to be the shortest possible route.

### ⏱️ Time Complexity (Big O)
* **Worst Case: `O(V + E)`** - `V` stands for Vertices (the locations or intersections) and `E` stands for Edges (the roads connecting them). In the worst-case scenario, you have to travel down every road and visit every location to find what you are looking for.

### ✅ When to Use It
* When you need to find the **shortest path** out of a maze or across a map.
* When you want to find out how people are connected on a social network (e.g., finding "Friends of Friends").
* Building AI for simple video games to make enemies chase the player.

### ❌ When NOT to Use It
* When roads have "weights" (like traffic jams or speed limits). BFS assumes every step takes the exact same amount of time. If some roads are slower than others, you need a more advanced algorithm like **Dijkstra's Algorithm**.
* When you have very limited computer memory. Because BFS has to remember every single location on the current "circle" before moving to the next one, the list of locations it needs to remember can get extremely large on huge maps.

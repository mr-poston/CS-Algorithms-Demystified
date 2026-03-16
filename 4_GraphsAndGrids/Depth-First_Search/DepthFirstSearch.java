import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DepthFirstSearch {

    /**
     * Performs a recursive Depth-First Search to find a target location.
     *
     * @param graph   A map representing locations and the places they connect to
     * @param current The location we are currently at
     * @param target  The location we are looking for
     * @param visited A set to remember where we've been (prevents infinite loops!)
     * @return true if we found the target, false if we hit a dead end
     */
    public static boolean search(Map<String, List<String>> graph, String current, String target, Set<String> visited) {
        
        System.out.println("👣 Exploring: " + current);

        // 1. BASE CASE: Did we find the target?
        if (current.equals(target)) {
            System.out.println("🎯 TARGET FOUND: " + target);
            return true;
        }

        // 2. Mark this location as visited so we don't walk in circles
        visited.add(current);

        // 3. Get all the paths extending from our current location
        List<String> neighbors = graph.getOrDefault(current, new ArrayList<>());

        // 4. RECURSIVE STEP: Dive down the very first unvisited path we see!
        for (String neighbor : neighbors) {
            
            // If we haven't been down this path yet...
            if (!visited.contains(neighbor)) {
                
                // Recursively call search to go deeper.
                // If this deep dive eventually finds the target, pass the 'true' back up the chain!
                if (search(graph, neighbor, target, visited)) {
                    return true;
                }
            }
        }

        // 5. If we check every neighbor and none of them lead to the target,
        // we have hit a dead end. Time to backtrack!
        System.out.println("🔙 Hit a dead end at " + current + ". Backtracking...");
        return false;
    }

    public static void main(String[] args) {
        // Let's build a maze map. 
        // Notice how we design it with dead ends to force DFS to backtrack.
        Map<String, List<String>> maze = new HashMap<>();
        
        maze.put("Start", List.of("Path A", "Path B"));
        maze.put("Path A", List.of("Start", "Dead End 1", "Dead End 2"));
        maze.put("Dead End 1", List.of("Path A"));
        maze.put("Dead End 2", List.of("Path A"));
        
        maze.put("Path B", List.of("Start", "Path C"));
        maze.put("Path C", List.of("Path B", "Treasure Room"));
        maze.put("Treasure Room", List.of("Path C"));

        System.out.println("--- Starting Depth-First Search ---");
        
        // We need an empty set to keep track of our footsteps
        Set<String> visitedLocations = new HashSet<>();
        
        // Begin the search!
        boolean found = search(maze, "Start", "Treasure Room", visitedLocations);
        
        if (!found) {
            System.out.println("❌ Could not find a way to the target.");
        }
    }
}

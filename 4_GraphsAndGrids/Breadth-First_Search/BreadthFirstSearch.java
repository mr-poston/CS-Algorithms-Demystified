import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class BreadthFirstSearch {

    /**
     * Performs a Breadth-First Search to find a target location in a graph.
     *
     * @param graph  A map representing locations and the places they connect to
     * @param start  The location we are starting at
     * @param target The location we are looking for
     * @return true if a path exists, false if it doesn't
     */
    public static boolean search(Map<String, List<String>> graph, String start, String target) {
        
        // A Queue (First-In, First-Out) keeps track of where we need to search next.
        // It ensures we check locations in the order we discovered them (level by level).
        Queue<String> queue = new LinkedList<>();
        
        // A Set keeps track of where we have already been so we don't get stuck in an infinite loop!
        Set<String> visited = new HashSet<>();

        // Add our starting location to the queue and mark it as visited
        queue.add(start);
        visited.add(start);

        System.out.println("Starting search from: " + start);

        // Keep searching as long as there are locations in our queue
        while (!queue.isEmpty()) {
            
            // 1. Take the first location out of the queue
            String currentLocation = queue.poll();
            System.out.println("👀 Currently checking: " + currentLocation);

            // 2. Is this the target we are looking for?
            if (currentLocation.equals(target)) {
                System.out.println("🎯 TARGET FOUND: " + target);
                return true;
            }

            // 3. If it's not the target, get all of its neighbors
            List<String> neighbors = graph.getOrDefault(currentLocation, new ArrayList<>());

            // 4. Add any unvisited neighbors to the back of the queue
            for (String neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor); // Mark as visited so we don't add it twice
                    queue.add(neighbor);   // Add to the queue to check later
                }
            }
        }

        // If the queue empties out and we never returned true, the target cannot be reached.
        System.out.println("❌ Target not found.");
        return false;
    }

    public static void main(String[] args) {
        // 1. Let's build a simple map of a small town using an Adjacency List.
        // The Key is a location, and the Value is a list of places you can drive to from there.
        Map<String, List<String>> townMap = new HashMap<>();
        
        townMap.put("Home", List.of("Park", "School"));
        townMap.put("Park", List.of("Home", "Grocery Store"));
        townMap.put("School", List.of("Home", "Library", "Post Office"));
        townMap.put("Grocery Store", List.of("Park", "Gas Station"));
        townMap.put("Library", List.of("School"));
        townMap.put("Post Office", List.of("School", "Gas Station"));
        townMap.put("Gas Station", List.of("Grocery Store", "Post Office"));

        System.out.println("--- Scenario 1: Searching for the Library ---");
        search(townMap, "Home", "Library");

        System.out.println("\n--- Scenario 2: Searching for a place that doesn't exist ---");
        search(townMap, "Home", "Movie Theater");
    }
}

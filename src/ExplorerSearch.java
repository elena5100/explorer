import java.util.ArrayList;
import java.util.List;

public class ExplorerSearch {

    /**
     * Returns how much land area an explorer can reach on a rectangular island.
     * 
     * The island is represented by a rectangular int[][] that contains
     * ONLY the following nunbers:
     * 
     * '0': represents the starting location of the explorer
     * '1': represents a field the explorer can walk through
     * '2': represents a body of water the explorer cannot cross
     * '3': represents a mountain the explorer cannot cross
     * 
     * The explorer can move one square at a time: up, down, left, or right.
     * They CANNOT move diagonally.
     * They CANNOT move off the edge of the island.
     * They CANNOT move onto a a body of water or mountain.
     * 
     * This method should return the total number of spaces the explorer is able
     * to reach from their starting location. It should include the starting
     * location of the explorer.
     * 
     * For example
     * 
     * @param island the locations on the island
     * @return the number of spaces the explorer can reach
     */
    public static int reachableArea(int[][] island) {
        // Implement your method here!
        // Please also make more test cases
        // I STRONGLY RECOMMEND testing some helpers you might make too
    
    int[] start = findExplorer(island);
    boolean[][] visited = new boolean[island.length][island[0].length];
    return reachableArea(island, start, visited);
        }
     public static int reachableArea(int[][] island, int[] current, boolean[][] visited) {
     int r = current[0];
     int c = current[1];

     if (r < 0 || r >= island.length || c < 0 || c >= island[0].length) return 0;

     // already visited
     if (visited[r][c]) return 0;

    int value = island[r][c];
    if (value != 0 && value != 1) return 0;

    visited[r][c] = true; 
    int count = 1; 

    // explore neighbors
    List<int[]> moves = getMoves(island, r, c);
    for (int[] next : moves) {
        count += reachableArea(island, next, visited); 
    }

    return count;

}
    public static int[] findExplorer(int[][] island) {
        for (int r = 0; r < island.length; r++) {
            for (int c = 0; c < island[0].length; c++) {
                if (island[r][c] == 0) {
                    return new int[]{r, c};
                }
            }
        }
        throw new IllegalArgumentException("Explorer not found");
    }

    }


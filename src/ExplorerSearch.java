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
    
    public static int reachableArea(int[][]locationsOnTheIsland ) {
        int[] start = findExplorer(locationsOnTheIsland);
        boolean[][] visited = new boolean[locationsOnTheIsland.length][locationsOnTheIsland[0].length];
        return countReachable(locationsOnTheIsland, start, visited);
    }

    public static boolean dfs(int[][] locationsOnTheIsland, int[] current, boolean[][] visited) {
        int row = current[0];
        int col = current[1];
    
        if (locationsOnTheIsland[row][col] == 9) 
        
        return true;
    
        if (visited[row][col]) 
        
        return false;
    
        visited[row][col] = true;
    
        // try all valid moves
        List<int[]> moves = possibleMoves(locationsOnTheIsland, current);
        for (int[] next : moves) {
            if (dfs(locationsOnTheIsland, next, visited)) {
                return true;
            }
        }
        return false; 
    
    }
}

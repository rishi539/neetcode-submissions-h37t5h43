class Solution {
    public int maxAreaOfIsland(int[][] grid) {
      int max= 0;
 
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                
                if (grid[i][j] == 1) {
                    int area=dfs(grid, i, j);
                     max=Math.max(area,max);
                    
                }
            }
        }

        return max;
    }

    private int dfs(int[][] grid, int i, int j) {
        // boundary check
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length 
            || grid[i][j] == 0) {
             return 0;
        }

        // mark visited
        grid[i][j] = 0;

        // explore all 4 directions
        return 1+ dfs(grid, i + 1, j)// down
       +dfs(grid, i - 1, j) // up
        +dfs(grid, i, j + 1) // right
        +dfs(grid, i, j - 1); // left
    }
}
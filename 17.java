class Solution {
    public int numIslands(char[][] grid) {
        int result = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int k = 0; k < grid[i].length; k++) {
                if(grid[i][k] == '1') {
                    result++;
                    grid = flood(grid, i, k);
                }
            }
        }
        return result;
    }
    
    char[][] flood(char[][] grid, int i, int k) {
        grid[i][k] = '0';
        if(k < grid[i].length-1 && grid[i][k+1] == '1') {
            grid = flood(grid, i, k+1);
        }
        if(k > 0 && grid[i][k-1] == '1') {
            grid = flood(grid, i, k-1);
        }
        if(i < grid.length-1 && grid[i+1][k] == '1') {
            grid = flood(grid, i+1, k);
        }
        if(i > 0 && grid[i-1][k] == '1') {
            grid = flood(grid, i-1, k);
        }
        return grid;
    }
}